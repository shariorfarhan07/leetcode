//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.*;
//import java.util.stream.Collectors;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
//
//// __define-ocg__
//// This class fetches posts from an API and formats the output.
//public class PostFetcher {
//
//    // Function 1: Fetch posts from the API
//    public static List<Post> fetchPosts() {
//        List<Post> posts = new ArrayList<>();
//        try {
//            // Send a GET request to the API
//            URL url = new URL("http://coderbyte.com/api/challenges/json/all-posts");
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//
//            // Read the response
//            try (BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
//                JsonArray jsonArray = JsonParser.parseReader(in).getAsJsonArray();
//                for (var element : jsonArray) {
//                    JsonObject jsonObject = element.getAsJsonObject();
//                    Post post = new Post(
//                            jsonObject.get("userId").getAsInt(),
//                            jsonObject.get("id").getAsInt(),
//                            jsonObject.get("title").getAsString(),
//                            jsonObject.get("body").getAsString(),
//                            jsonObject.get("created_at").getAsString()
//                    );
//                    posts.add(post);
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return posts; // Return the list of Post objects
//    }
//
//    // Function 2: Format posts to summarize the number of posts by user
//    public static List<Map<String, Object>> formatPosts() {
//        // Fetch posts and count the number of posts for each userId
//        Map<Integer, Long> userPostCount = fetchPosts().stream()
//                .collect(Collectors.groupingBy(Post::getUserId, Collectors.counting()));
//
//        // Prepare and sort the final output list
//        return userPostCount.entrySet().stream()
//                .map(entry -> Map.of("userId", entry.getKey(), "numberOfPosts", entry.getValue()))
//                .sorted((a, b) -> {
//                    int compare = Long.compare((Long) b.get("numberOfPosts"), (Long) a.get("numberOfPosts"));
//                    return compare == 0 ? Integer.compare((Integer) b.get("userId"), (Integer) a.get("userId")) : compare;
//                })
//                .collect(Collectors.toList());
//    }
//
//    public static void main(String[] args) {
//        // Call the formatPosts function and print the results
//        List<Map<String, Object>> result = formatPosts();
//        System.out.println(result);
//    }
//
//    // Static inner class for Post
//    static class Post {
//        private final int userId;
//        private final int id;
//        private final String title;
//        private final String body;
//        private final String createdAt;
//
//        public Post(int userId, int id, String title, String body, String createdAt) {
//            this.userId = userId;
//            this.id = id;
//            this.title = title;
//            this.body = body;
//            this.createdAt = createdAt;
//        }
//
//        public int getUserId() {
//            return userId;
//        }
//
//        public int getId() {
//            return id;
//        }
//    }
//}
