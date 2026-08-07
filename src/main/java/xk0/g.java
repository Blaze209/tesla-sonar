package xk0;

import bl0.o;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ll0.j;
import ll0.k;
import ll0.s;
import ll0.w;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010+\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u0010\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lxk0/g;", "Lcl0/b$d;", "", "Lcl0/c;", "parts", "", "boundary", "Lbl0/c;", CMSAttributeTableGenerator.CONTENT_TYPE, "<init>", "(Ljava/util/List;Ljava/lang/String;Lbl0/c;)V", "Lio/ktor/utils/io/j;", "channel", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lio/ktor/utils/io/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/lang/String;", "getBoundary", "()Ljava/lang/String;", "b", "Lbl0/c;", "()Lbl0/c;", "", "c", "[B", "BOUNDARY_BYTES", "LAST_BOUNDARY_BYTES", "", "e", "I", "BODY_OVERHEAD_SIZE", "f", "PART_OVERHEAD_SIZE", "Lxk0/h;", "g", "Ljava/util/List;", "rawParts", "", "<set-?>", "h", "Ljava/lang/Long;", "()Ljava/lang/Long;", "contentLength", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g extends cl0.b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String boundary;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bl0.c contentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final byte[] BOUNDARY_BYTES;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final byte[] LAST_BOUNDARY_BYTES;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int BODY_OVERHEAD_SIZE;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int PART_OVERHEAD_SIZE;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<h> rawParts;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Long contentLength;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lll0/k;", "b", "()Lll0/k;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<k> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f123655c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(byte[] bArr) {
            super(0);
            this.f123655c = bArr;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            byte[] bArr = this.f123655c;
            j jVar = new j(null, 1, null);
            try {
                s.d(jVar, bArr, 0, 0, 6, null);
                return jVar.T0();
            } catch (Throwable th2) {
                jVar.release();
                throw th2;
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.request.forms.MultiPartFormDataContent", f = "FormDataContent.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 6}, l = {116, 117, 118, 123, 127, 131, 134}, m = "writeTo", n = {"this", "channel", "part", "this", "channel", "part", "this", "channel", "part", "this", "channel", "$this$use$iv", "closed$iv", "this", "channel", "this", "channel", "channel"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "I$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f123656n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f123657o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f123658p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f123659q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f123660r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f123661s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f123663u;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f123661s = obj;
            this.f123663u |= Integer.MIN_VALUE;
            return g.this.d(null, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ g(List list, String str, bl0.c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i11 & 2) != 0 ? c.e() : str;
        this(list, str, (i11 & 4) != 0 ? bl0.c.C0353c.f17569a.a().g("boundary", str) : cVar);
    }

    @Override // cl0.b
    /* JADX INFO: renamed from: a, reason: from getter */
    public Long getContentLength() {
        return this.contentLength;
    }

    @Override // cl0.b
    /* JADX INFO: renamed from: b, reason: from getter */
    public bl0.c getContentType() {
        return this.contentType;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d0 A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:44:0x00ca, B:46:0x00d0, B:50:0x00ed, B:53:0x0104, B:80:0x0182, B:84:0x019b, B:43:0x00c3), top: B:97:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104 A[Catch: all -> 0x0035, PHI: r2 r4 r5 r9
      0x0104: PHI (r2v19 java.util.Iterator<xk0.h>) = (r2v5 java.util.Iterator<xk0.h>), (r2v20 java.util.Iterator<xk0.h>) binds: [B:38:0x00a5, B:51:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r4v21 xk0.h) = (r4v6 xk0.h), (r4v23 xk0.h) binds: [B:38:0x00a5, B:51:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r5v12 xk0.g) = (r5v3 xk0.g), (r5v13 xk0.g) binds: [B:38:0x00a5, B:51:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x0104: PHI (r9v37 ??) = (r9v11 ??), (r9v55 ??) binds: [B:38:0x00a5, B:51:0x0100] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:44:0x00ca, B:46:0x00d0, B:50:0x00ed, B:53:0x0104, B:80:0x0182, B:84:0x019b, B:43:0x00c3), top: B:97:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x011b  */
    /* JADX WARN: Code duplicated, block: B:73:0x015a A[Catch: all -> 0x008e, TryCatch #6 {all -> 0x008e, blocks: (B:57:0x011e, B:59:0x0122, B:64:0x0149, B:73:0x015a, B:75:0x015e, B:72:0x0159, B:32:0x0089, B:37:0x00a2, B:40:0x00b9, B:60:0x012e, B:63:0x0147, B:27:0x0071, B:70:0x0157, B:69:0x0154, B:66:0x014f), top: B:97:0x0021, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x015e A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #6 {all -> 0x008e, blocks: (B:57:0x011e, B:59:0x0122, B:64:0x0149, B:73:0x015a, B:75:0x015e, B:72:0x0159, B:32:0x0089, B:37:0x00a2, B:40:0x00b9, B:60:0x012e, B:63:0x0147, B:27:0x0071, B:70:0x0157, B:69:0x0154, B:66:0x014f), top: B:97:0x0021, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x017c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x0197  */
    /* JADX WARN: Code duplicated, block: B:83:0x0198  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10, types: [io.ktor.utils.io.j] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [io.ktor.utils.io.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r9v0, types: [io.ktor.utils.io.j] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v23, types: [io.ktor.utils.io.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3, types: [io.ktor.utils.io.j] */
    /* JADX WARN: Type inference failed for: r9v37, types: [io.ktor.utils.io.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v39, types: [io.ktor.utils.io.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [io.ktor.utils.io.j] */
    /* JADX WARN: Type inference failed for: r9v40, types: [io.ktor.utils.io.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0198 -> B:20:0x0049). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // cl0.b.d
    public java.lang.Object d(io.ktor.utils.io.j r9, p013kotlin.coroutines.Continuation<? super jn0.h0> r10) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xk0.g.d(io.ktor.utils.io.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public g(List<? extends cl0.c> parts, String boundary, bl0.c contentType) {
        byte[] bArrG;
        byte[] bArrG2;
        Object aVar;
        p013kotlin.jvm.internal.s.k(parts, "parts");
        p013kotlin.jvm.internal.s.k(boundary, "boundary");
        p013kotlin.jvm.internal.s.k(contentType, "contentType");
        this.boundary = boundary;
        this.contentType = contentType;
        String str = "--" + boundary + "\r\n";
        Charset charset = p013kotlin.text.d.UTF_8;
        if (p013kotlin.jvm.internal.s.f(charset, charset)) {
            bArrG = t.J(str);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            p013kotlin.jvm.internal.s.j(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrG = kl0.a.g(charsetEncoderNewEncoder, str, 0, str.length());
        }
        this.BOUNDARY_BYTES = bArrG;
        String str2 = "--" + boundary + "--\r\n";
        if (p013kotlin.jvm.internal.s.f(charset, charset)) {
            bArrG2 = t.J(str2);
        } else {
            CharsetEncoder charsetEncoderNewEncoder2 = charset.newEncoder();
            p013kotlin.jvm.internal.s.j(charsetEncoderNewEncoder2, "charset.newEncoder()");
            bArrG2 = kl0.a.g(charsetEncoderNewEncoder2, str2, 0, str2.length());
        }
        this.LAST_BOUNDARY_BYTES = bArrG2;
        this.BODY_OVERHEAD_SIZE = bArrG2.length;
        this.PART_OVERHEAD_SIZE = (c.f123629a.length * 2) + bArrG.length;
        List<? extends cl0.c> list = parts;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            Long l11 = null;
            if (it.hasNext()) {
                cl0.c cVar = (cl0.c) it.next();
                j jVar = new j(null, 1, null);
                for (Map.Entry<String, List<String>> entry : cVar.getHeaders().a()) {
                    w.i(jVar, entry.getKey() + ": " + v.y0(entry.getValue(), "; ", null, null, 0, null, null, 62, null), 0, 0, null, 14, null);
                    s.d(jVar, c.f123629a, 0, 0, 6, null);
                }
                bl0.k headers = cVar.getHeaders();
                o oVar = o.f17654a;
                String str3 = headers.get(oVar.h());
                Long lValueOf = str3 != null ? Long.valueOf(Long.parseLong(str3)) : null;
                if (cVar instanceof cl0.c.C0402c) {
                    byte[] bArrC = w.c(jVar.T0(), 0, 1, null);
                    aVar = new h.b(bArrC, ((cl0.c.C0402c) cVar).b(), lValueOf != null ? Long.valueOf(lValueOf.longValue() + ((long) this.PART_OVERHEAD_SIZE) + ((long) bArrC.length)) : null);
                } else if (cVar instanceof cl0.c.b) {
                    byte[] bArrC2 = w.c(jVar.T0(), 0, 1, null);
                    aVar = new h.b(bArrC2, ((cl0.c.b) cVar).b(), lValueOf != null ? Long.valueOf(lValueOf.longValue() + ((long) this.PART_OVERHEAD_SIZE) + ((long) bArrC2.length)) : null);
                } else if (cVar instanceof cl0.c.d) {
                    j jVar2 = new j(null, 1, null);
                    try {
                        w.i(jVar2, ((cl0.c.d) cVar).getValue(), 0, 0, null, 14, null);
                        byte[] bArrC3 = w.c(jVar2.T0(), 0, 1, null);
                        a aVar2 = new a(bArrC3);
                        if (lValueOf == null) {
                            w.i(jVar, oVar.h() + ": " + bArrC3.length, 0, 0, null, 14, null);
                            s.d(jVar, c.f123629a, 0, 0, 6, null);
                        }
                        byte[] bArrC4 = w.c(jVar.T0(), 0, 1, null);
                        aVar = new h.b(bArrC4, aVar2, Long.valueOf(bArrC3.length + this.PART_OVERHEAD_SIZE + bArrC4.length));
                    } catch (Throwable th2) {
                        jVar2.release();
                        throw th2;
                    }
                } else if (cVar instanceof cl0.c.a) {
                    byte[] bArrC5 = w.c(jVar.T0(), 0, 1, null);
                    aVar = new h.a(bArrC5, ((cl0.c.a) cVar).b(), lValueOf != null ? Long.valueOf(lValueOf.longValue() + ((long) this.PART_OVERHEAD_SIZE) + ((long) bArrC5.length)) : null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(aVar);
            } else {
                this.rawParts = arrayList;
                Long lValueOf2 = 0L;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        l11 = lValueOf2;
                        break;
                    }
                    Long size = ((h) it2.next()).getSize();
                    if (size == null) {
                        break;
                    } else {
                        lValueOf2 = lValueOf2 != null ? Long.valueOf(lValueOf2.longValue() + size.longValue()) : null;
                    }
                }
                this.contentLength = l11 != null ? Long.valueOf(l11.longValue() + ((long) this.BODY_OVERHEAD_SIZE)) : l11;
                return;
            }
        }
    }
}
