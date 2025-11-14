package org.dxc.copa.automation.base;

import java.util.ArrayList;

public final class Passenger
{

    private String fName;
    private String lName;
    private String DOB;
    private String gender;
    private String countryCode;
    private String phoneNumber;
    private String email;
    private String docNumber;
    private String pnr;
    private String paxType;
    private String ticketNumber;
    private String exitDate;
    private String ssr;
    private String seatNo;
    private String Lniata;
    private String COS;
    private int TotalBags;
    private int BaggageWeight;
    private String SeatNumber;
    private Passenger accompaniedPaxDetails;
    private String pnrType;
    private String POS;
    private String pnr2;
    private String baseFare;
    private String totalFare;
    private String oldFlightNumber;
    private int oldFlightDate;
    private String oldFlightCOS;
    private String fleetNumber;
    private int indexOfPax;
    private String ffNumber;
    private int sequenceNo;
    private String BagtagNumber;
    private int PaymentCounter;
    private int PaymentMode;
    private String CheckinType;
    private String pnr3;
    private String IndexValueAfterCheckin;
    private String areaCode;
    private String uniquePnr;
    private String oldOriginCity;
    private String oldDestinationCity;
    private String oldDate;
    private String oldOrigin;
    private String oldDestination;
    private String marriedSegmentAirline;
    private int EmdCount;
    private int PageCount;
    private int FlightCount;
    private String originFlightStatus;
    private String GateNumber;
    private String ArrivalFlightGateNumber;
    private String DepartureFlightGateNumber;
    private int ArrivalFlightTimeAfterChanging;
    private int DepartureFlightTimeAfterChanging;

    private final ArrayList<Integer> ConnectingSegmentDate;
    private final ArrayList<String> Airline;  //done
    private final ArrayList<Integer> SegmentDate;//done
    private final ArrayList<Integer> SystemDate;
    private final ArrayList<Integer> ApplicationDate;
    private final ArrayList<String> SegmentFlight;  //done
    private final ArrayList<String> segmentOriginCity; //done
    private final ArrayList<String> segmentCOS;
    private final ArrayList<String> segmentDestinationCity; //done
    private final ArrayList<String> segmentArrivalTime; //done
    private final ArrayList<String> segmentDepartureTime;  //done
    private final ArrayList<String> Tax; //done
    private ArrayList<String> listOfTaxes;
    private final ArrayList<String> PNRs; //done
    private final ArrayList<String> PaymentType; //done
    private final ArrayList<String> Emd;
    private final ArrayList<String> TicketNos;
    private int SequenceNumber;
    private final ArrayList<String> ConjuctiveTicketNumbers;
    private String documentType;
    private String ticketDocumentNumber;
    private int FirstSegDate;
    private String PricingOption;
    private String Currency;
    private String QuoteID;
    private String PaxName;
    private String ServiceFees;
    private String PreviousPricingOption;


    private String paymentAmount;
    private boolean isNRSA;
    private boolean isNRPS;
    private boolean isGroupPNR;
    private boolean isSameSurname;
    private boolean isFQTVPax;
    private String RemarkText;
    private String RemarkIndex;
    private boolean isCorporatePNR;
    private boolean isJumpSeatPax;
    private boolean isSameSurnameCorporatePNR;
    private boolean isSameSurnameGroupPNR;
    private String GroupName;
    private String massTransferType;
    private String newCOS;
    private String updatedTicketNumber;
    private String updatedEMDNumber;
    private String residualEMDNumber;
    private String CHDTicketNumber;
    private String ADTTicketNumber;
    private String INSTicketNumber;
    private String INFTicketNumber;
    private String IssuedCurrency;

    private int SecondSegDate;
    private int ThirdSegDate;
    private int FourthSegDate;
    private String surchargeValue;
    private final ArrayList<String> baggageEMDNumbers;
    private final ArrayList<String> SeatNumberAllSegments;



    private final ArrayList<String> oldFlightNos;
    private final ArrayList<Integer> oldFlightDates;
    private final ArrayList<String> oldFlightOrigin;
    private final ArrayList<String> oldFlightDestination;
    private final ArrayList<String> ThruFlightDestinations;
    private String firstSegDateOrderPage;
    private String firstConnectingSegDateOrderPage;

