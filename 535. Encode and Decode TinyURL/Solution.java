public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        return "http://tinyurl.com/" + longUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortUrl.substring(19);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));