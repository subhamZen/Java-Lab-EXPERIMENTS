class Movie {
    String title;
    String director;
    String actor;
    String reviews;

    Movie(String t, String d, String a) {
        title = t;
        director = d;
        actor = a;
        reviews = "";
    }

    void addReview(String review) {
        reviews = reviews + review + "\n";
    }

    String getReviews() {
        return reviews;
    }

    public static void main(String args[]) {
        Movie m1 = new Movie("RRR", "S. S. Rajamouli", "Ram Charan");

        m1.addReview("Very good movie");
        m1.addReview("Amazing story");

        System.out.println("Title: " + m1.title);
        System.out.println("Director: " + m1.director);
        System.out.println("Actor: " + m1.actor);
        System.out.println("Reviews:");
        System.out.println(m1.getReviews());
    }
}