    public Passenger() {
        fName = null;
        lName = null;
        DOB = null;
        gender = null;
        countryCode = null;
        phoneNumber = null;
        email = null;
        docNumber = null;
        pnr = null;
        paxType = null;
        ticketNumber = null;
        exitDate = null;
        ssr = null;
        seatNo = null;
        ticketDocumentNumber=null;
        documentType="";
        SegmentDate = new ArrayList<>();
        SystemDate = new ArrayList<>();
        ApplicationDate = new ArrayList<>();
        SegmentFlight = new ArrayList<>();
        Airline  = new ArrayList<>();
        isNRSA = false;
        isNRPS = false;
        Lniata = "NotSet";
        surchargeValue=null;
        BagtagNumber=null;
        segmentOriginCity = new ArrayList<>();
        segmentCOS = new ArrayList<>();
        segmentDestinationCity = new ArrayList<>();
        segmentArrivalTime=new ArrayList<>();
        segmentDepartureTime=new ArrayList<>();
        ThruFlightDestinations=new ArrayList<>();
        Tax = new ArrayList<>();
        COS = null;
        SeatNumber = null;
        TotalBags = 0;
        BaggageWeight=0;
        isGroupPNR=false;
        accompaniedPaxDetails=null;
        pnrType=null;
        POS = null;
        pnr2 = null;
        baseFare = null;
        totalFare = null;
        listOfTaxes = null;
        oldFlightNumber = null;
        oldFlightCOS = null;
        fleetNumber=null;
        indexOfPax=0;
        ffNumber=null;
        isSameSurname=false;
        isFQTVPax=false;
        isCorporatePNR = false;
        isJumpSeatPax = false;
        PNRs = new ArrayList<>();
        sequenceNo = 0;
        PaymentCounter =0;
        oldFlightDate=0;
        PaymentMode=1;
        PaymentType=new ArrayList<>();
        CheckinType=null;
        pnr3 = null;
        IndexValueAfterCheckin=null;
        areaCode=null;
        paymentAmount=null;
        uniquePnr=null;
        oldOriginCity=null;
        oldDestinationCity=null;
        oldDate=null;
        oldOrigin = null;
        oldDestination = null;
        marriedSegmentAirline = "CM";
        isSameSurnameCorporatePNR = false;
        isSameSurnameGroupPNR = false;
        EmdCount = 0;
        PageCount = 0;
        Emd=new ArrayList<>();
        FlightCount=1;
        TicketNos = new ArrayList<>();
        originFlightStatus = null;
        GateNumber=null;
        DepartureFlightGateNumber=null;
        ArrivalFlightGateNumber=null;
        SequenceNumber=0;
        ConjuctiveTicketNumbers = new ArrayList<>();
        ArrivalFlightTimeAfterChanging=0;
        DepartureFlightTimeAfterChanging=0;
        massTransferType="";
        oldFlightNos = new ArrayList<>();
        oldFlightDates = new ArrayList<>();
        oldFlightOrigin = new ArrayList<>();
        oldFlightDestination = new ArrayList<>();
        FirstSegDate=0;
        PricingOption=null;
        Currency=null;
        QuoteID=null;
        PaxName=null;
        ServiceFees=null;
        PreviousPricingOption=null;
        newCOS="";
        updatedEMDNumber = null;
        updatedTicketNumber=null;
        CHDTicketNumber="";
        ADTTicketNumber="";
        INSTicketNumber="";
        INFTicketNumber="";
        IssuedCurrency="";
        baggageEMDNumbers = new ArrayList<>();
        SeatNumberAllSegments = new ArrayList<>();
        SecondSegDate=0;
        ThirdSegDate=0;
        FourthSegDate=0;
        ConnectingSegmentDate = new ArrayList<>();
        firstSegDateOrderPage="";
        firstConnectingSegDateOrderPage="";
    }

    public void setSsr(String ssr) {
        this.ssr = ssr;
    }

