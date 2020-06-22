package hub.guzio.MinecraftFTP.abstracts;

//Controller abstract for MinecraftFTP.

//Copyright (C) Guzio 2020. All rights reserved.
//License still apply, though, I just wanted to type "All rights reserved".
//*UNLESS OTHERWISE NOTED!!!
//(i.e. if you changed something, don't hesitate to add your name)

import static hub.guzio.MinecraftFTP.Main.Log;

public abstract class Controller extends Abstract{
    protected Controller(String desc){
        Log("Loaded \""+desc+"\" controller.");
    }
}