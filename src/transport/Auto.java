package transport;

public class Auto {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String transmission;
    private final String bodyType;
    private int registrationNumber;
    private final int seatsCount;
    private Boolean summerTyres;
    private Key key;
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {


            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return (remoteEngineStart? "есть удалённый запуск двигателя" : "нет удалённого запуска двигателя") +
                    (keylessAccess? "есть бесключевой доступ" : "нет бесключевого доступа");
        }
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if(key==null){
            key = new Key(false, false);
        }
        this.key = key;
    }

    public Auto(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, int registrationNumber, int seatsCount, Boolean tyre, Key key) {
        if (brand == null || brand.equals("")) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null || model.equals("")) {
            model = "default";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }

        setEngineVolume(engineVolume);
        setColor(color);
        if (year <= 0) {
            year = 2000;
        }
        this.year = year;

        if (country == null || country.equals("")) {
            country = "default";
        }
        this.country = country;

        setTransmission(transmission);

        if (bodyType == null || bodyType.equals("")) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        if (registrationNumber <= 0) {
            registrationNumber = 10;
        }
        this.registrationNumber = registrationNumber;


        if (seatsCount <= 0) {
            this.seatsCount = 4;
        } else {
            this.seatsCount = seatsCount;
        }

        if (tyre == null) {
            tyre = false;
        }
        this.summerTyres = tyre;
        setKey(key);

    }

    public void changeTyre(int month) {
        switch (month) {
            case 1 -> this.summerTyres = false;
            case 2 -> this.summerTyres = false;
            case 3 -> this.summerTyres = true;
            case 4 -> this.summerTyres = true;
            case 5 -> this.summerTyres = true;
            case 6 -> this.summerTyres = true;
            case 7 -> this.summerTyres = true;
            case 8 -> this.summerTyres = true;
            case 9 -> this.summerTyres = true;
            case 10 -> this.summerTyres = true;
            case 11 -> this.summerTyres = true;
            case 12 -> this.summerTyres = false;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.equals("")) {
            color = "White";
        }
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.equals("")) {
            transmission = "default";
        }
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public Boolean getSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(Boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    @Override
    public String toString() {
        return
                "марка='" + brand + '\'' +
                        ", модель='" + model + '\'' +
                        ", объем двигателя=" + engineVolume +
                        ", цвет='" + color + '\'' +
                        ", год=" + year +
                        ", страна сборки='" + country + '\'' +
                        ", коробка передач='" + transmission + '\'' +
                        ", кузов='" + bodyType + '\'' +
                        ", регистрационный номер=" + registrationNumber +
                        ", количество сидений=" + seatsCount +
                        ", тип резины=" + (summerTyres ? "летняя" : "зимняя") +
                        key;
    }


}
