package Ex3_MusicFestival;

class NonMusicEvent extends Event {
    public int rent;


    public NonMusicEvent(String name, String type, String loc ){
        super(name,type);
        super.setLocation(loc);
        this.rent = -1; // arbitrary default integer

    }

    @Override
    public void printMe(){
        System.out.println("Name:" + super.getEventName() + "  Type:" + super.getEventType() + "  Location:" + super.getLocation() + "  ID:" + super.getEventID() );
    }

    public void setRent(int r){
        this.rent = r;
    }






}