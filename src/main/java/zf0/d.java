package zf0;

import android.media.AudioRecord;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzf0/c;", "a", "()Lzf0/c;", "", "", "Ljava/util/List;", "SAMPLE_RATES", "camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Integer> f128174a = p013kotlin.collections.v.p(48000, 44100, 22050, 16000, 11025, Integer.valueOf(ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED));

    public static final AudioConfiguration a() throws Throwable {
        Iterator<Integer> it = f128174a.iterator();
        while (true) {
            AudioRecord audioRecord = null;
            if (!it.hasNext()) {
                return null;
            }
            int iIntValue = it.next().intValue();
            try {
                int minBufferSize = AudioRecord.getMinBufferSize(iIntValue, 16, 2);
                if (minBufferSize != -2) {
                    AudioRecord audioRecord2 = new AudioRecord(1, iIntValue, 16, 2, minBufferSize);
                    try {
                        if (audioRecord2.getState() == 1) {
                            audioRecord2.release();
                            AudioConfiguration audioConfiguration = new AudioConfiguration(iIntValue, 16, 2, minBufferSize);
                            audioRecord2.release();
                            return audioConfiguration;
                        }
                        audioRecord2.release();
                    } catch (IllegalArgumentException unused) {
                        audioRecord = audioRecord2;
                        if (audioRecord != null) {
                            audioRecord.release();
                        }
                    } catch (SecurityException unused2) {
                        audioRecord = audioRecord2;
                        if (audioRecord != null) {
                            audioRecord.release();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        audioRecord = audioRecord2;
                        if (audioRecord != null) {
                            audioRecord.release();
                        }
                        throw th;
                    }
                }
            } catch (IllegalArgumentException unused3) {
            } catch (SecurityException unused4) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }
}
