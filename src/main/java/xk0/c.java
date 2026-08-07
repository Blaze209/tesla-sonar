package xk0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"", "e", "()Ljava/lang/String;", "Lll0/o;", "Lio/ktor/utils/io/j;", "channel", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lll0/o;Lio/ktor/utils/io/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "[B", "RN_BYTES", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f123629a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.client.request.forms.FormDataContentKt", f = "FormDataContent.kt", i = {1, 1, 1, 2, 2}, l = {162, 177, 184, 184}, m = "copyTo", n = {"$this$copyTo", "channel", "$this$write_u24default$iv", "$this$copyTo", "channel"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f123630n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f123631o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f123632p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f123633q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f123634r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f123633q = obj;
            this.f123634r |= Integer.MIN_VALUE;
            return c.d(null, null, this);
        }
    }

    static {
        byte[] bArrG;
        Charset charset = p013kotlin.text.d.UTF_8;
        if (s.f(charset, charset)) {
            bArrG = t.J("\r\n");
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            s.j(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrG = kl0.a.g(charsetEncoderNewEncoder, "\r\n", 0, 2);
        }
        f123629a = bArrG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Code duplicated, block: B:33:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Path cross not found for [B:10:0x002a, B:20:0x006f], limit reached: 50 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00d4 -> B:28:0x0088). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(ll0.o r17, io.ktor.utils.io.j r18, p013kotlin.coroutines.Continuation<? super jn0.h0> r19) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xk0.c.d(ll0.o, io.ktor.utils.io.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e() {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 32; i11++) {
            String string = Integer.toString(zn0.c.INSTANCE.c(), p013kotlin.text.a.a(16));
            s.j(string, "toString(this, checkRadix(radix))");
            sb2.append(string);
        }
        String string2 = sb2.toString();
        s.j(string2, "StringBuilder().apply(builderAction).toString()");
        return t.T1(string2, 70);
    }
}
