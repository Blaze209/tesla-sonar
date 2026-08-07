package xy;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lxy/b;", "", "<init>", "()V", "", "audioModeString", "", "c", "(Ljava/lang/String;)Ljava/lang/Integer;", "focusModeString", "e", "usageTypeString", "b", "contentTypeString", "a", "streamTypeString", DateTokenConverter.CONVERTER_KEY, "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f124060a = new b();

    private b() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Integer a(String contentTypeString) {
        if (contentTypeString == null) {
            return null;
        }
        switch (contentTypeString.hashCode()) {
            case -1875239668:
                if (contentTypeString.equals("sonification")) {
                    return 4;
                }
                break;
            case -896071454:
                if (contentTypeString.equals("speech")) {
                    return 1;
                }
                break;
            case -284840886:
                if (contentTypeString.equals("unknown")) {
                    return 0;
                }
                break;
            case 104087344:
                if (contentTypeString.equals("movie")) {
                    return 3;
                }
                break;
            case 104263205:
                if (contentTypeString.equals("music")) {
                    return 2;
                }
                break;
        }
        Log.w("AudioManagerUtils", "Unknown audio attributes content type: " + contentTypeString);
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Integer b(String usageTypeString) {
        if (usageTypeString == null) {
            return null;
        }
        switch (usageTypeString.hashCode()) {
            case -1595878289:
                if (usageTypeString.equals("notificationEvent")) {
                    return 10;
                }
                break;
            case -402776124:
                if (usageTypeString.equals("voiceCommunication")) {
                    return 2;
                }
                break;
            case -284840886:
                if (usageTypeString.equals("unknown")) {
                    return 0;
                }
                break;
            case 3165170:
                if (usageTypeString.equals("game")) {
                    return 14;
                }
                break;
            case 92357732:
                if (usageTypeString.equals("assistanceSonification")) {
                    return 13;
                }
                break;
            case 92895825:
                if (usageTypeString.equals("alarm")) {
                    return 4;
                }
                break;
            case 103772132:
                if (usageTypeString.equals("media")) {
                    return 1;
                }
                break;
            case 595233003:
                if (usageTypeString.equals("notification")) {
                    return 5;
                }
                break;
            case 652838134:
                if (usageTypeString.equals("assistanceAccessibility")) {
                    return 11;
                }
                break;
            case 963251629:
                if (usageTypeString.equals("notificationRingtone")) {
                    return 6;
                }
                break;
            case 1429828318:
                if (usageTypeString.equals("assistant")) {
                    return 16;
                }
                break;
            case 1718569700:
                if (usageTypeString.equals("assistanceNavigationGuidance")) {
                    return 12;
                }
                break;
            case 1766760834:
                if (usageTypeString.equals("voiceCommunicationSignalling")) {
                    return 3;
                }
                break;
        }
        Log.w("AudioManagerUtils", "Unknown audio attributes usage type: " + usageTypeString);
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Integer c(String audioModeString) {
        if (audioModeString == null) {
            return null;
        }
        switch (audioModeString.hashCode()) {
            case -2057740488:
                if (audioModeString.equals("callScreening")) {
                    return 4;
                }
                break;
            case -1236583518:
                if (audioModeString.equals("ringtone")) {
                    return 1;
                }
                break;
            case -1185226461:
                if (audioModeString.equals("inCall")) {
                    return 2;
                }
                break;
            case -1039745817:
                if (audioModeString.equals("normal")) {
                    return 0;
                }
                break;
            case -634046799:
                if (audioModeString.equals("inCommunication")) {
                    return 3;
                }
                break;
        }
        Log.w("AudioManagerUtils", "Unknown audio mode: " + audioModeString);
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Integer d(String streamTypeString) {
        if (streamTypeString == null) {
            return null;
        }
        switch (streamTypeString.hashCode()) {
            case -1019550032:
                if (streamTypeString.equals("voiceCall")) {
                    return 0;
                }
                break;
            case -887328209:
                if (streamTypeString.equals("system")) {
                    return 1;
                }
                break;
            case -213139122:
                if (streamTypeString.equals("accessibility")) {
                    return 10;
                }
                break;
            case 3094057:
                if (streamTypeString.equals("dtmf")) {
                    return 8;
                }
                break;
            case 3500592:
                if (streamTypeString.equals("ring")) {
                    return 2;
                }
                break;
            case 92895825:
                if (streamTypeString.equals("alarm")) {
                    return 4;
                }
                break;
            case 104263205:
                if (streamTypeString.equals("music")) {
                    return 3;
                }
                break;
            case 595233003:
                if (streamTypeString.equals("notification")) {
                    return 5;
                }
                break;
        }
        Log.w("AudioManagerUtils", "Unknown audio stream type: " + streamTypeString);
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Integer e(String focusModeString) {
        if (focusModeString == null) {
            return null;
        }
        switch (focusModeString.hashCode()) {
            case -1600850485:
                if (focusModeString.equals("gainTransient")) {
                    return 2;
                }
                break;
            case -1587200749:
                if (focusModeString.equals("gainTransientExclusive")) {
                    return 4;
                }
                break;
            case -973361293:
                if (focusModeString.equals("gainTransientMayDuck")) {
                    return 3;
                }
                break;
            case 3165055:
                if (focusModeString.equals("gain")) {
                    return 1;
                }
                break;
        }
        Log.w("AudioManagerUtils", "Unknown audio focus mode: " + focusModeString);
        return null;
    }
}
