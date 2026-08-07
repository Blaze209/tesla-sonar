package ap;

import android.text.SpannableStringBuilder;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lap/n;", "", "", "start", "end", "Lap/i;", "what", "<init>", "(IILap/i;)V", "Landroid/text/SpannableStringBuilder;", "builder", "priorityIndex", "Ljn0/h0;", "a", "(Landroid/text/SpannableStringBuilder;I)V", "I", "b", "c", "Lap/i;", DateTokenConverter.CONVERTER_KEY, "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int end;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final i what;

    public n(int i11, int i12, i what) {
        s.k(what, "what");
        this.start = i11;
        this.end = i12;
        this.what = what;
    }

    public final void a(SpannableStringBuilder builder, int priorityIndex) {
        s.k(builder, "builder");
        if (priorityIndex < 0) {
            throw new IllegalStateException("Check failed.");
        }
        int i11 = this.start == 0 ? 18 : 34;
        int i12 = 255 - priorityIndex;
        if (i12 < 0) {
            qk.a.I("SetSpanOperation", "Text tree size exceeded the limit, styling may become unpredictable");
        }
        builder.setSpan(this.what, this.start, this.end, ((Math.max(i12, 0) << 16) & 16711680) | (i11 & (-16711681)));
    }
}
