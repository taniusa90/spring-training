package com.cydeo;

import com.cydeo.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryDemo implements CommandLineRunner {

    private final TicketRepository ticketRepository;
    private final AccountRepository accountRepository;
    private final CinemaRepository cinemaRepository;
    private final GenreRepository genreRepository;
    private final MovieRepository movieRepository;
    private final MovieCinemaRepository movieCinemaRepository;
    private final UserRepository userRepository;


    public QueryDemo(TicketRepository ticketRepository, AccountRepository accountRepository, CinemaRepository cinemaRepository, GenreRepository genreRepository, MovieRepository movieRepository, MovieCinemaRepository movieCinemaRepository, UserRepository userRepository) {
        this.ticketRepository = ticketRepository;
        this.accountRepository = accountRepository;
        this.cinemaRepository = cinemaRepository;
        this.genreRepository = genreRepository;
        this.movieRepository = movieRepository;
        this.movieCinemaRepository = movieCinemaRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
       // System.out.println("--------------ACCOUNT------------------");
       // System.out.println(accountRepository.findByCountryAndState("United States","Kentucky"));
       // System.out.println(accountRepository.findByAgeLessThanEqual(35));
       // System.out.println(accountRepository.findByRole(UserRole.USER));
       // System.out.println(accountRepository.findByAgeBetween(28, 47));
        //System.out.println(accountRepository.findByAddressContaining("Logan"));
       // System.out.println(accountRepository.findByOrderByAge());
        //System.out.println(accountRepository.retrieveAllAccounts());
        //System.out.println(accountRepository.retrieveAllAdminAccounts(UserRole.ADMIN));
        //System.out.println(accountRepository.sortAllAccountsWithAge());
        //System.out.println(accountRepository.readAllAccountsWithLowerAge(35));
        //System.out.println(accountRepository.readAllAccountsThatContains());
       // System.out.println(accountRepository.readAllWithHigherAge(35));

       // System.out.println("--------------CINEMA------------------");
        //System.out.println(cinemaRepository.findCinemaByName("Hall 1 - EMPIRE"));
        //System.out.println(cinemaRepository.findTopBySponsoredNameContaining("McDonald"));
       // System.out.println(cinemaRepository.findByLocation_Country("United States"));
        //System.out.println(cinemaRepository.findCinemaByNameOrSponsoredName("Hall 1 - EMPIRE", "Kodak"));
       // System.out.println(cinemaRepository.retrieveCinemaByName(1L));
        //System.out.println(cinemaRepository.readAllCinemaByLocationCountry("United States"));
        //System.out.println(cinemaRepository.readAllCinemaByNameOrSponsoredName("Hall 1 - EMPIRE", "Kodak"));
       // System.out.println(cinemaRepository.sortCinemaByName());
        //System.out.println(cinemaRepository.distinctAllCinemaBySponsoredName());

        //System.out.println("--------------Genre------------------");
       // System.out.println(genreRepository.retrieveAllGenres());
       // System.out.println(genreRepository.retrieveGenreByContainingName("Mystery"));

        //System.out.println("--------------MovieCinema------------------");

        //System.out.println(movieCinemaRepository.findMovieCinemaById(2L));
        // System.out.println(movieCinemaRepository.countMovieCinemaByCinemaId(12L));
        //System.out.println(movieCinemaRepository.countMovieCinemaByMovieId(7L));2020-12-05 20:00:00.000000
        //System.out.println(movieCinemaRepository.findMovieCinemasByDateTimeGreaterThan(LocalDateTime.of(2020,12,05,20,00,00,000000)));
       // System.out.println(movieCinemaRepository.findTop3ByMovie_Price());
       // System.out.println(movieCinemaRepository.findMovieCinemasByMovie_NameContaining("The Gentleman"));
        //System.out.println(movieCinemaRepository.findMovieCinemasByCinema_Location_Name("AMC 34th Street 14"));
       // System.out.println(movieCinemaRepository.listAllMovieCinema(LocalDateTime.of(2020, 12, 05, 20, 00, 00, 000000)));
       // System.out.println(movieCinemaRepository.countAll(7L));
        //System.out.println(movieCinemaRepository.returnAllMovieCinemas("AMC 34th Street 14"));

       // System.out.println("--------------Movie------------------");
        //System.out.println(movieRepository.readAllByName("The Gentleman"));
        //System.out.println(movieRepository.findMovieByPriceBetween(BigDecimal.valueOf(15),BigDecimal.valueOf(20)));
        //System.out.println(movieRepository.findAllByDurationIn(List.of(100,181)));
        //System.out.println(movieRepository.findByReleaseDateGreaterThan(LocalDate.of(1972, 03, 24)));
        //System.out.println(movieRepository.findByStateAndType(MovieState.DRAFT, MovieType.PREMIER));
       // System.out.println(movieRepository.listAllMovies(BigDecimal.valueOf(35), BigDecimal.valueOf(48)));
        //System.out.println(movieRepository.returnsAllMovieByNames());
        //System.out.println(movieRepository.returnsMovieByName("A Beautiful Mind"));
        //System.out.println(movieRepository.returnListOfMovie(BigDecimal.valueOf(15), BigDecimal.valueOf(28)));
        //System.out.println(movieRepository.returnAllMovieByDuration(100));
        //System.out.println(movieRepository.retrieveExpensiveMovies());

        //System.out.println("--------------Ticket------------------");

       // System.out.println(ticketRepository.countTicketByUserAccount_Username("josieStory"));
       // System.out.println(ticketRepository.findTicketByUserAccount_Email("josie_story@email.com"));
       // System.out.println(ticketRepository.countTicketByMovieCinemaId(1L));
        //System.out.println(ticketRepository.findTicketByDateTimeBetween(LocalDateTime.of(2020, 12, 05, 20, 00, 00, 000000), LocalDateTime.of(2020, 12, 8, 19, 00, 00, 000000)));
        //System.out.println(ticketRepository.allTicketsBoughtByUser(1L));
       // System.out.println(ticketRepository.allTicketsBetweenDates(LocalDateTime.of(2020, 12, 05, 20, 00, 00, 000000), LocalDateTime.of(2020, 12, 8, 19, 00, 00, 000000)));
        //System.out.println(ticketRepository.countNumberOfTickets(1L));
       // System.out.println(ticketRepository.countNumberOfTicketsSpecificDates(1L, LocalDateTime.of(2020, 12, 05, 20, 00, 00, 000000), LocalDateTime.of(2020, 12, 8, 19, 00, 00, 000000)));
       // System.out.println(ticketRepository.distinctAllTicketsByName("The Gentleman"));
        //System.out.println(ticketRepository.findAllTicketsByUserEmail("josie_story@email.com"));
        //System.out.println(ticketRepository.returnAllTickets());

        System.out.println("--------------User------------------");
        //System.out.println(userRepository.readUserByEmail("josie_story@email.com"));
        //System.out.println(userRepository.readUserByUsername("josieStory"));
        //System.out.println(userRepository.findUsersByAccountNameContains("Josie D Story"));
        //System.out.println(userRepository.findUsersByAccount_NameContainingIgnoreCase("josie d story"));
       // System.out.println(userRepository.findUsersByAccountAgeGreaterThan(28));
        //System.out.println(userRepository.returnAllUserByEmail("josie_story@email.com"));
        //System.out.println(userRepository.readUserByUsername("josieStory"));
        //System.out.println(userRepository.readAllUsers());
       // System.out.println(userRepository.readAllByNative());


    }
}
