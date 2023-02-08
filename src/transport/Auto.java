package transport;

public class Auto {
    final String brand;
    final String model;
    double engineVolume;
    String color;
    final int year;
    final String country;

    String transmission;
    final String bodyType;
    int registrationNumber;
    final int seatsCount;
    Boolean tyre;

    public Auto(String brand, String model, double engineVolume, String color, int year, String country, String transmission, String bodyType, int registrationNumber, int seatsCount, Boolean tyre) {
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {this.brand = brand;}
        if (model == null || model.equals("")) {
            this.model = "default";
        } else {this.model = model;}
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {this.engineVolume = engineVolume;}
        if (color == null || color.equals("")) {
            this.color = "White";
        } else {this.color = color;}
        if (year <= 0) {
            this.year = 2000;
        } else {this.year = year;}

        if (country == null || country.equals("")) {
            this.country = "default";
        } else {this.country = country;}

        if (transmission == null || transmission.equals("")) {
            this.transmission = "default";
        } else {this.transmission = transmission;}

        if (bodyType == null || bodyType.equals("")) {
            this.bodyType = "default";
        } else {this.bodyType = bodyType;}

        if (registrationNumber <= 0){
            this.registrationNumber = 10;
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (seatsCount <=0) {
            this.seatsCount = 4;
        } else {
            this.seatsCount = seatsCount;
        }

        if (tyre == null)
        {this.tyre = false;
        } else {this.tyre = tyre;
        }

    }

    public void changeTyre(int month) {
        switch (month) {
            case 1 -> this.tyre = false;
            case 2 -> this.tyre = false;
            case 3 -> this.tyre = true;
            case 4 -> this.tyre = true;
            case 5 -> this.tyre = true;
            case 6 -> this.tyre = true;
            case 7 -> this.tyre = true;
            case 8 -> this.tyre = true;
            case 9 -> this.tyre = true;
            case 10 -> this.tyre = true;
            case 11 -> this.tyre = true;
            case 12 -> this.tyre = false;
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
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
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

    public Boolean getTyre() {
        return tyre;
    }

    public void setTyre(Boolean tyre) {
        this.tyre = tyre;
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
                ", тип резины=" + tyre;
    }
}
