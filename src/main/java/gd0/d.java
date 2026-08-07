package gd0;

import ce0.TeslaCommandRequest;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.tesla.logging.g;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import rc0.n;
import rc0.o;
import sc0.f;
import sc0.h;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007JM\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u001a\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lgd0/d;", "", "<init>", "()V", "", "", "g", "(I)[B", "Lce0/j;", "request", "vehicleClockSeconds", "epoch", "counter", "Lsc0/b;", "domain", "", "vin", "expiresInSeconds", "flags", "Lgd0/d$a;", "c", "(Lce0/j;I[BILsc0/b;Ljava/lang/String;II)Lgd0/d$a;", "Lsc0/h;", "routableMessage", "requestTag", "Lgd0/a;", "e", "(Lce0/j;Ljava/lang/String;Lsc0/h;[BILsc0/b;)Lgd0/a;", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "logger", "a", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f68771a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("MetadataBuilder");

    /* JADX INFO: renamed from: gd0.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lgd0/d$a;", "", "Lgd0/a;", OrcaKeys.METADATA, "", PermissionsResponse.EXPIRES_KEY, "<init>", "(Lgd0/a;I)V", "a", "()Lgd0/a;", "b", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgd0/a;", "getMetadata", "I", "getExpires", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a metadata;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int expires;

        public Result(a metadata, int i11) {
            s.k(metadata, "metadata");
            this.metadata = metadata;
            this.expires = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getMetadata() {
            return this.metadata;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getExpires() {
            return this.expires;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return s.f(this.metadata, result.metadata) && this.expires == result.expires;
        }

        public int hashCode() {
            return (this.metadata.hashCode() * 31) + Integer.hashCode(this.expires);
        }

        public String toString() {
            return "Result(metadata=" + this.metadata + ", expires=" + this.expires + ")";
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d(TeslaCommandRequest teslaCommandRequest, String log) {
        s.k(log, "log");
        de0.a.f(teslaCommandRequest, log, logger, com.tesla.logging.d.DEBUG, false, 8, null);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 f(TeslaCommandRequest teslaCommandRequest, String log) {
        s.k(log, "log");
        de0.a.f(teslaCommandRequest, log, logger, com.tesla.logging.d.DEBUG, false, 8, null);
        return h0.f84049a;
    }

    private final byte[] g(int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4);
        byteArrayOutputStream.write((i11 >> 24) & 255);
        byteArrayOutputStream.write((i11 >> 16) & 255);
        byteArrayOutputStream.write((i11 >> 8) & 255);
        byteArrayOutputStream.write(i11 & 255);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        s.j(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final Result c(final TeslaCommandRequest request, int vehicleClockSeconds, byte[] epoch, int counter, sc0.b domain, String vin, int expiresInSeconds, int flags) {
        s.k(request, "request");
        s.k(epoch, "epoch");
        s.k(domain, "domain");
        s.k(vin, "vin");
        int i11 = vehicleClockSeconds + expiresInSeconds;
        g gVar = logger;
        com.tesla.logging.d dVar = com.tesla.logging.d.DEBUG;
        de0.a.f(request, vin + " vehicle clock time: " + vehicleClockSeconds + " expires at time " + i11 + " (" + (i11 - vehicleClockSeconds) + " seconds).", gVar, dVar, false, 8, null);
        a aVar = new a(new l() { // from class: gd0.b
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d.d(request, (String) obj);
            }
        });
        aVar.b(o.TAG_SIGNATURE_TYPE, n.SIGNATURE_TYPE_AES_GCM_PERSONALIZED.getValue());
        aVar.b(o.TAG_DOMAIN, domain.getValue());
        aVar.c(o.TAG_PERSONALIZATION, vin);
        aVar.a(o.TAG_EPOCH, epoch);
        aVar.a(o.TAG_EXPIRES_AT, g(i11));
        aVar.a(o.TAG_COUNTER, g(counter));
        if (flags > 0) {
            aVar.a(o.TAG_FLAGS, g(flags));
        }
        aVar.d();
        de0.a.f(request, vin + " request metadata: " + ie0.n.e(aVar.e(), 0, 1, null), gVar, dVar, false, 8, null);
        return new Result(aVar, i11);
    }

    public final a e(final TeslaCommandRequest request, String vin, h routableMessage, byte[] requestTag, int counter, sc0.b domain) throws IOException {
        sc0.d signed_message_fault;
        s.k(vin, "vin");
        s.k(routableMessage, "routableMessage");
        s.k(requestTag, "requestTag");
        s.k(domain, "domain");
        a aVar = new a(new l() { // from class: gd0.c
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return d.f(request, (String) obj);
            }
        });
        byte[] bArrG = p013kotlin.collections.n.G(new byte[]{(byte) n.SIGNATURE_TYPE_AES_GCM_PERSONALIZED.getValue()}, requestTag);
        aVar.b(o.TAG_SIGNATURE_TYPE, n.SIGNATURE_TYPE_AES_GCM_RESPONSE.getValue());
        aVar.b(o.TAG_DOMAIN, domain.getValue());
        aVar.c(o.TAG_PERSONALIZATION, vin);
        aVar.a(o.TAG_COUNTER, g(counter));
        aVar.a(o.TAG_FLAGS, g(routableMessage.getFlags()));
        aVar.a(o.TAG_REQUEST_HASH, bArrG);
        f signedMessageStatus = routableMessage.getSignedMessageStatus();
        aVar.a(o.TAG_FAULT, g((signedMessageStatus == null || (signed_message_fault = signedMessageStatus.getSigned_message_fault()) == null) ? sc0.d.MESSAGEFAULT_ERROR_NONE.getValue() : signed_message_fault.getValue()));
        de0.a.f(request, "built response metadata: " + ie0.n.e(aVar.e(), 0, 1, null), logger, com.tesla.logging.d.DEBUG, false, 8, null);
        aVar.d();
        return aVar;
    }
}
