package pb0;

import be0.e;
import com.tesla.command_utils.usecase.CommandSigningRequirement;
import kotlinx.coroutines.DebugKt;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lpb0/a;", "", "Lbe0/e;", "getVehicleData", "<init>", "(Lbe0/e;)V", "", "vin", "Lcom/tesla/command_utils/usecase/CommandSigningRequirement;", "a", "(Ljava/lang/String;)Lcom/tesla/command_utils/usecase/CommandSigningRequirement;", "Lbe0/e;", "command-utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e getVehicleData;

    public a(e getVehicleData) {
        s.k(getVehicleData, "getVehicleData");
        this.getVehicleData = getVehicleData;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    public final CommandSigningRequirement a(String vin) {
        CommandSigningRequirement commandSigningRequirement;
        s.k(vin, "vin");
        JSONObject jSONObjectH = this.getVehicleData.h(vin);
        if (jSONObjectH != null) {
            String strOptString = jSONObjectH.optString("command_signing");
            if (strOptString == null) {
                commandSigningRequirement = CommandSigningRequirement.ALLOWED;
            } else {
                int iHashCode = strOptString.hashCode();
                if (iHashCode != -911343192) {
                    if (iHashCode != -393139297) {
                        if (iHashCode == 109935 && strOptString.equals(DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
                            commandSigningRequirement = CommandSigningRequirement.OFF;
                        } else {
                            commandSigningRequirement = CommandSigningRequirement.ALLOWED;
                        }
                    } else if (strOptString.equals("required")) {
                        commandSigningRequirement = CommandSigningRequirement.REQUIRED;
                    } else {
                        commandSigningRequirement = CommandSigningRequirement.ALLOWED;
                    }
                } else if (strOptString.equals("allowed")) {
                    commandSigningRequirement = CommandSigningRequirement.ALLOWED;
                } else {
                    commandSigningRequirement = CommandSigningRequirement.ALLOWED;
                }
            }
            if (commandSigningRequirement != null) {
                return commandSigningRequirement;
            }
        }
        return CommandSigningRequirement.ALLOWED;
    }
}
