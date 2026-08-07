package p013kotlin.text;

import bo0.h;
import bo0.j;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import ho0.i;
import ho0.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0012\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u000f\u001a#\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001b\u001a\u00020\u0000*\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010!\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b!\u0010\"\u001a#\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b#\u0010 \u001a#\u0010$\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b$\u0010\"\u001a#\u0010%\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b%\u0010 \u001a#\u0010&\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b&\u0010\"\u001a#\u0010'\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b'\u0010 \u001a#\u0010(\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b(\u0010\"\u001a)\u0010,\u001a\u00020\b*\u00020\b2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\b¢\u0006\u0004\b,\u0010-\u001a!\u0010.\u001a\u00020\b*\u00020\b2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b¢\u0006\u0004\b.\u0010/\u001a\u0019\u00100\u001a\u00020\b*\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b0\u00101\u001a\u0019\u00103\u001a\u00020\u0000*\u00020\u00002\u0006\u00102\u001a\u00020\b¢\u0006\u0004\b3\u00104\u001a\u0019\u00106\u001a\u00020\u0000*\u00020\u00002\u0006\u00105\u001a\u00020\b¢\u0006\u0004\b6\u00104\u001a!\u00107\u001a\u00020\u0000*\u00020\u00002\u0006\u00102\u001a\u00020\b2\u0006\u00105\u001a\u00020\b¢\u0006\u0004\b7\u00108\u001a\u0019\u00109\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b9\u00104\u001a;\u0010>\u001a\u00020\u0014*\u00020\b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u0014H\u0000¢\u0006\u0004\b>\u0010?\u001a#\u0010A\u001a\u00020\u0014*\u00020\b2\u0006\u0010@\u001a\u00020\u00022\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bA\u0010B\u001a#\u0010C\u001a\u00020\u0014*\u00020\b2\u0006\u0010@\u001a\u00020\u00022\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bC\u0010B\u001a#\u0010D\u001a\u00020\u0014*\u00020\b2\u0006\u00102\u001a\u00020\b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bD\u0010E\u001a+\u0010F\u001a\u00020\u0014*\u00020\b2\u0006\u00102\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bF\u0010G\u001a#\u0010H\u001a\u00020\u0014*\u00020\b2\u0006\u00105\u001a\u00020\b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bH\u0010E\u001a-\u0010I\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bI\u0010J\u001a-\u0010K\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bK\u0010J\u001a=\u0010M\u001a\u00020\u000b*\u00020\b2\u0006\u0010;\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u00142\b\b\u0002\u0010L\u001a\u00020\u0014H\u0002¢\u0006\u0004\bM\u0010N\u001aG\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010Q*\u00020\b2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00000O2\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u00142\u0006\u0010L\u001a\u00020\u0014H\u0002¢\u0006\u0004\bR\u0010S\u001a-\u0010T\u001a\u00020\u000b*\u00020\b2\u0006\u0010@\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bT\u0010U\u001a-\u0010W\u001a\u00020\u000b*\u00020\b2\u0006\u0010V\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bW\u0010X\u001a-\u0010Y\u001a\u00020\u000b*\u00020\b2\u0006\u0010@\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bY\u0010U\u001a-\u0010Z\u001a\u00020\u000b*\u00020\b2\u0006\u0010V\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u0014¢\u0006\u0004\bZ\u0010X\u001a&\u0010[\u001a\u00020\u0014*\u00020\b2\u0006\u0010;\u001a\u00020\b2\b\b\u0002\u0010=\u001a\u00020\u0014H\u0086\u0002¢\u0006\u0004\b[\u0010E\u001a&\u0010\\\u001a\u00020\u0014*\u00020\b2\u0006\u0010@\u001a\u00020\u00022\b\b\u0002\u0010=\u001a\u00020\u0014H\u0086\u0002¢\u0006\u0004\b\\\u0010B\u001a?\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00170_*\u00020\b2\u0006\u0010]\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u00142\b\b\u0002\u0010^\u001a\u00020\u000bH\u0002¢\u0006\u0004\b`\u0010a\u001aG\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00170_*\u00020\b2\u000e\u0010]\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010=\u001a\u00020\u00142\b\b\u0002\u0010^\u001a\u00020\u000bH\u0002¢\u0006\u0004\bc\u0010d\u001a\u0017\u0010f\u001a\u00020e2\u0006\u0010^\u001a\u00020\u000bH\u0000¢\u0006\u0004\bf\u0010g\u001a?\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00000h*\u00020\b2\u0012\u0010]\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000b\"\u00020\u00002\b\b\u0002\u0010=\u001a\u00020\u00142\b\b\u0002\u0010^\u001a\u00020\u000b¢\u0006\u0004\bi\u0010j\u001a7\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00000h*\u00020\b2\n\u0010]\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u0010=\u001a\u00020\u00142\b\b\u0002\u0010^\u001a\u00020\u000b¢\u0006\u0004\bk\u0010l\u001a1\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00000h*\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u00142\u0006\u0010^\u001a\u00020\u000bH\u0002¢\u0006\u0004\bm\u0010n\u001a\u0017\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00000_*\u00020\b¢\u0006\u0004\bo\u0010p\u001a\u0017\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00000h*\u00020\b¢\u0006\u0004\bq\u0010r\u001a\u001f\u0010s\u001a\u00020\u0014*\u0004\u0018\u00010\b2\b\u0010;\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\bs\u0010t\u001a\u0015\u0010u\u001a\u0004\u0018\u00010\u0014*\u00020\u0000H\u0007¢\u0006\u0004\bu\u0010v\"\u0015\u0010y\u001a\u00020\u0017*\u00020\b8F¢\u0006\u0006\u001a\u0004\bw\u0010x\"\u0015\u0010|\u001a\u00020\u000b*\u00020\b8F¢\u0006\u0006\u001a\u0004\bz\u0010{¨\u0006}"}, d2 = {"", "", "", "chars", "G1", "(Ljava/lang/String;[C)Ljava/lang/String;", "I1", "H1", "", "F1", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "length", "padChar", "J0", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "K0", "(Ljava/lang/String;IC)Ljava/lang/String;", "G0", "H0", "", "y0", "(Ljava/lang/CharSequence;)Z", "Lbo0/j;", "range", "n1", "(Ljava/lang/String;Lbo0/j;)Ljava/lang/String;", "m1", "(Ljava/lang/CharSequence;Lbo0/j;)Ljava/lang/String;", "delimiter", "missingDelimiterValue", "w1", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "x1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "o1", "p1", "A1", "B1", "s1", "t1", "startIndex", "endIndex", "replacement", "Z0", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "U0", "(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;", "V0", "(Ljava/lang/CharSequence;Lbo0/j;)Ljava/lang/CharSequence;", "prefix", "T0", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "W0", "Y0", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "X0", "thisOffset", "other", "otherOffset", "ignoreCase", "S0", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "char", "g1", "(Ljava/lang/CharSequence;CZ)Z", "j0", "i1", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "h1", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IZ)Z", "k0", "w0", "(Ljava/lang/CharSequence;[CIZ)I", "D0", "last", "s0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lkotlin/Pair;", "n0", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "q0", "(Ljava/lang/CharSequence;CIZ)I", InquiryField.StringField.TYPE, "r0", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "z0", "A0", "f0", "e0", "delimiters", "limit", "Lho0/i;", "M0", "(Ljava/lang/CharSequence;[CIZI)Lho0/i;", "", "N0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lho0/i;", "Ljn0/h0;", "a1", "(I)V", "", "c1", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "b1", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "d1", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "E0", "(Ljava/lang/CharSequence;)Lho0/i;", "F0", "(Ljava/lang/CharSequence;)Ljava/util/List;", "i0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "E1", "(Ljava/lang/String;)Ljava/lang/Boolean;", "o0", "(Ljava/lang/CharSequence;)Lbo0/j;", "indices", "p0", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class i0 extends f0 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/text/i0$a", "Lho0/i;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements i<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f89174a;

        public a(CharSequence charSequence) {
            this.f89174a = charSequence;
        }

        @Override // ho0.i
        public Iterator<String> iterator() {
            return new j(this.f89174a);
        }
    }

    public static final int A0(CharSequence charSequence, String string, int i11, boolean z11) {
        s.k(charSequence, "<this>");
        s.k(string, "string");
        return (z11 || !(charSequence instanceof String)) ? s0(charSequence, string, i11, 0, z11, true) : ((String) charSequence).lastIndexOf(string, i11);
    }

    public static String A1(String str, char c11, String missingDelimiterValue) {
        s.k(str, "<this>");
        s.k(missingDelimiterValue, "missingDelimiterValue");
        int iB0 = B0(str, c11, 0, false, 6, null);
        if (iB0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iB0);
        s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int B0(CharSequence charSequence, char c11, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = p0(charSequence);
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return z0(charSequence, c11, i11, z11);
    }

    public static String B1(String str, String delimiter, String missingDelimiterValue) {
        s.k(str, "<this>");
        s.k(delimiter, "delimiter");
        s.k(missingDelimiterValue, "missingDelimiterValue");
        int iC0 = C0(str, delimiter, 0, false, 6, null);
        if (iC0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iC0);
        s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int C0(CharSequence charSequence, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = p0(charSequence);
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return A0(charSequence, str, i11, z11);
    }

    public static /* synthetic */ String C1(String str, char c11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        return A1(str, c11, str2);
    }

    public static final int D0(CharSequence charSequence, char[] chars, int i11, boolean z11) {
        s.k(charSequence, "<this>");
        s.k(chars, "chars");
        if (!z11 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(n.d1(chars), i11);
        }
        for (int iJ = bo0.n.j(i11, p0(charSequence)); -1 < iJ; iJ--) {
            char cCharAt = charSequence.charAt(iJ);
            for (char c11 : chars) {
                if (c.i(c11, cCharAt, z11)) {
                    return iJ;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ String D1(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        return B1(str, str2, str3);
    }

    public static final i<String> E0(CharSequence charSequence) {
        s.k(charSequence, "<this>");
        return new a(charSequence);
    }

    public static Boolean E1(String str) {
        s.k(str, "<this>");
        if (s.f(str, "true")) {
            return Boolean.TRUE;
        }
        if (s.f(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static List<String> F0(CharSequence charSequence) {
        s.k(charSequence, "<this>");
        return l.c0(E0(charSequence));
    }

    public static CharSequence F1(CharSequence charSequence) {
        s.k(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean zC = b.c(charSequence.charAt(!z11 ? i11 : length));
            if (z11) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i11++;
            } else {
                z11 = true;
            }
        }
        return charSequence.subSequence(i11, length + 1);
    }

    public static final CharSequence G0(CharSequence charSequence, int i11, char c11) {
        s.k(charSequence, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException("Desired length " + i11 + " is less than zero.");
        }
        if (i11 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i11);
        sb2.append(charSequence);
        int length = i11 - charSequence.length();
        int i12 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c11);
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        return sb2;
    }

    public static String G1(String str, char... chars) {
        s.k(str, "<this>");
        s.k(chars, "chars");
        int length = str.length() - 1;
        int i11 = 0;
        boolean z11 = false;
        while (i11 <= length) {
            boolean zB0 = n.b0(chars, str.charAt(!z11 ? i11 : length));
            if (z11) {
                if (!zB0) {
                    break;
                }
                length--;
            } else if (zB0) {
                i11++;
            } else {
                z11 = true;
            }
        }
        return str.subSequence(i11, length + 1).toString();
    }

    public static String H0(String str, int i11, char c11) {
        s.k(str, "<this>");
        return G0(str, i11, c11).toString();
    }

    public static String H1(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        s.k(str, "<this>");
        s.k(chars, "chars");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i11 = length - 1;
            if (!n.b0(chars, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i11 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i11;
        }
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ String I0(String str, int i11, char c11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            c11 = ' ';
        }
        return H0(str, i11, c11);
    }

    public static String I1(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        s.k(str, "<this>");
        s.k(chars, "chars");
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!n.b0(chars, str.charAt(i11))) {
                charSequenceSubSequence = str.subSequence(i11, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    public static final CharSequence J0(CharSequence charSequence, int i11, char c11) {
        s.k(charSequence, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException("Desired length " + i11 + " is less than zero.");
        }
        if (i11 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i11);
        int length = i11 - charSequence.length();
        int i12 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c11);
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static String K0(String str, int i11, char c11) {
        s.k(str, "<this>");
        return J0(str, i11, c11).toString();
    }

    public static /* synthetic */ String L0(String str, int i11, char c11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            c11 = ' ';
        }
        return K0(str, i11, c11);
    }

    private static final i<j> M0(CharSequence charSequence, final char[] cArr, int i11, final boolean z11, int i12) {
        a1(i12);
        return new e(charSequence, i11, i12, new p() { // from class: kotlin.text.g0
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return i0.Q0(cArr, z11, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    private static final i<j> N0(CharSequence charSequence, String[] strArr, int i11, final boolean z11, int i12) {
        a1(i12);
        final List listH = n.h(strArr);
        return new e(charSequence, i11, i12, new p() { // from class: kotlin.text.h0
            @Override // wn0.p
            public final Object invoke(Object obj, Object obj2) {
                return i0.R0(listH, z11, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    static /* synthetic */ i O0(CharSequence charSequence, char[] cArr, int i11, boolean z11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        return M0(charSequence, cArr, i11, z11, i12);
    }

    static /* synthetic */ i P0(CharSequence charSequence, String[] strArr, int i11, boolean z11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            z11 = false;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        return N0(charSequence, strArr, i11, z11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair Q0(char[] cArr, boolean z11, CharSequence DelimitedRangesSequence, int i11) {
        s.k(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iW0 = w0(DelimitedRangesSequence, cArr, i11, z11);
        if (iW0 < 0) {
            return null;
        }
        return x.a(Integer.valueOf(iW0), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair R0(List list, boolean z11, CharSequence DelimitedRangesSequence, int i11) {
        s.k(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair<Integer, String> pairN0 = n0(DelimitedRangesSequence, list, i11, z11, false);
        if (pairN0 != null) {
            return x.a(pairN0.e(), Integer.valueOf(pairN0.f().length()));
        }
        return null;
    }

    public static final boolean S0(CharSequence charSequence, int i11, CharSequence other, int i12, int i13, boolean z11) {
        s.k(charSequence, "<this>");
        s.k(other, "other");
        if (i12 < 0 || i11 < 0 || i11 > charSequence.length() - i13 || i12 > other.length() - i13) {
            return false;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            if (!c.i(charSequence.charAt(i11 + i14), other.charAt(i12 + i14), z11)) {
                return false;
            }
        }
        return true;
    }

    public static String T0(String str, CharSequence prefix) {
        s.k(str, "<this>");
        s.k(prefix, "prefix");
        if (!l1(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence U0(CharSequence charSequence, int i11, int i12) {
        s.k(charSequence, "<this>");
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("End index (" + i12 + ") is less than start index (" + i11 + ").");
        }
        if (i12 == i11) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() - (i12 - i11));
        sb2.append(charSequence, 0, i11);
        s.j(sb2, "append(...)");
        sb2.append(charSequence, i12, charSequence.length());
        s.j(sb2, "append(...)");
        return sb2;
    }

    public static CharSequence V0(CharSequence charSequence, j range) {
        s.k(charSequence, "<this>");
        s.k(range, "range");
        return U0(charSequence, range.getStart().intValue(), range.e().intValue() + 1);
    }

    public static String W0(String str, CharSequence suffix) {
        s.k(str, "<this>");
        s.k(suffix, "suffix");
        if (!m0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String X0(String str, CharSequence delimiter) {
        s.k(str, "<this>");
        s.k(delimiter, "delimiter");
        return Y0(str, delimiter, delimiter);
    }

    public static final String Y0(String str, CharSequence prefix, CharSequence suffix) {
        s.k(str, "<this>");
        s.k(prefix, "prefix");
        s.k(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !l1(str, prefix, false, 2, null) || !m0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence Z0(CharSequence charSequence, int i11, int i12, CharSequence replacement) {
        s.k(charSequence, "<this>");
        s.k(replacement, "replacement");
        if (i12 >= i11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i11);
            s.j(sb2, "append(...)");
            sb2.append(replacement);
            sb2.append(charSequence, i12, charSequence.length());
            s.j(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i12 + ") is less than start index (" + i11 + ").");
    }

    public static final void a1(int i11) {
        if (i11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i11).toString());
    }

    public static final List<String> b1(CharSequence charSequence, char[] delimiters, boolean z11, int i11) {
        s.k(charSequence, "<this>");
        s.k(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return d1(charSequence, String.valueOf(delimiters[0]), z11, i11);
        }
        Iterable iterableZ = l.z(O0(charSequence, delimiters, 0, z11, i11, 2, null));
        ArrayList arrayList = new ArrayList(v.y(iterableZ, 10));
        Iterator it = iterableZ.iterator();
        while (it.hasNext()) {
            arrayList.add(m1(charSequence, (j) it.next()));
        }
        return arrayList;
    }

    public static final List<String> c1(CharSequence charSequence, String[] delimiters, boolean z11, int i11) {
        s.k(charSequence, "<this>");
        s.k(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return d1(charSequence, str, z11, i11);
            }
        }
        Iterable iterableZ = l.z(P0(charSequence, delimiters, 0, z11, i11, 2, null));
        ArrayList arrayList = new ArrayList(v.y(iterableZ, 10));
        Iterator it = iterableZ.iterator();
        while (it.hasNext()) {
            arrayList.add(m1(charSequence, (j) it.next()));
        }
        return arrayList;
    }

    private static final List<String> d1(CharSequence charSequence, String str, boolean z11, int i11) {
        a1(i11);
        int length = 0;
        int iR0 = r0(charSequence, str, 0, z11);
        if (iR0 == -1 || i11 == 1) {
            return v.e(charSequence.toString());
        }
        boolean z12 = i11 > 0;
        ArrayList arrayList = new ArrayList(z12 ? bo0.n.j(i11, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iR0).toString());
            length = str.length() + iR0;
            if (z12 && arrayList.size() == i11 - 1) {
                break;
            }
            iR0 = r0(charSequence, str, length, z11);
        } while (iR0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static final boolean e0(CharSequence charSequence, char c11, boolean z11) {
        s.k(charSequence, "<this>");
        return u0(charSequence, c11, 0, z11, 2, null) >= 0;
    }

    public static /* synthetic */ List e1(CharSequence charSequence, char[] cArr, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return b1(charSequence, cArr, z11, i11);
    }

    public static boolean f0(CharSequence charSequence, CharSequence other, boolean z11) {
        s.k(charSequence, "<this>");
        s.k(other, "other");
        if (other instanceof String) {
            return v0(charSequence, (String) other, 0, z11, 2, null) >= 0;
        }
        return t0(charSequence, other, 0, charSequence.length(), z11, false, 16, null) >= 0;
    }

    public static /* synthetic */ List f1(CharSequence charSequence, String[] strArr, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return c1(charSequence, strArr, z11, i11);
    }

    public static /* synthetic */ boolean g0(CharSequence charSequence, char c11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return e0(charSequence, c11, z11);
    }

    public static final boolean g1(CharSequence charSequence, char c11, boolean z11) {
        s.k(charSequence, "<this>");
        return charSequence.length() > 0 && c.i(charSequence.charAt(0), c11, z11);
    }

    public static /* synthetic */ boolean h0(CharSequence charSequence, CharSequence charSequence2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return f0(charSequence, charSequence2, z11);
    }

    public static final boolean h1(CharSequence charSequence, CharSequence prefix, int i11, boolean z11) {
        s.k(charSequence, "<this>");
        s.k(prefix, "prefix");
        return (!z11 && (charSequence instanceof String) && (prefix instanceof String)) ? f0.a0((String) charSequence, (String) prefix, i11, false, 4, null) : S0(charSequence, i11, prefix, 0, prefix.length(), z11);
    }

    public static final boolean i0(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return s.f(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (charSequence.charAt(i11) != charSequence2.charAt(i11)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean i1(CharSequence charSequence, CharSequence prefix, boolean z11) {
        s.k(charSequence, "<this>");
        s.k(prefix, "prefix");
        return (!z11 && (charSequence instanceof String) && (prefix instanceof String)) ? f0.b0((String) charSequence, (String) prefix, false, 2, null) : S0(charSequence, 0, prefix, 0, prefix.length(), z11);
    }

    public static final boolean j0(CharSequence charSequence, char c11, boolean z11) {
        s.k(charSequence, "<this>");
        return charSequence.length() > 0 && c.i(charSequence.charAt(p0(charSequence)), c11, z11);
    }

    public static /* synthetic */ boolean j1(CharSequence charSequence, char c11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return g1(charSequence, c11, z11);
    }

    public static final boolean k0(CharSequence charSequence, CharSequence suffix, boolean z11) {
        s.k(charSequence, "<this>");
        s.k(suffix, "suffix");
        return (!z11 && (charSequence instanceof String) && (suffix instanceof String)) ? f0.L((String) charSequence, (String) suffix, false, 2, null) : S0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z11);
    }

    public static /* synthetic */ boolean k1(CharSequence charSequence, CharSequence charSequence2, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return h1(charSequence, charSequence2, i11, z11);
    }

    public static /* synthetic */ boolean l0(CharSequence charSequence, char c11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return j0(charSequence, c11, z11);
    }

    public static /* synthetic */ boolean l1(CharSequence charSequence, CharSequence charSequence2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return i1(charSequence, charSequence2, z11);
    }

    public static /* synthetic */ boolean m0(CharSequence charSequence, CharSequence charSequence2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return k0(charSequence, charSequence2, z11);
    }

    public static final String m1(CharSequence charSequence, j range) {
        s.k(charSequence, "<this>");
        s.k(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.e().intValue() + 1).toString();
    }

    private static final Pair<Integer, String> n0(CharSequence charSequence, Collection<String> collection, int i11, boolean z11, boolean z12) {
        CharSequence charSequence2;
        Object next;
        boolean z13;
        Object next2;
        if (!z11 && collection.size() == 1) {
            String str = (String) v.T0(collection);
            int iV0 = !z12 ? v0(charSequence, str, i11, false, 4, null) : C0(charSequence, str, i11, false, 4, null);
            if (iV0 < 0) {
                return null;
            }
            return x.a(Integer.valueOf(iV0), str);
        }
        CharSequence charSequence3 = charSequence;
        h jVar = !z12 ? new j(bo0.n.f(i11, 0), charSequence3.length()) : bo0.n.s(bo0.n.j(i11, p0(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iH = jVar.getFirst();
            int i12 = jVar.getLast();
            int iJ = jVar.getStep();
            if ((iJ > 0 && iH <= i12) || (iJ < 0 && i12 <= iH)) {
                int i13 = iH;
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z13 = z11;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z13 = z11;
                        if (f0.P(str2, 0, (String) charSequence3, i13, str2.length(), z13)) {
                            break;
                        }
                        z11 = z13;
                    }
                    String str3 = (String) next2;
                    if (str3 != null) {
                        return x.a(Integer.valueOf(i13), str3);
                    }
                    if (i13 != i12) {
                        i13 += iJ;
                        z11 = z13;
                    }
                }
            }
        } else {
            boolean z14 = z11;
            int iH2 = jVar.getFirst();
            int i14 = jVar.getLast();
            int iJ2 = jVar.getStep();
            if ((iJ2 > 0 && iH2 <= i14) || (iJ2 < 0 && i14 <= iH2)) {
                int i15 = iH2;
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z15 = z14;
                        charSequence2 = charSequence3;
                        z14 = z15;
                        if (S0(str4, 0, charSequence2, i15, str4.length(), z15)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 != null) {
                        return x.a(Integer.valueOf(i15), str5);
                    }
                    if (i15 != i14) {
                        i15 += iJ2;
                        charSequence3 = charSequence2;
                    }
                }
            }
        }
        return null;
    }

    public static String n1(String str, j range) {
        s.k(str, "<this>");
        s.k(range, "range");
        String strSubstring = str.substring(range.getStart().intValue(), range.e().intValue() + 1);
        s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static j o0(CharSequence charSequence) {
        s.k(charSequence, "<this>");
        return new j(0, charSequence.length() - 1);
    }

    public static String o1(String str, char c11, String missingDelimiterValue) {
        s.k(str, "<this>");
        s.k(missingDelimiterValue, "missingDelimiterValue");
        int iU0 = u0(str, c11, 0, false, 6, null);
        if (iU0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iU0 + 1, str.length());
        s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static int p0(CharSequence charSequence) {
        s.k(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final String p1(String str, String delimiter, String missingDelimiterValue) {
        s.k(str, "<this>");
        s.k(delimiter, "delimiter");
        s.k(missingDelimiterValue, "missingDelimiterValue");
        int iV0 = v0(str, delimiter, 0, false, 6, null);
        if (iV0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iV0 + delimiter.length(), str.length());
        s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int q0(CharSequence charSequence, char c11, int i11, boolean z11) {
        s.k(charSequence, "<this>");
        return (z11 || !(charSequence instanceof String)) ? w0(charSequence, new char[]{c11}, i11, z11) : ((String) charSequence).indexOf(c11, i11);
    }

    public static /* synthetic */ String q1(String str, char c11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        return o1(str, c11, str2);
    }

    public static int r0(CharSequence charSequence, String string, int i11, boolean z11) {
        s.k(charSequence, "<this>");
        s.k(string, "string");
        return (z11 || !(charSequence instanceof String)) ? t0(charSequence, string, i11, charSequence.length(), z11, false, 16, null) : ((String) charSequence).indexOf(string, i11);
    }

    public static /* synthetic */ String r1(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        return p1(str, str2, str3);
    }

    private static final int s0(CharSequence charSequence, CharSequence charSequence2, int i11, int i12, boolean z11, boolean z12) {
        h jVar = !z12 ? new j(bo0.n.f(i11, 0), bo0.n.j(i12, charSequence.length())) : bo0.n.s(bo0.n.j(i11, p0(charSequence)), bo0.n.f(i12, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iH = jVar.getFirst();
            int i13 = jVar.getLast();
            int iJ = jVar.getStep();
            if ((iJ <= 0 || iH > i13) && (iJ >= 0 || i13 > iH)) {
                return -1;
            }
            int i14 = iH;
            while (true) {
                String str = (String) charSequence2;
                boolean z13 = z11;
                if (f0.P(str, 0, (String) charSequence, i14, str.length(), z13)) {
                    return i14;
                }
                if (i14 == i13) {
                    return -1;
                }
                i14 += iJ;
                z11 = z13;
            }
        } else {
            boolean z14 = z11;
            int iH2 = jVar.getFirst();
            int i15 = jVar.getLast();
            int iJ2 = jVar.getStep();
            if ((iJ2 <= 0 || iH2 > i15) && (iJ2 >= 0 || i15 > iH2)) {
                return -1;
            }
            int i16 = iH2;
            while (true) {
                boolean z15 = z14;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z14 = z15;
                if (S0(charSequence4, 0, charSequence3, i16, charSequence2.length(), z15)) {
                    return i16;
                }
                if (i16 == i15) {
                    return -1;
                }
                i16 += iJ2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static String s1(String str, char c11, String missingDelimiterValue) {
        s.k(str, "<this>");
        s.k(missingDelimiterValue, "missingDelimiterValue");
        int iB0 = B0(str, c11, 0, false, 6, null);
        if (iB0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iB0 + 1, str.length());
        s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    static /* synthetic */ int t0(CharSequence charSequence, CharSequence charSequence2, int i11, int i12, boolean z11, boolean z12, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z12 = false;
        }
        return s0(charSequence, charSequence2, i11, i12, z11, z12);
    }

    public static final String t1(String str, String delimiter, String missingDelimiterValue) {
        s.k(str, "<this>");
        s.k(delimiter, "delimiter");
        s.k(missingDelimiterValue, "missingDelimiterValue");
        int iC0 = C0(str, delimiter, 0, false, 6, null);
        if (iC0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iC0 + delimiter.length(), str.length());
        s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int u0(CharSequence charSequence, char c11, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return q0(charSequence, c11, i11, z11);
    }

    public static /* synthetic */ String u1(String str, char c11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        return s1(str, c11, str2);
    }

    public static /* synthetic */ int v0(CharSequence charSequence, String str, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return r0(charSequence, str, i11, z11);
    }

    public static /* synthetic */ String v1(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        return t1(str, str2, str3);
    }

    public static final int w0(CharSequence charSequence, char[] chars, int i11, boolean z11) {
        s.k(charSequence, "<this>");
        s.k(chars, "chars");
        if (!z11 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(n.d1(chars), i11);
        }
        int iF = bo0.n.f(i11, 0);
        int iP0 = p0(charSequence);
        if (iF > iP0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iF);
            for (char c11 : chars) {
                if (c.i(c11, cCharAt, z11)) {
                    return iF;
                }
            }
            if (iF == iP0) {
                return -1;
            }
            iF++;
        }
    }

    public static final String w1(String str, char c11, String missingDelimiterValue) {
        s.k(str, "<this>");
        s.k(missingDelimiterValue, "missingDelimiterValue");
        int iU0 = u0(str, c11, 0, false, 6, null);
        if (iU0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iU0);
        s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int x0(CharSequence charSequence, char[] cArr, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return w0(charSequence, cArr, i11, z11);
    }

    public static final String x1(String str, String delimiter, String missingDelimiterValue) {
        s.k(str, "<this>");
        s.k(delimiter, "delimiter");
        s.k(missingDelimiterValue, "missingDelimiterValue");
        int iV0 = v0(str, delimiter, 0, false, 6, null);
        if (iV0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iV0);
        s.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean y0(CharSequence charSequence) {
        s.k(charSequence, "<this>");
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (!b.c(charSequence.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String y1(String str, char c11, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = str;
        }
        return w1(str, c11, str2);
    }

    public static final int z0(CharSequence charSequence, char c11, int i11, boolean z11) {
        s.k(charSequence, "<this>");
        return (z11 || !(charSequence instanceof String)) ? D0(charSequence, new char[]{c11}, i11, z11) : ((String) charSequence).lastIndexOf(c11, i11);
    }

    public static /* synthetic */ String z1(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str3 = str;
        }
        return x1(str, str2, str3);
    }
}
