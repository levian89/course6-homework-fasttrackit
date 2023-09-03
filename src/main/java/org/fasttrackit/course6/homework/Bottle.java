package org.fasttrackit.course6.homework;

public class Bottle {
    private double totalCapacity;
    private double availableLiquid;
    private boolean openStatus;

    public Bottle() {

    }

    public Bottle(double totalCapacity, double availableLiquid, boolean openStatus) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.openStatus = openStatus;
    }

    public void setTotalCapacity(double totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public void setAvailableLiquid(double availableLiquid) {
        this.availableLiquid = availableLiquid;
    }

    public boolean isOpenStatus() {
        return openStatus;
    }

    public void setOpenStatus(boolean openStatus) {
        this.openStatus = openStatus;
    }

    public boolean hasLiquid() {
        return availableLiquid > 0;
    }

    public double hasAvailableLiquid() {
        return availableLiquid;
    }

    public double getEmptyCapacity() {
        return totalCapacity;
    }

    public void openTheBottle() {
        if (!openStatus) {
            setOpenStatus(true);
            System.out.println("Bottle is opened");
        } else {
            System.out.println("Bottle is already opened");
        }
    }

    public void closeTheBottle() {
        if (openStatus) {
            setOpenStatus(false);
            System.out.println("Bottle is closed");
        } else {
            System.out.println("Bootle is already closed");
        }
    }

    public void drinkFromTheBottle(double amountToBeConsumed) {
        openTheBottle();
        if(hasLiquid() && amountToBeConsumed <= availableLiquid) {
            availableLiquid -= amountToBeConsumed;
            System.out.println("You consumed " + amountToBeConsumed + "L, and it remained " + availableLiquid + "L");
        } else {
            System.out.println("There was not enough liquid in the bottle, you could only consume " +
                    availableLiquid + "L");
        }
        closeTheBottle();
    }

    @Override
    public String toString() {
        return "{" +
                "totalCapacity=" + totalCapacity +
                ", availableLiquid=" + availableLiquid +
                ", openStatus=" + openStatus +
                '}';
    }
}

