package com.tesla.messagedecoding;

import fc0.x4;
import id0.StreamMessageInfo;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/messagedecoding/b;", "", "<init>", "()V", "Lfc0/x4;", "message", "Lcom/tesla/messagedecoding/b$a;", "a", "(Lfc0/x4;)Lcom/tesla/messagedecoding/b$a;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f56478a = new b();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/messagedecoding/b$a;", "", "<init>", "()V", "a", "b", "Lcom/tesla/messagedecoding/b$a$a;", "Lcom/tesla/messagedecoding/b$a$b;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: com.tesla.messagedecoding.b$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/tesla/messagedecoding/b$a$a;", "Lcom/tesla/messagedecoding/b$a;", "Lid0/e;", "streamMessageInfo", "<init>", "(Lid0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lid0/e;", "()Lid0/e;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final StreamMessageInfo streamMessageInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(StreamMessageInfo streamMessageInfo) {
                super(null);
                s.k(streamMessageInfo, "streamMessageInfo");
                this.streamMessageInfo = streamMessageInfo;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final StreamMessageInfo getStreamMessageInfo() {
                return this.streamMessageInfo;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && s.f(this.streamMessageInfo, ((Success) other).streamMessageInfo);
            }

            public int hashCode() {
                return this.streamMessageInfo.hashCode();
            }

            public String toString() {
                return "Success(streamMessageInfo=" + this.streamMessageInfo + ")";
            }
        }

        /* JADX INFO: renamed from: com.tesla.messagedecoding.b$a$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/b$a$b;", "Lcom/tesla/messagedecoding/b$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ThrownError extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Exception exception;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrownError(Exception exception) {
                super(null);
                s.k(exception, "exception");
                this.exception = exception;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Exception getException() {
                return this.exception;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ThrownError) && s.f(this.exception, ((ThrownError) other).exception);
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "ThrownError(exception=" + this.exception + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private b() {
    }

    public final a a(x4 message) {
        s.k(message, "message");
        try {
            JSONObject jSONObject = new JSONObject(message.getData_().K());
            return new a.Success(new StreamMessageInfo(s.f(jSONObject.optString("msg_type"), "control:pong"), jSONObject));
        } catch (Exception e11) {
            return new a.ThrownError(e11);
        }
    }
}
