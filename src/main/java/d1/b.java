package d1;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static int a(@NonNull AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }

    public static int b(@NonNull AudioRecord audioRecord, @NonNull AudioTimestamp audioTimestamp, int i11) {
        return audioRecord.getTimestamp(audioTimestamp, i11);
    }
}
