package com.app.test;

import java.util.List;
import java.util.Scanner;

import com.app.dao.MovieDAO;
import com.app.dto.MovieDTO;

public class MovieTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieDAO movieDAO = new MovieDAO();

        System.out.println("영화 정보 관리 시스템");

        while (true) {
            System.out.println("\n메뉴를 선택하세요:");
            System.out.println("1. 영화 정보 추가");
            System.out.println("2. 영화 정보 수정");
            System.out.println("3. 영화 정보 삭제");
            System.out.println("4. 모든 영화 정보 조회");
            System.out.println("5. 특정 장르의 영화 조회");
            System.out.println("6. 종료");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.println("새로운 영화 정보를 입력하세요:");
                    System.out.print("제목: ");
                    String title = scanner.nextLine();
                    System.out.print("감독: ");
                    String director = scanner.nextLine();
                    System.out.print("장르: ");
                    String genre = scanner.nextLine();
                    System.out.print("개봉 연도: ");
                    String releaseYear = scanner.nextLine();
                    scanner.nextLine();  

                    MovieDTO newMovie = new MovieDTO();
                    newMovie.setTitle(title);
                    newMovie.setDirector(director);
                    newMovie.setGenre(genre);
                    newMovie.setReleaseYear(releaseYear);

                    movieDAO.insertMovie(newMovie);
                    System.out.println("영화 정보가 추가되었습니다.");
                    break;
                case 2:
                	System.out.print("수정할 영화 ID를 입력하세요: ");
                    int movieId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("수정할 영화명: ");
                    String updatedTitle = scanner.nextLine();
                    System.out.print("수정할 감독명: ");
                    String updatedDirector = scanner.nextLine();
                    System.out.print("수정할 장르명: ");
                    String updatedGenre = scanner.nextLine();
                    System.out.print("수정할 개봉일: ");
                    String updatedReleaseYear = scanner.nextLine();

                    MovieDTO updatedMovie = new MovieDTO();
                    updatedMovie.setTitle(updatedTitle);
                    updatedMovie.setDirector(updatedDirector);
                    updatedMovie.setGenre(updatedGenre);
                    updatedMovie.setReleaseYear(updatedReleaseYear);
                    movieDAO.updateMovie(updatedMovie);
                    System.out.println("주문이 수정되었습니다.");
                    break;   
                case 3:
                    System.out.print("삭제할 영화 제목을 입력하세요: ");
                    String deleteTitle = scanner.nextLine();
                    movieDAO.deleteMovie(deleteTitle);
                    System.out.println("영화 정보가 삭제되었습니다.");
                    break;
                case 4:
                    List<MovieDTO> allMovies = movieDAO.getAllMovies();
                    System.out.println("모든 영화 정보:");
                    for (MovieDTO movie : allMovies) {
                        System.out.println(movie);
                    }
                    break;
                case 5:
                    System.out.print("조회할 장르를 입력하세요: ");
                    String searchGenre = scanner.nextLine();
                    List<MovieDTO> genreMovies = movieDAO.getMoviesByGenre(searchGenre);
                    if (genreMovies.isEmpty()) {
                        System.out.println("해당 장르의 영화를 찾을 수 없습니다.");
                    } else {
                        System.out.println(searchGenre + " 장르의 영화 정보:");
                        for (MovieDTO movie : genreMovies) {
                            System.out.println(movie);
                        }
                    }
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                    break;
            }
        }
    }

}
