package atd.a;

import android.media.AudioTrack;
import android.os.Process;
import android.view.ViewConfiguration;
import com.adyen.threeds2.ThreeDS2Service;
import com.adyen.threeds2.customization.UiCustomization;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Constructor;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface ChallengeResultError extends ThreeDS2Service {
    public static final ChallengeResultError getSDKReferenceNumber;

    static {
        try {
            Map map = getMessageVersion.timedout;
            Object declaredConstructor = map.get(-825224929);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) getMessageVersion.getSDKTransactionID(141 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 31 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getDeclaredConstructor(null);
                map.put(-825224929, declaredConstructor);
            }
            getSDKReferenceNumber = (ChallengeResultError) ((Constructor) declaredConstructor).newInstance(null);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    UiCustomization getSDKAppID();
}
