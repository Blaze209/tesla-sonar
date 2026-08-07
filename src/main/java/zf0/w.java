package zf0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lzf0/w;", "", "c", DateTokenConverter.CONVERTER_KEY, "e", "a", "b", "Lzf0/w$a;", "Lzf0/w$b;", "Lzf0/w$c;", "Lzf0/w$d;", "Lzf0/w$e;", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface w {

    /* JADX INFO: renamed from: zf0.w$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lzf0/w$a;", "Lzf0/w;", "", "wasRecordingInterrupted", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Closed implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean wasRecordingInterrupted;

        public Closed(boolean z11) {
            this.wasRecordingInterrupted = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getWasRecordingInterrupted() {
            return this.wasRecordingInterrupted;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Closed) && this.wasRecordingInterrupted == ((Closed) other).wasRecordingInterrupted;
        }

        public int hashCode() {
            return Boolean.hashCode(this.wasRecordingInterrupted);
        }

        public String toString() {
            return "Closed(wasRecordingInterrupted=" + this.wasRecordingInterrupted + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzf0/w$b;", "Lzf0/w;", "<init>", "()V", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f128330a = new b();

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzf0/w$c;", "Lzf0/w;", "<init>", "()V", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f128331a = new c();

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzf0/w$d;", "Lzf0/w;", "<init>", "()V", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f128332a = new d();

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzf0/w$e;", "Lzf0/w;", "<init>", "()V", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f128333a = new e();

        private e() {
        }
    }
}
