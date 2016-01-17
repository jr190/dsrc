package script.creature_spawner;

import script.*;
import script.base_class.*;
import script.combat_engine.*;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Vector;
import script.base_script;

public class sarlacc_dathomir_spawner extends script.base_script
{
    public sarlacc_dathomir_spawner()
    {
    }
    public int OnInitialize(obj_id self) throws InterruptedException
    {
        location sarlaccPit = new location(-2078.08f, 8f, 3143.75f, "dathomir", null);
        obj_id sarlacc = createObject("object/mobile/sarlacc.iff", sarlaccPit);
        setObjVar(sarlacc, "creater", self);
        attachScript(sarlacc, "creature_spawner.death_msg");
        return SCRIPT_CONTINUE;
    }
    public int creatureDied(obj_id self, dictionary params) throws InterruptedException
    {
        location sarlaccPit = new location(-2078.08f, 8f, 3143.75f, "dathomir", null);
        obj_id sarlacc = createObject("object/mobile/sarlacc.iff", sarlaccPit);
        setObjVar(sarlacc, "creater", self);
        attachScript(sarlacc, "creature_spawner.death_msg");
        return SCRIPT_CONTINUE;
    }
}