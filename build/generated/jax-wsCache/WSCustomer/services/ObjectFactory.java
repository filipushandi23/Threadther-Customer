
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllScheduleByMovieId_QNAME = new QName("http://WS/", "getAllScheduleByMovieId");
    private final static QName _GetAllScheduleByMovieIdResponse_QNAME = new QName("http://WS/", "getAllScheduleByMovieIdResponse");
    private final static QName _GetComingSoonMovies_QNAME = new QName("http://WS/", "getComingSoonMovies");
    private final static QName _GetComingSoonMoviesResponse_QNAME = new QName("http://WS/", "getComingSoonMoviesResponse");
    private final static QName _GetCustomer_QNAME = new QName("http://WS/", "getCustomer");
    private final static QName _GetCustomerResponse_QNAME = new QName("http://WS/", "getCustomerResponse");
    private final static QName _GetMovieById_QNAME = new QName("http://WS/", "getMovieById");
    private final static QName _GetMovieByIdResponse_QNAME = new QName("http://WS/", "getMovieByIdResponse");
    private final static QName _GetSeatByStudioNumber_QNAME = new QName("http://WS/", "getSeatByStudioNumber");
    private final static QName _GetSeatByStudioNumberResponse_QNAME = new QName("http://WS/", "getSeatByStudioNumberResponse");
    private final static QName _GetShowingMovies_QNAME = new QName("http://WS/", "getShowingMovies");
    private final static QName _GetShowingMoviesResponse_QNAME = new QName("http://WS/", "getShowingMoviesResponse");
    private final static QName _GetStudioByStudioNumber_QNAME = new QName("http://WS/", "getStudioByStudioNumber");
    private final static QName _GetStudioByStudioNumberResponse_QNAME = new QName("http://WS/", "getStudioByStudioNumberResponse");
    private final static QName _GetUserByEmail_QNAME = new QName("http://WS/", "getUserByEmail");
    private final static QName _GetUserByEmailResponse_QNAME = new QName("http://WS/", "getUserByEmailResponse");
    private final static QName _InsertAsCustomer_QNAME = new QName("http://WS/", "insertAsCustomer");
    private final static QName _InsertAsCustomerResponse_QNAME = new QName("http://WS/", "insertAsCustomerResponse");
    private final static QName _Login_QNAME = new QName("http://WS/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://WS/", "loginResponse");
    private final static QName _Register_QNAME = new QName("http://WS/", "register");
    private final static QName _RegisterResponse_QNAME = new QName("http://WS/", "registerResponse");
    private final static QName _TopUp_QNAME = new QName("http://WS/", "topUp");
    private final static QName _TopUpResponse_QNAME = new QName("http://WS/", "topUpResponse");
    private final static QName _UpdateUser_QNAME = new QName("http://WS/", "updateUser");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://WS/", "updateUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllScheduleByMovieId }
     * 
     */
    public GetAllScheduleByMovieId createGetAllScheduleByMovieId() {
        return new GetAllScheduleByMovieId();
    }

    /**
     * Create an instance of {@link GetAllScheduleByMovieIdResponse }
     * 
     */
    public GetAllScheduleByMovieIdResponse createGetAllScheduleByMovieIdResponse() {
        return new GetAllScheduleByMovieIdResponse();
    }

    /**
     * Create an instance of {@link GetComingSoonMovies }
     * 
     */
    public GetComingSoonMovies createGetComingSoonMovies() {
        return new GetComingSoonMovies();
    }

    /**
     * Create an instance of {@link GetComingSoonMoviesResponse }
     * 
     */
    public GetComingSoonMoviesResponse createGetComingSoonMoviesResponse() {
        return new GetComingSoonMoviesResponse();
    }

    /**
     * Create an instance of {@link GetCustomer }
     * 
     */
    public GetCustomer createGetCustomer() {
        return new GetCustomer();
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link GetMovieById }
     * 
     */
    public GetMovieById createGetMovieById() {
        return new GetMovieById();
    }

    /**
     * Create an instance of {@link GetMovieByIdResponse }
     * 
     */
    public GetMovieByIdResponse createGetMovieByIdResponse() {
        return new GetMovieByIdResponse();
    }

    /**
     * Create an instance of {@link GetSeatByStudioNumber }
     * 
     */
    public GetSeatByStudioNumber createGetSeatByStudioNumber() {
        return new GetSeatByStudioNumber();
    }

    /**
     * Create an instance of {@link GetSeatByStudioNumberResponse }
     * 
     */
    public GetSeatByStudioNumberResponse createGetSeatByStudioNumberResponse() {
        return new GetSeatByStudioNumberResponse();
    }

    /**
     * Create an instance of {@link GetShowingMovies }
     * 
     */
    public GetShowingMovies createGetShowingMovies() {
        return new GetShowingMovies();
    }

    /**
     * Create an instance of {@link GetShowingMoviesResponse }
     * 
     */
    public GetShowingMoviesResponse createGetShowingMoviesResponse() {
        return new GetShowingMoviesResponse();
    }

    /**
     * Create an instance of {@link GetStudioByStudioNumber }
     * 
     */
    public GetStudioByStudioNumber createGetStudioByStudioNumber() {
        return new GetStudioByStudioNumber();
    }

    /**
     * Create an instance of {@link GetStudioByStudioNumberResponse }
     * 
     */
    public GetStudioByStudioNumberResponse createGetStudioByStudioNumberResponse() {
        return new GetStudioByStudioNumberResponse();
    }

    /**
     * Create an instance of {@link GetUserByEmail }
     * 
     */
    public GetUserByEmail createGetUserByEmail() {
        return new GetUserByEmail();
    }

    /**
     * Create an instance of {@link GetUserByEmailResponse }
     * 
     */
    public GetUserByEmailResponse createGetUserByEmailResponse() {
        return new GetUserByEmailResponse();
    }

    /**
     * Create an instance of {@link InsertAsCustomer }
     * 
     */
    public InsertAsCustomer createInsertAsCustomer() {
        return new InsertAsCustomer();
    }

    /**
     * Create an instance of {@link InsertAsCustomerResponse }
     * 
     */
    public InsertAsCustomerResponse createInsertAsCustomerResponse() {
        return new InsertAsCustomerResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link TopUp }
     * 
     */
    public TopUp createTopUp() {
        return new TopUp();
    }

    /**
     * Create an instance of {@link TopUpResponse }
     * 
     */
    public TopUpResponse createTopUpResponse() {
        return new TopUpResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Admin }
     * 
     */
    public Admin createAdmin() {
        return new Admin();
    }

    /**
     * Create an instance of {@link Cashier }
     * 
     */
    public Cashier createCashier() {
        return new Cashier();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link ScheduleId }
     * 
     */
    public ScheduleId createScheduleId() {
        return new ScheduleId();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link Studio }
     * 
     */
    public Studio createStudio() {
        return new Studio();
    }

    /**
     * Create an instance of {@link Cinema }
     * 
     */
    public Cinema createCinema() {
        return new Cinema();
    }

    /**
     * Create an instance of {@link Seat }
     * 
     */
    public Seat createSeat() {
        return new Seat();
    }

    /**
     * Create an instance of {@link SeatId }
     * 
     */
    public SeatId createSeatId() {
        return new SeatId();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link TicketId }
     * 
     */
    public TicketId createTicketId() {
        return new TicketId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllScheduleByMovieId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getAllScheduleByMovieId")
    public JAXBElement<GetAllScheduleByMovieId> createGetAllScheduleByMovieId(GetAllScheduleByMovieId value) {
        return new JAXBElement<GetAllScheduleByMovieId>(_GetAllScheduleByMovieId_QNAME, GetAllScheduleByMovieId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllScheduleByMovieIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getAllScheduleByMovieIdResponse")
    public JAXBElement<GetAllScheduleByMovieIdResponse> createGetAllScheduleByMovieIdResponse(GetAllScheduleByMovieIdResponse value) {
        return new JAXBElement<GetAllScheduleByMovieIdResponse>(_GetAllScheduleByMovieIdResponse_QNAME, GetAllScheduleByMovieIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComingSoonMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getComingSoonMovies")
    public JAXBElement<GetComingSoonMovies> createGetComingSoonMovies(GetComingSoonMovies value) {
        return new JAXBElement<GetComingSoonMovies>(_GetComingSoonMovies_QNAME, GetComingSoonMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComingSoonMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getComingSoonMoviesResponse")
    public JAXBElement<GetComingSoonMoviesResponse> createGetComingSoonMoviesResponse(GetComingSoonMoviesResponse value) {
        return new JAXBElement<GetComingSoonMoviesResponse>(_GetComingSoonMoviesResponse_QNAME, GetComingSoonMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getCustomer")
    public JAXBElement<GetCustomer> createGetCustomer(GetCustomer value) {
        return new JAXBElement<GetCustomer>(_GetCustomer_QNAME, GetCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getCustomerResponse")
    public JAXBElement<GetCustomerResponse> createGetCustomerResponse(GetCustomerResponse value) {
        return new JAXBElement<GetCustomerResponse>(_GetCustomerResponse_QNAME, GetCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getMovieById")
    public JAXBElement<GetMovieById> createGetMovieById(GetMovieById value) {
        return new JAXBElement<GetMovieById>(_GetMovieById_QNAME, GetMovieById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getMovieByIdResponse")
    public JAXBElement<GetMovieByIdResponse> createGetMovieByIdResponse(GetMovieByIdResponse value) {
        return new JAXBElement<GetMovieByIdResponse>(_GetMovieByIdResponse_QNAME, GetMovieByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSeatByStudioNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getSeatByStudioNumber")
    public JAXBElement<GetSeatByStudioNumber> createGetSeatByStudioNumber(GetSeatByStudioNumber value) {
        return new JAXBElement<GetSeatByStudioNumber>(_GetSeatByStudioNumber_QNAME, GetSeatByStudioNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSeatByStudioNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getSeatByStudioNumberResponse")
    public JAXBElement<GetSeatByStudioNumberResponse> createGetSeatByStudioNumberResponse(GetSeatByStudioNumberResponse value) {
        return new JAXBElement<GetSeatByStudioNumberResponse>(_GetSeatByStudioNumberResponse_QNAME, GetSeatByStudioNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShowingMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getShowingMovies")
    public JAXBElement<GetShowingMovies> createGetShowingMovies(GetShowingMovies value) {
        return new JAXBElement<GetShowingMovies>(_GetShowingMovies_QNAME, GetShowingMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetShowingMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getShowingMoviesResponse")
    public JAXBElement<GetShowingMoviesResponse> createGetShowingMoviesResponse(GetShowingMoviesResponse value) {
        return new JAXBElement<GetShowingMoviesResponse>(_GetShowingMoviesResponse_QNAME, GetShowingMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudioByStudioNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getStudioByStudioNumber")
    public JAXBElement<GetStudioByStudioNumber> createGetStudioByStudioNumber(GetStudioByStudioNumber value) {
        return new JAXBElement<GetStudioByStudioNumber>(_GetStudioByStudioNumber_QNAME, GetStudioByStudioNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudioByStudioNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getStudioByStudioNumberResponse")
    public JAXBElement<GetStudioByStudioNumberResponse> createGetStudioByStudioNumberResponse(GetStudioByStudioNumberResponse value) {
        return new JAXBElement<GetStudioByStudioNumberResponse>(_GetStudioByStudioNumberResponse_QNAME, GetStudioByStudioNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getUserByEmail")
    public JAXBElement<GetUserByEmail> createGetUserByEmail(GetUserByEmail value) {
        return new JAXBElement<GetUserByEmail>(_GetUserByEmail_QNAME, GetUserByEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getUserByEmailResponse")
    public JAXBElement<GetUserByEmailResponse> createGetUserByEmailResponse(GetUserByEmailResponse value) {
        return new JAXBElement<GetUserByEmailResponse>(_GetUserByEmailResponse_QNAME, GetUserByEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAsCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "insertAsCustomer")
    public JAXBElement<InsertAsCustomer> createInsertAsCustomer(InsertAsCustomer value) {
        return new JAXBElement<InsertAsCustomer>(_InsertAsCustomer_QNAME, InsertAsCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAsCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "insertAsCustomerResponse")
    public JAXBElement<InsertAsCustomerResponse> createInsertAsCustomerResponse(InsertAsCustomerResponse value) {
        return new JAXBElement<InsertAsCustomerResponse>(_InsertAsCustomerResponse_QNAME, InsertAsCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopUp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "topUp")
    public JAXBElement<TopUp> createTopUp(TopUp value) {
        return new JAXBElement<TopUp>(_TopUp_QNAME, TopUp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopUpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "topUpResponse")
    public JAXBElement<TopUpResponse> createTopUpResponse(TopUpResponse value) {
        return new JAXBElement<TopUpResponse>(_TopUpResponse_QNAME, TopUpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

}