    public void setPNRs(int i,String PNRs)
    {
        if(this.PNRs.size()>= (i+1))
            this.PNRs.set(i,PNRs);
        else
            this.PNRs.add(i,PNRs);
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public void setTicketNumber(String tickets) {
        this.ticketNumber = tickets;
    }

    public void setExitDate(String exitDate) {
        this.exitDate = exitDate;
    }

    public void setPaxType(String paxType) {
        this.paxType = paxType;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSegmentDate(int i, int SegmentsDate)
    {
        if(this.SegmentDate.size()>= (i+1))
            this.SegmentDate.set(i,SegmentsDate);
        else
            this.SegmentDate.add(i,SegmentsDate);
    }

    public void setSystemDate(int i, int SystemDate)
    {
        if(this.SystemDate.size()>= (i+1))
            this.SystemDate.set(i,SystemDate);
        else
            this.SystemDate.add(i,SystemDate);
    }

    public void setApplicationDate(int i, int ApplicationDate)
    {
        if(this.ApplicationDate.size()>= (i+1))
            this.ApplicationDate.set(i,ApplicationDate);
        else
            this.ApplicationDate.add(i,ApplicationDate);
    }

    public void setSegmentFlight(int i,String SegmentFlight)
    {
        if(this.SegmentFlight.size()>= (i+1))
            this.SegmentFlight.set(i,SegmentFlight);
        else
            this.SegmentFlight.add(i,SegmentFlight);
    }

    public void setAirline(int i,String Airline)
    {
        if(this.Airline.size()>= (i+1))
            this.Airline.set(i,Airline);
        else
            this.Airline.add(i,Airline);
    }

    public void setIsNRSA(boolean isNRSA) { this.isNRSA = isNRSA; }

    public void setIsNRPS(boolean isNRPS) { this.isNRPS = isNRPS; }

    public void setLniata(String Lniata) {
        this.Lniata = Lniata;
    }

    public void setCOS(String COS) { this.COS = COS; }


    public void setSegmentCOS(int i, String segmentCOS)
    {
        if(this.segmentCOS.size()>= (i+1))
            this.segmentCOS.set(i,segmentCOS);
        else
            this.segmentCOS.add(i,segmentCOS);
    }


    public void setSegmentOriginCity(int i,String segmentOriginCity)
    {
        if(this.segmentOriginCity.size()>= (i+1))
            this.segmentOriginCity.set(i,segmentOriginCity);
        else
            this.segmentOriginCity.add(i,segmentOriginCity);
    }

    public void setSegmentDestinationCity(int i,String segmentDestinationCity)
    {
        if(this.segmentDestinationCity.size()>= (i+1))
            this.segmentDestinationCity.set(i,segmentDestinationCity);
        else
            this.segmentDestinationCity.add(i,segmentDestinationCity);
    }

    public void setSegmentArrivalTime(int i,String segmentArrivalTime)
    {
        if(this.segmentArrivalTime.size()>= (i+1))
            this.segmentArrivalTime.set(i,segmentArrivalTime);
        else
            this.segmentArrivalTime.add(i,segmentArrivalTime);
    }


    public void setSegmentDepartureTime(int i,String segmentDepartureTime)
    {
        if(this.segmentDepartureTime.size()>= (i+1))
            this.segmentDepartureTime.set(i,segmentDepartureTime);
        else
            this.segmentDepartureTime.add(i,segmentDepartureTime);
    }

    public void setTotalBags(int TotalBags) {
        this.TotalBags = TotalBags;
    }

    public void setBaggageWeight(int BaggageWeight) {
        this.BaggageWeight = BaggageWeight;
    }

    public void setSeatNumber(String SeatNumber) {
        this.SeatNumber = SeatNumber;
    }

    public void setTicketDocumentNumber(String ticketDocumentNumber) {
        this.ticketDocumentNumber = ticketDocumentNumber;
    }

    public void setIsGroupPNR(boolean IsGroupPNR) {
        this.isGroupPNR = IsGroupPNR;
    }

    public void setAccompaniedPaxDetails(Passenger pax) {
        this.accompaniedPaxDetails = pax;
    }

    public void setpnrType(String pnrType) {
        this.pnrType = pnrType;
    }

    public void setPOS(String POS) { this.POS = POS;}

    public void setPnr2(String pnr2) { this.pnr2 = pnr2; }

    public void setTax(int i,String Tax)
    {
        if(this.Tax.size()>= (i+1))
            this.Tax.set(i,Tax);
        else
            this.Tax.add(i,Tax);
    }

    public void setBaseFare(String BaseFare) { this.baseFare = BaseFare;}

    public void setBagtagNumber(String BagtagNumber) {
        this.BagtagNumber = BagtagNumber;
    }

    public void setTotalFare(String TotalFare) { this.totalFare = TotalFare;}

    public void setListOfTaxes(ArrayList<String> taxList) { this.listOfTaxes = taxList; }

    public void setOldFlightNumber(String oldFltNumber) { this.oldFlightNumber = oldFltNumber;}

    public void setOldFlightDate(int oldFlightDate) { this.oldFlightDate = oldFlightDate;}

    public void setOldFlightCOS(String oldFltCOS) { this.oldFlightCOS = oldFltCOS;}

    public void setFleetNumber(String fleet) { this.fleetNumber = fleet;}

    public void setIndexOfPax(int indexOfPax) { this.indexOfPax = indexOfPax; }

    public void setIsFQTV(boolean isFQTV) { this.isFQTVPax = isFQTV; }

    public void setFFNumber(String ffNumber) { this.ffNumber = ffNumber;}

    public void setIsSameSurname(boolean isSameSurname) { this.isSameSurname = isSameSurname; }

    public void setIsCorporatePNR(boolean IsCorporatePNR) {
        this.isCorporatePNR = IsCorporatePNR;
    }

    public void setIsJumpSeatPax(boolean IsJumpSeatPax) {
        this.isJumpSeatPax = IsJumpSeatPax;
    }

    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    public void setSequenceNo(int sequenceNo) { this.sequenceNo = sequenceNo; }

    public void setPaymentCounter(int PaymentCounter) {
        this.PaymentCounter = PaymentCounter;
    }

    public void setPaymentMode(int PaymentMode) {
        this.PaymentMode = PaymentMode;
    }

    public void setPaymentType(int i,String PaymentType)
    {
        if(this.PaymentType.size()>= (i+1))
            this.PaymentType.set(i,PaymentType);
        else
            this.PaymentType.add(i,PaymentType);
    }

    public void setCheckinType(String CheckinType) {
        this.CheckinType = CheckinType;
    }

    public void setPnr3(String pnr3) { this.pnr3 = pnr3; }

    public void setOldDate(String oldDate) { this.oldDate = oldDate;}

    public void setOldOriginCity(String oldOriginCity) { this.oldOriginCity = oldOriginCity;}

    public void setOldDestinationCity(String oldDestinationCity) { this.oldDestinationCity = oldDestinationCity;}

    public void setIndexValueAfterCheckin(String IndexValueAfterCheckin) {
        this.IndexValueAfterCheckin = IndexValueAfterCheckin;
    }
    public void setAreaCode(String areaCode) { this.areaCode = areaCode; }

    public void setPaymentAmount(String paymentAmount) { this.paymentAmount = paymentAmount; }

    public void setUniqueTTYPnr(String uniquePnr) {
        this.uniquePnr = uniquePnr;
    }

    public void setOldOrigin(String oldOrigin) { this.oldOrigin = oldOrigin;}

    public void setOldDestination(String oldDestination) { this.oldDestination = oldDestination;}

    public void setMarriedSegmentAirline(String Airline) { this.marriedSegmentAirline = Airline; }

    public void setIsSameSurnameCorporatePNR(boolean IsSameSurnameCorporatePNR) {
        this.isSameSurnameCorporatePNR = IsSameSurnameCorporatePNR;
    }

    public void setIsSameSurnameGroupPNR(boolean IsSameSurnameGroupPNR) {
        this.isSameSurnameGroupPNR = IsSameSurnameGroupPNR;
    }

    public void setEmd(int i,String emd)
    {
        if(this.Emd.size()>= (i+1))
            this.Emd.set(i,emd);
        else
            this.Emd.add(i,emd);
    }
    public void setEmdCount(int EmdCount) {
        this.EmdCount = EmdCount;
    }

    public void setFlightCount(int FlightCount) {
        this.FlightCount = FlightCount;
    }

    public void setTicketNos(int i,String TicketNos)
    {
        if(this.TicketNos.size()>= (i+1))
            this.TicketNos.set(i,TicketNos);
        else
            this.TicketNos.add(i,TicketNos);
    }

    public void setOriginFlightStatus(String originFltStatus) {
        this.originFlightStatus = originFltStatus;
    }

    public void setGateNumber(String GateNumber){ this.GateNumber=GateNumber;}

    public void setDepartureFlightGateNumber(String DepartureFlightGateNumber){ this.DepartureFlightGateNumber=DepartureFlightGateNumber;}

    public void setArrivalFlightGateNumber(String ArrivalFlightGateNumber){ this.ArrivalFlightGateNumber=ArrivalFlightGateNumber;}

    public void setSequenceNumber(int SequenceNumber){this.SequenceNumber=SequenceNumber;}

    public void setConjuctiveTicketNumbers(int i,String ConjuctiveTicketNumbers)

    {
        if(this.ConjuctiveTicketNumbers.size()>= (i+1))
            this.ConjuctiveTicketNumbers.set(i,ConjuctiveTicketNumbers);
        else
            this.ConjuctiveTicketNumbers.add(i,ConjuctiveTicketNumbers);
    }

    public void setArrivalFlightTimeAfterChanging(int ArrivalFlightTimeAfterChanging) {this.ArrivalFlightTimeAfterChanging=ArrivalFlightTimeAfterChanging;}

    public void setDepartureFlightTimeAfterChanging(int DepartureFlightTimeAfterChanging){this.DepartureFlightTimeAfterChanging=DepartureFlightTimeAfterChanging;}

    public void setmassTransferType(String massTransferType)
    {
        this.massTransferType = massTransferType;
    }

    public void setFOIDType(String documentType) {
        this.documentType = documentType;
    }

    public void setOldFlightNos(int i,String oldFlightNumber)
    {
        if(this.oldFlightNos.size()>= (i+1))
            this.oldFlightNos.set(i,oldFlightNumber);
        else
            this.oldFlightNos.add(i,oldFlightNumber);

    }

    public void setOldFlightDates(int i,Integer oldFlightDate)
    {
        if(this.oldFlightDates.size()>= (i+1))
            this.oldFlightDates.set(i,oldFlightDate);
        else
            this.oldFlightDates.add(i,oldFlightDate);
    }

    public void setOldFlightOrigin(int i,String oldFlightOrigin)
    {
        if(this.oldFlightOrigin.size()>= (i+1))
            this.oldFlightOrigin.set(i,oldFlightOrigin);
        else
            this.oldFlightOrigin.add(i,oldFlightOrigin);
    }

    public void setOldFlightDestination(int i,String oldFlightDestination)
    {
        if(this.oldFlightDestination.size()>= (i+1))
            this.oldFlightDestination.set(i,oldFlightDestination);
        else
            this.oldFlightDestination.add(i,oldFlightDestination);
    }


    public void setFirstSegDate(int FirstSegDate){this.FirstSegDate=FirstSegDate;}

    public void setPricingOption(String PricingOption){this.PricingOption=PricingOption;}

    public void setCurrency(String Currency){this.Currency=Currency;}

    public void setQuoteID(String QuoteID){this.QuoteID=QuoteID;}

    public void setPaxName(String PaxName){this.PaxName=PaxName;}

    public void setServiceFees(String ServiceFees){this.ServiceFees=ServiceFees;}

    public void setPreviousPricingOption(String PreviousPricingOption){this.PreviousPricingOption=PreviousPricingOption;}

    public void setThruFlightDestinations(int i,String ThruFlightDestinations)
    {
        if(this.ThruFlightDestinations.size()>= (i+1))
            this.ThruFlightDestinations.set(i,ThruFlightDestinations);
        else
            this.ThruFlightDestinations.add(i,ThruFlightDestinations);
    }

    public void setnewCOS(String newCOS) { this.newCOS = newCOS; }

    public void setUpdatedTicketNumber(String updatedTicketNumber) {
        this.updatedTicketNumber = updatedTicketNumber;
    }
    public void setUpdatedEMDNumber(String updatedEMDNumber) {
        this.updatedEMDNumber = updatedEMDNumber;
    }
    public void setResidualEMDNumber(String residualEMDNumber) {
        this.residualEMDNumber = residualEMDNumber;
    }

    public void setADTTicketNumber(String tickets) {
        this.ADTTicketNumber = tickets;
    }
    public void setCHDTicketNumber(String tickets) {
        this.CHDTicketNumber = tickets;
    }
    public void setINSTicketNumber(String tickets) {
        this.INSTicketNumber = tickets;
    }
    public void setINFTicketNumber(String tickets) {
        this.INFTicketNumber = tickets;
    }
    public void setIssuedCurrency(String currency) {
        this.IssuedCurrency = currency;
    }

    public void setBaggageEMDNumber(int i, String baggageEMDNumbers) {
        if(this.baggageEMDNumbers.size()>= (i+1))
            this.baggageEMDNumbers.set(i,baggageEMDNumbers);
        else
            this.baggageEMDNumbers.add(i,baggageEMDNumbers);
    }

    public void setSurchargeValue(String surchargeValue) {
        this.surchargeValue = surchargeValue;
    }


    public void setSeatNumberAllSegments(int i, String SeatNumberAllSegments)
    {
        if(this.SeatNumberAllSegments.size()>= (i+1))
            this.SeatNumberAllSegments.set(i,SeatNumberAllSegments);
        else
            this.SeatNumberAllSegments.add(i,SeatNumberAllSegments);
    }

    public void setSecondSegDate(int SecondSegDate){this.SecondSegDate=SecondSegDate;}

    public void setThirdSegDate(int ThirdSegDate){this.ThirdSegDate=ThirdSegDate;}

    public void setFourthSegDate(int FourthSegDate){this.FourthSegDate=FourthSegDate;}

    public void setConnectingSegmentDate(int i, int ConnectingSegmentDate)
    {
        if(this.ConnectingSegmentDate.size()>= (i+1))
            this.ConnectingSegmentDate.set(i,ConnectingSegmentDate);
        else
            this.ConnectingSegmentDate.add(i,ConnectingSegmentDate);
    }
    public void setfirstSegDateOrderPage(String firstSegDateOrderPage){this.firstSegDateOrderPage=firstSegDateOrderPage;}
    public void setfirstConnectingSegDateOrderPage(String firstConnectingSegDateOrderPage){this.firstConnectingSegDateOrderPage=firstConnectingSegDateOrderPage;}
//    ########## GETTERS ##########


    public String getfirstSegDateOrderPage() {
        return firstSegDateOrderPage;
    }

    public String getfirstConnectingSegDateOrderPage() {
        return firstConnectingSegDateOrderPage;
    }
    public int getSecondSegDate() {
        return SecondSegDate;
    }

    public int getThirdSegDate() {
        return ThirdSegDate;
    }

    public String getBaggageEMDNumber(int i) { return this.baggageEMDNumbers.get(i); }

    public String getSeatNumberAllSegments(int i) {
        return this.SeatNumberAllSegments.get(i);
    }

    public int getFourthSegDate() {
        return FourthSegDate;
    }


    public String getSsr() {
        return this.ssr;
    }

    public String getSeatNo() {
        return this.seatNo;
    }

    public String getPNRs(int i) { return this.PNRs.get(i); }

    public String getTicketNumber() {
        return this.ticketNumber;
    }

    public String getExitDate() {
        return this.exitDate;
    }

    public String getPaxType() {
        return this.paxType;
    }

    public String getPnr() {
        return this.pnr;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDocNumber() {
        return this.docNumber;
    }

    public String getFullName() {
        return this.lName + "/" + this.fName;
    }

    public String getlName() {
        return this.lName;
    }

    public String getDOB() {
        return this.DOB;
    }

    public String getGender() {
        return this.gender;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getfName() {
        return this.fName;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getSegmentDate(int i) {
        return this.SegmentDate.get(i);
    }

    public int getSystemDate(int i) {
        return this.SystemDate.get(i);
    }

    public int getApplicationDate(int i) {
        return this.ApplicationDate.get(i);
    }

    public String getSegmentFlight(int i) {
        return this.SegmentFlight.get(i);
    }

    public String getAirline(int i) {
        return this.Airline.get(i);
    }

    public boolean getIsNRSA() {return this.isNRSA;}

    public boolean getIsNRPS() {return this.isNRPS;}

    public String getLniata() {
        return this.Lniata;
    }

    public String getCOS() { return this.COS;}

    public String getOldOriginCity() { return this.oldOriginCity; }

    public String getOldDestinationCity() { return this.oldDestinationCity; }

    public String getOldDate() { return this.oldDate; }

    public String getSegmentOriginCity(int i) {
        return this.segmentOriginCity.get(i);
    }

    public String getSegmentCOS(int i) {
        return this.segmentCOS.get(i);
    }

    public String getSegmentDestinationCity(int i) {
        return this.segmentDestinationCity.get(i);
    }

    public String getSegmentDepartureTime(int i) {
        return this.segmentDepartureTime.get(i);
    }

    public String getSegmentArrivalTime(int i) {
        return this.segmentArrivalTime.get(i);
    }

    public int getTotalBags() { return this.TotalBags; }

    public int getBaggageWeight() { return this.BaggageWeight; }

    public String getSeatNumber() { return this.SeatNumber; }

    public boolean getIsGroupPNR() {return this.isGroupPNR; }

    public String getBagtagNumber() {
        return this.BagtagNumber;
    }

    public Passenger getAccompaniedPaxDetails() { return this.accompaniedPaxDetails; }

    public String getpnrType()
    {
        return this.pnrType;
    }

    public String getPOS() {    return this.POS;}

    public String getSurchargeValue() {
        return this.surchargeValue ;
    }

    public int getTotalSegments() {    return this.SegmentFlight.size();}

    public String getPnr2() { return this.pnr2; }

    public String getTax(int i)
    {
        return this.Tax.get(i);
    }

    public String getBaseFare() { return this.baseFare; }

    public String getTotalFare() { return this.totalFare; }

    public ArrayList<String> getListOfTaxes() { return this.listOfTaxes; }

    public String getOldFlightNumber() { return this.oldFlightNumber; }

    public int getOldFlightDate() { return this.oldFlightDate; }

    public String getOldFlightCOS() { return this.oldFlightCOS; }

    public String getFleetNumber() { return this.fleetNumber; }

    public int getIndexOfPax() {return this.indexOfPax;}

    public boolean getIsFQTV() {return this.isFQTVPax;}

    public String getFFNumber() {return this.ffNumber;}

    public boolean getIsSameSurname() {return this.isSameSurname;}

    public void setRemarkText(String RemarkText) {
        this.RemarkText = RemarkText;
    }

    public String getRemarkText() {return this.RemarkText;}

    public void setRemarkIndex(String RemarkIndex) {
        this.RemarkIndex = RemarkIndex;
    }

    public String getRemarkIndex() {return this.RemarkIndex;}

    public boolean getIsCorporatePNR() {return this.isCorporatePNR;}

    public String getGroupName() {return this.GroupName;}

    public boolean getIsJumpSeatPax() {return this.isJumpSeatPax;}

    public int getSequenceNo() {return this.sequenceNo;}

    public int getPaymentCounter() {
        return this.PaymentCounter;
    }

    public int getPaymentMode() {
        return this.PaymentMode;
    }

    public String getPaymentType(int i) {
        return this.PaymentType.get(i);
    }

    public String getCheckinType() {
        return this.CheckinType;
    }

    public String getPnr3() { return this.pnr3; }

    public String getIndexValueAfterCheckin() {return this.IndexValueAfterCheckin;}

    public String getAreaCode() { return this.areaCode; }

    public String getPaymentAmount() { return this.paymentAmount; }

    public String getUniqueTTYPnr() {
        return this.uniquePnr;
    }

    public String getOldOrigin() { return this.oldOrigin; }

    public String getOldDestination() { return this.oldDestination; }

    public String getMarriedSegmentAirline() { return this.marriedSegmentAirline;}

    public boolean getIsSameSurnameCorporatePNR() {return this.isSameSurnameCorporatePNR;}

    public boolean getIsSameSurnameGroupPNR() {return this.isSameSurnameGroupPNR;}

    public String getEmd(int i) {
        return this.Emd.get(i);
    }

    public int getEmdCount() {
        return this.EmdCount;
    }

    public int getFlightCount() {
        return this.FlightCount;
    }

    public String getTicketNos(int i) {
        return this.TicketNos.get(i);
    }

    public String getOriginFlightStatus() { return this.originFlightStatus; }

    public String getGateNumber(){return this.GateNumber;}

    public String getDepartureFlightGateNumber(){return this.DepartureFlightGateNumber;}

    public String getArrivalFlightGateNumber(){return this.ArrivalFlightGateNumber;}

    public int getSequenceNumber(int SequenceNumber){return this.SequenceNumber;}

    public String getConjuctiveTicketNumbers(int i) {
        return this.ConjuctiveTicketNumbers.get(i);
    }

    public int getArrivalFlightTimeAfterChanging() {return this.ArrivalFlightTimeAfterChanging;}

    public int getDepartureFlightTimeAfterChanging(){return this.DepartureFlightTimeAfterChanging;}

    public String getmassTransferType()
    {
        return this.massTransferType;
    }

    public String getFOIDType() {
        return this.documentType;
    }

    public String getOldFlightNos(int i) { return this.oldFlightNos.get(i); }

    public Integer getOldFlightDates(int i) { return this.oldFlightDates.get(i); }

    public String getOldFlightOrigin(int i) { return this.oldFlightOrigin.get(i); }

    public String getOldFlightDestination(int i) { return this.oldFlightDestination.get(i); }

    public String getTicketDocumentNumber() {
        return this.ticketDocumentNumber;
    }

    public int getFirstSegDate(){return this.FirstSegDate;}

    public String getPricingOption(){return this.PricingOption;}

    public String getCurrency(){return this.Currency;}

    public String getQuoteID(){return this.QuoteID;}

    public String getPaxName(){return this.PaxName;}

    public String getServiceFees(){return this.ServiceFees;}

    public String getPreviousPricingOption(){return this.PreviousPricingOption;}

    public String getThruFlightDestinations(int i) {
        return this.ThruFlightDestinations.get(i);
    }

    public String getnewCOS() { return this.newCOS;}
    public String getUpdatedEMDNumber() {
        return updatedEMDNumber;
    }
    public String getResidualEMDNumber() {
        return residualEMDNumber;
    }
    public String getUpdatedTicketNumber() {
        return updatedTicketNumber;
    }

    public String getADTTicketNumber() {
        return this.ADTTicketNumber;
    }
    public String getCHDTicketNumber() {
        return this.CHDTicketNumber;
    }
    public String getINSTicketNumber() {
        return this.INSTicketNumber;
    }
    public String getINFTicketNumber() {
        return this.INFTicketNumber;
    }
    public String getIssuedCurrency() {
        return this.IssuedCurrency;
    }
    public int getConnectingSegmentDate(int i) { return this.ConnectingSegmentDate.get(i); }

    public void diaplayPassenger()
    {
        System.out.println("Passenger Full Name: " + getFullName());
        System.out.println("Passenger fName: " + fName);
        System.out.println("Passenger lName: " + lName);
        System.out.println("Passenger DOB: " + DOB);
        System.out.println("Passenger gender: " + gender);
        System.out.println("Passenger countryCode: " + countryCode);
        System.out.println("Passenger phoneNumber: " + phoneNumber);
        System.out.println("Passenger email: " + email);
        System.out.println("Passenger docNumber: " + docNumber);
        System.out.println("Passenger IsNRPS: "+isNRPS);
        System.out.println("Passenger IsNRSA: "+isNRSA);

    }

    public String getAllDetails() {
        return "Full Name:" + getFullName() + " DOB: " + getDOB() + " Country COde: " + getCountryCode() + " Phone Number: " + getPhoneNumber() +
                "\n Document Number: " + getDocNumber() + " Area COde: " + " Gender:  " + getGender() + " Email: " + getEmail() + " PNR: " + getPnr();
    }

    public void deleteSegmentDetails(int i)
    {
        if(!this.segmentOriginCity.isEmpty())
            this.segmentOriginCity.remove(i);

        if(!this.segmentDestinationCity.isEmpty())
            this.segmentDestinationCity.remove(i);

        if(!this.segmentArrivalTime.isEmpty())
            this.segmentArrivalTime.remove(i);

        if(!this.segmentDepartureTime.isEmpty())
            this.segmentDepartureTime.remove(i);

        if(!this.SegmentFlight.isEmpty())
            this.SegmentFlight.remove(i);

        if(!this.SegmentDate.isEmpty())
            this.SegmentDate.remove(i);

        if(!this.ConjuctiveTicketNumbers.isEmpty())
            this.ConjuctiveTicketNumbers.remove(i);

    }
}
