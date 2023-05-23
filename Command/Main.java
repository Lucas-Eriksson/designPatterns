package Command;

public class Main {
    public static void main(String[] args) {
        //Create receiver objects
        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        //Create command objects
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        FanStartCommand ceilingFanStartCommand = new FanStartCommand(ceilingFan);
        FanStopCommand ceilingFanStopCommand = new FanStopCommand(ceilingFan);

        //Create invoker objects
        RemoteControl livingRoomRemote = new RemoteControl();
        RemoteControl ceilingFanRemote = new RemoteControl();

        //Set and execute commands on living room remote
        livingRoomRemote.setCommand(livingRoomLightOnCommand);
        livingRoomRemote.pressButton();

        livingRoomRemote.setCommand(livingRoomLightOffCommand);
        livingRoomRemote.pressButton();

        //Set and execute commands on ceiling fan remote
        ceilingFanRemote.setCommand(ceilingFanStartCommand);
        ceilingFanRemote.pressButton();

        ceilingFanRemote.setCommand(ceilingFanStopCommand);
        ceilingFanRemote.pressButton();
    }
}
