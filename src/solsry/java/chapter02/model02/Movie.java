package solsry.java.chapter02.model02;

public class Movie {
    public String mtitle;
    public String director;
    public String year;
    public String country;

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "mtitle='" + mtitle + '\'' +
                ", director='" + director + '\'' +
                ", year='" + year + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public Movie(String mtitle, String director, String year, String country) {
        this.mtitle = mtitle;
        this.director = director;
        this.year = year;
        this.country = country;
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
