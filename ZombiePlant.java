public class ZombiePlant {
    int treatmentPotency; int treatmentsRequired;

    public ZombiePlant(int Potency, int Required) {
        treatmentPotency = Potency; treatmentsRequired = Required;
    }

    public int treatmentsNeeded(){
        System.out.println(treatmentsRequired);
        return treatmentsRequired;
    }
    public int getPotencyRequired(){
        return treatmentPotency;
    }
    public boolean isDangerous(){
        if(treatmentsRequired > 0){
            return true;
        }else{
            return false;
        }
    }
    public void treat(int newTreatPotency){
        if(newTreatPotency<=treatmentPotency && newTreatPotency>0){
            if(treatmentsRequired == 0 ){
                return;
            }
            treatmentsRequired--;
        }
        if(newTreatPotency>treatmentPotency){
            treatmentsRequired++;
        }
    }
}
