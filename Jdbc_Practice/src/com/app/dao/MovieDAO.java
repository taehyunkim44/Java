package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dto.MovieDTO;

public class MovieDAO {
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;

	// 영화 정보 저장
	public void insertMovie(MovieDTO movieDTO) {
		String query = "INSERT INTO movies (id, title, director, genre, release_year) VALUES (movie_id_seq.NEXTVAL, ?, ?, ?, ?)";

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, movieDTO.getTitle());
			preparedStatement.setString(2, movieDTO.getDirector());
			preparedStatement.setString(3, movieDTO.getGenre());
			preparedStatement.setString(4, movieDTO.getReleaseYear());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insertMovie() SQL 오류!");
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 영화 정보 수정
	public void updateMovie(MovieDTO movieDTO) {
		String query = "UPDATE movies SET title = ?, director = ?, genre = ?, release_year = ? WHERE id = ?";

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, movieDTO.getTitle());
			preparedStatement.setString(2, movieDTO.getDirector());
			preparedStatement.setString(3, movieDTO.getGenre());
			preparedStatement.setString(4, movieDTO.getReleaseYear());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("updateMovie() SQL 오류!");
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 영화 정보 삭제
	public boolean deleteMovie(String title) {
		String query = "DELETE FROM movies WHERE title = ?";
		int result = 0;

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, title);

			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("deleteMovie() SQL 오류!");
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result > 0;
	}

	// 모든 영화 정보 조회
	public List<MovieDTO> getAllMovies() {
		List<MovieDTO> movies = new ArrayList<>();
		String query = "SELECT * FROM movies";

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				MovieDTO movieDTO = new MovieDTO();
				movieDTO.setId(resultSet.getInt(1));
				movieDTO.setTitle(resultSet.getString(2));
				movieDTO.setDirector(resultSet.getString(3));
				movieDTO.setGenre(resultSet.getString(4));
				movieDTO.setReleaseYear(resultSet.getString(5));
				movies.add(movieDTO);
			}
		} catch (SQLException e) {
			System.out.println("getAllMovies() SQL 오류!");
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return movies;
	}

	// 특정 장르의 영화 조회
	public List<MovieDTO> getMoviesByGenre(String genre) {
		List<MovieDTO> movies = new ArrayList<>();
		String query = "SELECT * FROM movies WHERE genre = ?";

		try {
			connection = DBConnecter.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, genre);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				MovieDTO movieDTO = new MovieDTO();
				movieDTO.setId(resultSet.getInt(1));
				movieDTO.setTitle(resultSet.getString(2));
				movieDTO.setDirector(resultSet.getString(3));
				movieDTO.setGenre(resultSet.getString(4));
				movieDTO.setReleaseYear(resultSet.getString(5));
				movies.add(movieDTO);
			}
		} catch (SQLException e) {
			System.out.println("getMoviesByGenre() SQL 오류!");
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return movies;
	}

}
