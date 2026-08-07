package ji;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ii.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import jn0.m;
import jn0.x;
import okio.c0;
import okio.k;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lji/j;", "Lji/c;", "", "", "Lii/a0;", "uploads", "Lokio/k;", "operationByteString", "<init>", "(Ljava/util/Map;Lokio/k;)V", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;)Lokio/k;", "Lokio/i;", "", "writeUploadContents", "Ljn0/h0;", "e", "(Lokio/i;Z)V", "bufferedSink", "a", "(Lokio/i;)V", "Ljava/util/Map;", "b", "Lokio/k;", "c", "Ljava/lang/String;", "boundary", "getContentType", "()Ljava/lang/String;", CMSAttributeTableGenerator.CONTENT_TYPE, "", "Lkotlin/Lazy;", "getContentLength", "()J", "contentLength", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, a0> uploads;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k operationByteString;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String boundary;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String contentType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy contentLength;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Long;"}, k = 3, mv = {1, 5, 1})
    static final class a extends u implements wn0.a<Long> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            ji.a aVar = new ji.a(c0.b());
            okio.i iVarC = c0.c(aVar);
            j.this.e(iVarC, false);
            iVarC.flush();
            long bytesWritten = aVar.getBytesWritten();
            Iterator it = j.this.uploads.values().iterator();
            long contentLength = 0;
            while (it.hasNext()) {
                contentLength += ((a0) it.next()).getContentLength();
            }
            return Long.valueOf(bytesWritten + contentLength);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(Map<String, ? extends a0> uploads, k operationByteString) {
        s.k(uploads, "uploads");
        s.k(operationByteString, "operationByteString");
        this.uploads = uploads;
        this.operationByteString = operationByteString;
        UUID uuidRandomUUID = UUID.randomUUID();
        s.j(uuidRandomUUID, "randomUUID()");
        String string = uuidRandomUUID.toString();
        s.j(string, "uuid4().toString()");
        this.boundary = string;
        this.contentType = "multipart/form-data; boundary=" + string;
        this.contentLength = m.b(new a());
    }

    private final k d(Map<String, ? extends a0> uploads) {
        okio.h hVar = new okio.h();
        mi.c cVar = new mi.c(hVar, null);
        Set<Map.Entry<String, ? extends a0>> setEntrySet = uploads.entrySet();
        ArrayList arrayList = new ArrayList(v.y(setEntrySet, 10));
        int i11 = 0;
        for (Object obj : setEntrySet) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            arrayList.add(x.a(String.valueOf(i11), v.e(((Map.Entry) obj).getKey())));
            i11 = i12;
        }
        mi.b.a(cVar, v0.y(arrayList));
        return hVar.m1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(okio.i iVar, boolean z11) {
        iVar.l2("--" + this.boundary + "\r\n");
        iVar.l2("Content-Disposition: form-data; name=\"operations\"\r\n");
        iVar.l2("Content-Type: application/json\r\n");
        iVar.l2("Content-Length: " + this.operationByteString.D() + "\r\n");
        iVar.l2("\r\n");
        iVar.A1(this.operationByteString);
        k kVarD = d(this.uploads);
        iVar.l2("\r\n--" + this.boundary + "\r\n");
        iVar.l2("Content-Disposition: form-data; name=\"map\"\r\n");
        iVar.l2("Content-Type: application/json\r\n");
        iVar.l2("Content-Length: " + kVarD.D() + "\r\n");
        iVar.l2("\r\n");
        iVar.A1(kVarD);
        int i11 = 0;
        for (Object obj : this.uploads.values()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                v.x();
            }
            a0 a0Var = (a0) obj;
            iVar.l2("\r\n--" + this.boundary + "\r\n");
            iVar.l2("Content-Disposition: form-data; name=\"" + i11 + CoreConstants.DOUBLE_QUOTE_CHAR);
            if (a0Var.getFileName() != null) {
                iVar.l2("; filename=\"" + a0Var.getFileName() + CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            iVar.l2("\r\n");
            iVar.l2("Content-Type: " + a0Var.getContentType() + "\r\n");
            long contentLength = a0Var.getContentLength();
            if (contentLength != -1) {
                iVar.l2("Content-Length: " + contentLength + "\r\n");
            }
            iVar.l2("\r\n");
            if (z11) {
                a0Var.a(iVar);
            }
            i11 = i12;
        }
        iVar.l2("\r\n--" + this.boundary + "--\r\n");
    }

    @Override // ji.c
    public void a(okio.i bufferedSink) {
        s.k(bufferedSink, "bufferedSink");
        e(bufferedSink, true);
    }

    @Override // ji.c
    public long getContentLength() {
        return ((Number) this.contentLength.getValue()).longValue();
    }

    @Override // ji.c
    public String getContentType() {
        return this.contentType;
    }
}
