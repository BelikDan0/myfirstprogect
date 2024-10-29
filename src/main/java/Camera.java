public class Camera {
    private static String[] numbers = {
            "А100ВР123",
            "В201ОНР123",
            "О102МР123",
            "М103ВР123",
            "Р104ВР123",
            "Н105ВР123",
            "У106ВР123",
            "Х107ВР123",
            "С108ВР123",
            "Т109ВР123",    };
    public static Car getNextCar() {
        int startfornumber=0;
        int endfornumber =9;
        int raqndomForRandom = startfornumber+(int)(Math.random()*((endfornumber+1)-startfornumber));
        String raqndom=numbers[raqndomForRandom];

        int start=1000;
        int end =5000;
        int raqndomForHeight = start+(int)(Math.random()*((end+1)-start));

        int startMass=1000;
        int endMass =30000;
        int raqndomForMass = start+(int)(Math.random()*((endMass+1)-startMass));

        int startVehic=0;
        int endVehic =1;
        int raqndomForVehic = startVehic+(int)(Math.random()*((endVehic+1)-startVehic));
        boolean randomVehic=raqndomForVehic==0? false:true;

        int startSpec=0;
        int endSpec =1;
        int raqndomForSpec = startSpec+(int)(Math.random()*((endSpec+1)-startSpec));
        boolean randomSpec=raqndomForSpec==0? false:true;

        Car car = new Car(raqndom , raqndomForHeight , raqndomForMass, randomVehic , randomSpec );
        return car;

    }
}

