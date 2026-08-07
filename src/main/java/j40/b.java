package j40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Date;
import java.util.Map;
import jn0.x;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\f\u0010\n\u0014\u0015\u0016\u0017B/\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\f\u0010\u000b\u0082\u0001\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lj40/b;", "", "", "name", "Ljava/util/Date;", "timestamp", "", "rawEventDetails", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V", "c", "()Ljava/util/Map;", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "Ljava/util/Date;", "()Ljava/util/Date;", "Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "Lj40/b$a;", "Lj40/b$b;", "Lj40/b$c;", "Lj40/b$d;", "Lj40/b$e;", "Lj40/b$f;", "Lj40/b$g;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Date timestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> rawEventDetails;

    /* JADX INFO: renamed from: j40.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lj40/b$a;", "Lj40/b;", "Ljava/util/Date;", "timestamp", "<init>", "(Ljava/util/Date;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Date;", "b", "()Ljava/util/Date;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Cancel extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Date timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cancel(Date timestamp) {
            super("cancel", timestamp, null, 4, null);
            s.k(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        @Override // j40.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public Date getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Cancel) && s.f(this.timestamp, ((Cancel) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Cancel(timestamp=" + this.timestamp + ")";
        }
    }

    /* JADX INFO: renamed from: j40.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lj40/b$b;", "Lj40/b;", "Ljava/util/Date;", "timestamp", "", AnalyticsAttribute.Error, "<init>", "(Ljava/util/Date;Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Date;", "b", "()Ljava/util/Date;", "e", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failure extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Date timestamp;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable error;

        /* JADX WARN: Illegal instructions before constructor call */
        public Failure(Date timestamp, Throwable error) {
            s.k(timestamp, "timestamp");
            s.k(error, "error");
            String str = "failure";
            super(str, timestamp, z50.a.a(a.a(error, null)), null);
            this.timestamp = timestamp;
            this.error = error;
        }

        @Override // j40.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public Date getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return s.f(this.timestamp, failure.timestamp) && s.f(this.error, failure.error);
        }

        public int hashCode() {
            return (this.timestamp.hashCode() * 31) + this.error.hashCode();
        }

        public String toString() {
            return "Failure(timestamp=" + this.timestamp + ", error=" + this.error + ")";
        }
    }

    /* JADX INFO: renamed from: j40.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lj40/b$c;", "Lj40/b;", "Ljava/util/Date;", "timestamp", "<init>", "(Ljava/util/Date;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Date;", "b", "()Ljava/util/Date;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Launched extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Date timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Launched(Date timestamp) {
            super("launched", timestamp, null, 4, null);
            s.k(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        @Override // j40.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public Date getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Launched) && s.f(this.timestamp, ((Launched) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Launched(timestamp=" + this.timestamp + ")";
        }
    }

    /* JADX INFO: renamed from: j40.b$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lj40/b$d;", "Lj40/b;", "Ljava/util/Date;", "timestamp", "<init>", "(Ljava/util/Date;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Date;", "b", "()Ljava/util/Date;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Date timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(Date timestamp) {
            super("loaded", timestamp, null, 4, null);
            s.k(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        @Override // j40.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public Date getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && s.f(this.timestamp, ((Loaded) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Loaded(timestamp=" + this.timestamp + ")";
        }
    }

    /* JADX INFO: renamed from: j40.b$e, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lj40/b$e;", "Lj40/b;", "Ljava/util/Date;", "timestamp", "<init>", "(Ljava/util/Date;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Date;", "b", "()Ljava/util/Date;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OAuthLaunched extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Date timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OAuthLaunched(Date timestamp) {
            super("oauth-launched", timestamp, null, 4, null);
            s.k(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        @Override // j40.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public Date getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OAuthLaunched) && s.f(this.timestamp, ((OAuthLaunched) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "OAuthLaunched(timestamp=" + this.timestamp + ")";
        }
    }

    /* JADX INFO: renamed from: j40.b$f, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lj40/b$f;", "Lj40/b;", "Ljava/util/Date;", "timestamp", "<init>", "(Ljava/util/Date;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Date;", "b", "()Ljava/util/Date;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Retry extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Date timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Retry(Date timestamp) {
            super("retry", timestamp, null, 4, null);
            s.k(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        @Override // j40.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public Date getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Retry) && s.f(this.timestamp, ((Retry) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Retry(timestamp=" + this.timestamp + ")";
        }
    }

    /* JADX INFO: renamed from: j40.b$g, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lj40/b$g;", "Lj40/b;", "Ljava/util/Date;", "timestamp", "<init>", "(Ljava/util/Date;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Date;", "b", "()Ljava/util/Date;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final Date timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(Date timestamp) {
            super("success", timestamp, null, 4, null);
            s.k(timestamp, "timestamp");
            this.timestamp = timestamp;
        }

        @Override // j40.b
        /* JADX INFO: renamed from: b, reason: from getter */
        public Date getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && s.f(this.timestamp, ((Success) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Success(timestamp=" + this.timestamp + ")";
        }
    }

    public /* synthetic */ b(String str, Date date, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, map);
    }

    public Map<String, String> a() {
        return this.rawEventDetails;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public Date getTimestamp() {
        return this.timestamp;
    }

    public final Map<String, Object> c() {
        return v0.m(x.a("event_namespace", "partner-auth-lifecycle"), x.a("event_name", this.name), x.a("client_timestamp", String.valueOf(getTimestamp().getTime())), x.a("raw_event_details", new JSONObject(a()).toString()));
    }

    private b(String str, Date date, Map<String, String> map) {
        this.name = str;
        this.timestamp = date;
        this.rawEventDetails = map;
    }

    public /* synthetic */ b(String str, Date date, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, (i11 & 4) != 0 ? v0.i() : map, null);
    }
}
