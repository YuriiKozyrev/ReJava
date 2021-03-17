SELECT 
    PreviousMovie.movie_title AS 'фильм1',
    PreviousMovie.movie_start_time AS 'время начала',
    PreviousMovie.duration AS 'длительность',
    NextMovie.movie_start_time AS 'время начала второго фильма',
    TIMEDIFF(NextMovie.movie_start_time, (PreviousMovie.duration + PreviousMovie.movie_start_time)) AS PauseBetweenMovies
FROM
    (SELECT 
        session_id, movie_start_time, movie_title, duration
    FROM
        cinema.schedule_tbl
    JOIN cinema.movies_tbl USING (movie_id)) AS PreviousMovie
        JOIN
    (SELECT 
        session_id, movie_start_time, movie_title, duration
    FROM
        cinema.schedule_tbl
    JOIN cinema.movies_tbl USING (movie_id)) AS NextMovie
WHERE
    NextMovie.session_id - PreviousMovie.session_id = 1
AND TIME(NextMovie.movie_start_time - PreviousMovie.movie_start_time - PreviousMovie.duration) > 0
ORDER BY PauseBetweenMovies ASC;