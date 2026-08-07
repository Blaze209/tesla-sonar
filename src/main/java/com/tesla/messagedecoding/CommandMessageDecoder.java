package com.tesla.messagedecoding;

import androidx.annotation.Keep;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.tesla.logging.g;
import kc0.c;
import okio.k;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import sc0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\t\u0010\bJC\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\bJE\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder;", "", "<init>", "()V", "Lkc0/c;", "commandMessage", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "b", "(Lkc0/c;)Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "e", "Lid0/a;", "messageDecrypter", "", "vin", "", "requestTag", "vehicleKeyHex", DateTokenConverter.CONVERTER_KEY, "(Lkc0/c;Lid0/a;Ljava/lang/String;[BLjava/lang/String;)Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "c", "a", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Result", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommandMessageDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CommandMessageDecoder f56395a = new CommandMessageDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("CommandMessageDecoder");

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "", "<init>", "()V", "c", "f", DateTokenConverter.CONVERTER_KEY, "e", "a", "b", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$a;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$c;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$d;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$e;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$f;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Result {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$a;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f56397a = new a();

            private a() {
                super(null);
            }

            public String toString() {
                return "APPLICATION ACK";
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "<init>", "()V", "f", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "g", "b", "c", "a", "e", DateTokenConverter.CONVERTER_KEY, "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$a;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$b;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$c;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$d;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$e;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$f;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$g;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$h;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$i;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$j;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$k;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$l;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class b extends Result {

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$a;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class a extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f56398a = new a();

                private a() {
                    super(null);
                }

                public String toString() {
                    return "ApplicationError";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.CommandMessageDecoder$Result$b$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$b;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class C1132b extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C1132b f56399a = new C1132b();

                private C1132b() {
                    super(null);
                }

                public String toString() {
                    return "HermesInternalError";
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$c;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class c extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final c f56400a = new c();

                private c() {
                    super(null);
                }

                public String toString() {
                    return "InvalidMessageError";
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$d;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class d extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final d f56401a = new d();

                private d() {
                    super(null);
                }

                public String toString() {
                    return "InvalidUserTokenError";
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$e;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class e extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final e f56402a = new e();

                private e() {
                    super(null);
                }

                public String toString() {
                    return "InvalidVehicleTokenError";
                }
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$f;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "()Ljava/lang/Exception;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class f extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final Exception exception;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(Exception exception) {
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
                    return (other instanceof f) && s.f(this.exception, ((f) other).exception);
                }

                public int hashCode() {
                    return this.exception.hashCode();
                }

                public String toString() {
                    String message = this.exception.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    return "exception error: " + message;
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$g;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class g extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final g f56404a = new g();

                private g() {
                    super(null);
                }

                public String toString() {
                    return "TooManyRequestsError";
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$h;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b;", "Lkc0/a;", "commandType", "<init>", "(Lkc0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkc0/a;", "getCommandType", "()Lkc0/a;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class h extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final kc0.a commandType;

                public h(kc0.a aVar) {
                    super(null);
                    this.commandType = aVar;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof h) && this.commandType == ((h) other).commandType;
                }

                public int hashCode() {
                    kc0.a aVar = this.commandType;
                    if (aVar == null) {
                        return 0;
                    }
                    return aVar.hashCode();
                }

                public String toString() {
                    return "unsupported command type: " + this.commandType;
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$i;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b;", "Lkc0/g;", "statusCode", "<init>", "(Lkc0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkc0/g;", "getStatusCode", "()Lkc0/g;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class i extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final kc0.g statusCode;

                public i(kc0.g gVar) {
                    super(null);
                    this.statusCode = gVar;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof i) && this.statusCode == ((i) other).statusCode;
                }

                public int hashCode() {
                    kc0.g gVar = this.statusCode;
                    if (gVar == null) {
                        return 0;
                    }
                    return gVar.hashCode();
                }

                public String toString() {
                    return "unsupported ok: " + this.statusCode;
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$j;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b;", "Lkc0/g;", "statusCode", "<init>", "(Lkc0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkc0/g;", "getStatusCode", "()Lkc0/g;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class j extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final kc0.g statusCode;

                public j(kc0.g gVar) {
                    super(null);
                    this.statusCode = gVar;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof j) && this.statusCode == ((j) other).statusCode;
                }

                public int hashCode() {
                    kc0.g gVar = this.statusCode;
                    if (gVar == null) {
                        return 0;
                    }
                    return gVar.hashCode();
                }

                public String toString() {
                    return "unsupported signed command error: " + this.statusCode;
                }
            }

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$k;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b;", "Lkc0/g;", "statusCode", "<init>", "(Lkc0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkc0/g;", "getStatusCode", "()Lkc0/g;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class k extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final kc0.g statusCode;

                public k(kc0.g gVar) {
                    super(null);
                    this.statusCode = gVar;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof k) && this.statusCode == ((k) other).statusCode;
                }

                public int hashCode() {
                    kc0.g gVar = this.statusCode;
                    if (gVar == null) {
                        return 0;
                    }
                    return gVar.hashCode();
                }

                public String toString() {
                    return "unsupported signed command: " + this.statusCode;
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b$l;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class l extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final l f56409a = new l();

                private l() {
                    super(null);
                }

                public String toString() {
                    return "VehicleNotConnectedError";
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$c;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "<init>", "()V", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class c extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f56410a = new c();

            private c() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$d;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "result", "Lsc0/h;", "routableMessage", "<init>", "(Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;Lsc0/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "()Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "b", "Lsc0/h;", "()Lsc0/h;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class d extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final RoutableMessageDecoder.Result result;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final h routableMessage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(RoutableMessageDecoder.Result result, h routableMessage) {
                super(null);
                s.k(result, "result");
                s.k(routableMessage, "routableMessage");
                this.result = result;
                this.routableMessage = routableMessage;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final RoutableMessageDecoder.Result getResult() {
                return this.result;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final h getRoutableMessage() {
                return this.routableMessage;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof d)) {
                    return false;
                }
                d dVar = (d) other;
                return s.f(this.result, dVar.result) && s.f(this.routableMessage, dVar.routableMessage);
            }

            public int hashCode() {
                return (this.result.hashCode() * 31) + this.routableMessage.hashCode();
            }

            public String toString() {
                return "routable success: [" + this.result + "]";
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$e;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class e extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f56413a = new e();

            private e() {
                super(null);
            }

            public String toString() {
                return "SERVER ACK";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/tesla/messagedecoding/CommandMessageDecoder$Result$f;", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "Lorg/json/JSONObject;", "iceConfig", "<init>", "(Lorg/json/JSONObject;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class f extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final JSONObject iceConfig;

            public f(JSONObject jSONObject) {
                super(null);
                this.iceConfig = jSONObject;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final JSONObject getIceConfig() {
                return this.iceConfig;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof f) && s.f(this.iceConfig, ((f) other).iceConfig);
            }

            public int hashCode() {
                JSONObject jSONObject = this.iceConfig;
                if (jSONObject == null) {
                    return 0;
                }
                return jSONObject.hashCode();
            }

            public String toString() {
                return "success" + (this.iceConfig == null ? "" : " ice config");
            }
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Result() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f56416b;

        static {
            int[] iArr = new int[kc0.a.values().length];
            try {
                iArr[kc0.a.COMMAND_TYPE_OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kc0.a.COMMAND_TYPE_STREAMING_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kc0.a.COMMAND_TYPE_SIGNED_COMMAND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kc0.a.COMMAND_TYPE_SIGNED_COMMAND_RESPONSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kc0.a.COMMAND_TYPE_SIGNED_COMMAND_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[kc0.a.COMMAND_TYPE_ERROR_RESPONSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[kc0.a.COMMAND_TYPE_GET_VAULT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[kc0.a.COMMAND_TYPE_SAVE_VAULT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[kc0.a.COMMAND_TYPE_DEVICE_CONNECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[kc0.a.COMMAND_TYPE_DEVICE_DISCONNECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f56415a = iArr;
            int[] iArr2 = new int[kc0.g.values().length];
            try {
                iArr2[kc0.g.STATUS_CODE_OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[kc0.g.STATUS_CODE_INVALID_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[kc0.g.STATUS_CODE_PERMISSION_DENIED_NO_TOKEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[kc0.g.STATUS_CODE_PERMISSION_DENIED_EXPIRED_TOKEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[kc0.g.STATUS_CODE_TOO_MANY_REQUESTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[kc0.g.STATUS_CODE_APPLICATION_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[kc0.g.STATUS_CODE_INVALID_MESSAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[kc0.g.STATUS_CODE_PUBLISH_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[kc0.g.STATUS_CODE_PUBLISH_FAILED_NOT_CONNECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[kc0.g.STATUS_CODE_SERVER_ACK.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[kc0.g.STATUS_CODE_CLIENT_ACK.ordinal()] = 11;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[kc0.g.STATUS_CODE_INTERNAL_ERROR.ordinal()] = 12;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[kc0.g.STATUS_CODE_APPLICATION_OK.ordinal()] = 13;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[kc0.g.STATUS_CODE_APPLICATION_ACK.ordinal()] = 14;
            } catch (NoSuchFieldError unused24) {
            }
            f56416b = iArr2;
        }
    }

    private CommandMessageDecoder() {
    }

    private final Result b(c commandMessage) {
        kc0.g gVarA = kc0.g.INSTANCE.a(commandMessage.getStatus_code());
        switch (gVarA == null ? -1 : a.f56416b[gVarA.ordinal()]) {
            case -1:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return new Result.b.i(gVarA);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return Result.c.f56410a;
            case 2:
            case 3:
            case 4:
                return s.f(commandMessage.getRequest_txid(), k.f97943e) ? Result.b.d.f56401a : Result.b.e.f56402a;
            case 5:
                return Result.b.g.f56404a;
            case 6:
                return Result.b.a.f56398a;
            case 7:
                return Result.b.c.f56400a;
            case 8:
                return Result.b.C1132b.f56399a;
            case 9:
                return Result.b.l.f56409a;
        }
    }

    private final Result c(c commandMessage) {
        kc0.g gVarA = kc0.g.INSTANCE.a(commandMessage.getStatus_code());
        switch (gVarA == null ? -1 : a.f56416b[gVarA.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                return new Result.b.j(gVarA);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 12:
                return Result.b.C1132b.f56399a;
        }
    }

    private final Result d(c commandMessage, id0.a messageDecrypter, String vin, byte[] requestTag, String vehicleKeyHex) {
        kc0.g gVarA = kc0.g.INSTANCE.a(commandMessage.getStatus_code());
        switch (gVarA == null ? -1 : a.f56416b[gVarA.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
                return new Result.b.k(gVarA);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 10:
                return Result.e.f56413a;
            case 13:
                try {
                    h hVarDecode = h.f111089m.decode(commandMessage.getPayload());
                    return new Result.d(RoutableMessageDecoder.f56417a.b(hVarDecode, messageDecrypter, vin, requestTag, vehicleKeyHex), hVarDecode);
                } catch (Exception e11) {
                    logger.d("exception occurred decoding application response", e11);
                    return new Result.b.f(e11);
                }
            case 14:
                return Result.a.f56397a;
        }
    }

    private final Result e(c commandMessage) {
        try {
            return new Result.f(new JSONObject(commandMessage.getPayload().K()));
        } catch (Exception e11) {
            return new Result.b.f(e11);
        }
    }

    public final Result a(c commandMessage, id0.a messageDecrypter, String vin, byte[] requestTag, String vehicleKeyHex) {
        s.k(commandMessage, "commandMessage");
        kc0.a aVarA = kc0.a.INSTANCE.a(commandMessage.getCommand_type());
        switch (aVarA == null ? -1 : a.f56415a[aVarA.ordinal()]) {
            case -1:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return new Result.b.h(aVarA);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return b(commandMessage);
            case 2:
                return e(commandMessage);
            case 3:
            case 4:
                return d(commandMessage, messageDecrypter, vin, requestTag, vehicleKeyHex);
            case 5:
                return c(commandMessage);
        }
    }
}
