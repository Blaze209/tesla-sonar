package i4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import ezvcard.property.Gender;
import k3.Shadow;
import k3.h1;
import k3.p1;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p014n4.FontWeight;
import p4.LocaleList;
import t4.LineHeightStyle;
import t4.TextGeometricTransform;
import t4.TextIndent;

/* JADX INFO: renamed from: i4.r0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b'\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001RB%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nB\u009f\u0002\b\u0017\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\r\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b\b\u00106B\u0097\u0002\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010+\u001a\u00020\r\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00103\u001a\u000202\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b\b\u00107J\u000f\u00108\u001a\u00020\u0002H\u0007¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0004H\u0007¢\u0006\u0004\b:\u0010;J\u001b\u0010=\u001a\u00020\u00002\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b=\u0010>J \u0002\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00105\u001a\u0004\u0018\u000104H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0004H\u0007¢\u0006\u0004\bA\u0010BJ¨\u0002\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0002\u0010+\u001a\u00020\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u0001022\n\b\u0002\u00105\u001a\u0004\u0018\u000104H\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u009e\u0002\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u00105\u001a\u0004\u0018\u000104ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u00020G2\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020G2\u0006\u0010<\u001a\u00020\u0000¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\u00020G2\u0006\u0010<\u001a\u00020\u0000¢\u0006\u0004\bL\u0010KJ\u000f\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0017H\u0016¢\u0006\u0004\bP\u0010QR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u00109R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010U\u001a\u0004\bV\u0010;R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0013\u0010^\u001a\u0004\u0018\u00010[8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0017\u0010\f\u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0011\u0010d\u001a\u00020a8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0017\u0010\u000e\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\be\u0010`R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bn\u0010QR\u0017\u0010\u0019\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bo\u0010`R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\br\u0010sR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0017\u0010 \u001a\u00020\u000b8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bv\u0010`R\u0013\u0010\"\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0013\u0010$\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0013\u0010&\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0017\u0010(\u001a\u00020'8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b}\u0010OR\u0017\u0010*\u001a\u00020)8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b~\u0010OR\u0017\u0010+\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u007f\u0010`R\u0015\u0010-\u001a\u0004\u0018\u00010,8F¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0015\u0010/\u001a\u0004\u0018\u00010.8F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u00103\u001a\u0002028Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010OR\u0018\u00101\u001a\u0002008Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010OR\u0015\u00105\u001a\u0004\u0018\u0001048F¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0088\u0001"}, d2 = {"Li4/r0;", "", "Li4/d0;", "spanStyle", "Li4/u;", "paragraphStyle", "Li4/b0;", "platformStyle", "<init>", "(Li4/d0;Li4/u;Li4/b0;)V", "(Li4/d0;Li4/u;)V", "Lk3/p1;", "color", "Lw4/v;", OrcaFlavourKeys.FONT_SIZE, "Ln4/f0;", "fontWeight", "Ln4/b0;", "fontStyle", "Ln4/c0;", "fontSynthesis", "Ln4/q;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Lt4/a;", "baselineShift", "Lt4/o;", "textGeometricTransform", "Lp4/e;", "localeList", AppStateModule.APP_STATE_BACKGROUND, "Lt4/k;", "textDecoration", "Lk3/e4;", "shadow", "Lm3/g;", "drawStyle", "Lt4/j;", "textAlign", "Lt4/l;", "textDirection", "lineHeight", "Lt4/q;", "textIndent", "Lt4/h;", "lineHeightStyle", "Lt4/f;", "lineBreak", "Lt4/e;", "hyphens", "Lt4/s;", "textMotion", "(JJLn4/f0;Ln4/b0;Ln4/c0;Ln4/q;Ljava/lang/String;JLt4/a;Lt4/o;Lp4/e;JLt4/k;Lk3/e4;Lm3/g;Lt4/j;Lt4/l;JLt4/q;Li4/b0;Lt4/h;Lt4/f;Lt4/e;Lt4/s;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLn4/f0;Ln4/b0;Ln4/c0;Ln4/q;Ljava/lang/String;JLt4/a;Lt4/o;Lp4/e;JLt4/k;Lk3/e4;Lm3/g;IIJLt4/q;Li4/b0;Lt4/h;IILt4/s;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", Gender.OTHER, "()Li4/d0;", Gender.NONE, "()Li4/u;", "other", "K", "(Li4/r0;)Li4/r0;", "L", "(JJLn4/f0;Ln4/b0;Ln4/c0;Ln4/q;Ljava/lang/String;JLt4/a;Lt4/o;Lp4/e;JLt4/k;Lk3/e4;Lm3/g;IIJLt4/q;Lt4/h;IILi4/b0;Lt4/s;)Li4/r0;", "J", "(Li4/u;)Li4/r0;", DateTokenConverter.CONVERTER_KEY, "(JJLn4/f0;Ln4/b0;Ln4/c0;Ln4/q;Ljava/lang/String;JLt4/a;Lt4/o;Lp4/e;JLt4/k;Lk3/e4;Lm3/g;Lt4/j;Lt4/l;JLt4/q;Li4/b0;Lt4/h;Lt4/f;Lt4/e;Lt4/s;)Li4/r0;", "b", "(JJLn4/f0;Ln4/b0;Ln4/c0;Ln4/q;Ljava/lang/String;JLt4/a;Lt4/o;Lp4/e;JLt4/k;Lk3/e4;Lm3/g;IIJLt4/q;Li4/b0;Lt4/h;IILt4/s;)Li4/r0;", "", "equals", "(Ljava/lang/Object;)Z", "I", "(Li4/r0;)Z", "H", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Li4/d0;", "A", "Li4/u;", "x", "c", "Li4/b0;", "y", "()Li4/b0;", "Lk3/h1;", IntegerTokenConverter.CONVERTER_KEY, "()Lk3/h1;", "brush", "j", "()J", "", "f", "()F", "alpha", "n", "q", "()Ln4/f0;", "o", "()Ln4/b0;", "p", "()Ln4/c0;", "l", "()Ln4/q;", "m", "s", "h", "()Lt4/a;", "E", "()Lt4/o;", "w", "()Lp4/e;", "g", "C", "()Lt4/k;", "z", "()Lk3/e4;", "k", "()Lm3/g;", "B", "D", "u", Gender.FEMALE, "()Lt4/q;", "v", "()Lt4/h;", "r", "t", "G", "()Lt4/s;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextStyle {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final TextStyle f75788e = new TextStyle(0, 0, (FontWeight) null, (p014n4.b0) null, (p014n4.c0) null, (p014n4.q) null, (String) null, 0, (t4.a) null, (TextGeometricTransform) null, (LocaleList) null, 0, (t4.k) null, (Shadow) null, (m3.g) null, 0, 0, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (t4.s) null, 16777215, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle spanStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ParagraphStyle paragraphStyle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PlatformTextStyle platformStyle;

    /* JADX INFO: renamed from: i4.r0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Li4/r0$a;", "", "<init>", "()V", "Li4/r0;", "Default", "Li4/r0;", "a", "()Li4/r0;", "getDefault$annotations", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextStyle a() {
            return TextStyle.f75788e;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextStyle(long j11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow e4Var, m3.g gVar, int i11, int i12, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i13, int i14, t4.s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, fontWeight, b0Var, c0Var, qVar, str, j13, aVar, textGeometricTransform, localeList, j14, kVar, e4Var, gVar, i11, i12, j15, textIndent, platformTextStyle, lineHeightStyle, i13, i14, sVar);
    }

    public static /* synthetic */ TextStyle c(TextStyle textStyle, long j11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow e4Var, m3.g gVar, int i11, int i12, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i13, int i14, t4.s sVar, int i15, Object obj) {
        t4.s textMotion;
        int i16;
        long jG = (i15 & 1) != 0 ? textStyle.spanStyle.g() : j11;
        long fontSize = (i15 & 2) != 0 ? textStyle.spanStyle.getFontSize() : j12;
        FontWeight fontWeight2 = (i15 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        p014n4.b0 fontStyle = (i15 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : b0Var;
        p014n4.c0 fontSynthesis = (i15 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : c0Var;
        p014n4.q fontFamily = (i15 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : qVar;
        String fontFeatureSettings = (i15 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i15 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j13;
        t4.a baselineShift = (i15 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : aVar;
        TextGeometricTransform textGeometricTransform2 = (i15 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i15 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j16 = jG;
        long background = (i15 & 2048) != 0 ? textStyle.spanStyle.getBackground() : j14;
        t4.k textDecoration = (i15 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : kVar;
        Shadow shadow = (i15 & PKIFailureInfo.certRevoked) != 0 ? textStyle.spanStyle.getShadow() : e4Var;
        t4.k kVar2 = textDecoration;
        m3.g drawStyle = (i15 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : gVar;
        int textAlign = (i15 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : i11;
        int textDirection = (i15 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : i12;
        long lineHeight = (i15 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : j15;
        TextIndent textIndent2 = (i15 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i15 & PKIFailureInfo.badCertTemplate) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int lineBreak = (i15 & PKIFailureInfo.badSenderNonce) != 0 ? textStyle.paragraphStyle.getLineBreak() : i13;
        int hyphens = (i15 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : i14;
        if ((i15 & 8388608) != 0) {
            i16 = hyphens;
            textMotion = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion = sVar;
            i16 = hyphens;
        }
        return textStyle.b(j16, fontSize, fontWeight2, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform2, localeList2, background, kVar2, shadow, drawStyle, textAlign, textDirection, lineHeight, textIndent2, platformTextStyle2, lineHeightStyle2, lineBreak, i16, textMotion);
    }

    public static /* synthetic */ TextStyle e(TextStyle textStyle, long j11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow e4Var, m3.g gVar, t4.j jVar, t4.l lVar, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, t4.f fVar, t4.e eVar, t4.s sVar, int i11, Object obj) {
        t4.s textMotion;
        t4.e eVar2;
        long jG = (i11 & 1) != 0 ? textStyle.spanStyle.g() : j11;
        long fontSize = (i11 & 2) != 0 ? textStyle.spanStyle.getFontSize() : j12;
        FontWeight fontWeight2 = (i11 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        p014n4.b0 fontStyle = (i11 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : b0Var;
        p014n4.c0 fontSynthesis = (i11 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : c0Var;
        p014n4.q fontFamily = (i11 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : qVar;
        String fontFeatureSettings = (i11 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long letterSpacing = (i11 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j13;
        t4.a baselineShift = (i11 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : aVar;
        TextGeometricTransform textGeometricTransform2 = (i11 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeList2 = (i11 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j16 = jG;
        long background = (i11 & 2048) != 0 ? textStyle.spanStyle.getBackground() : j14;
        t4.k textDecoration = (i11 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : kVar;
        Shadow shadow = (i11 & PKIFailureInfo.certRevoked) != 0 ? textStyle.spanStyle.getShadow() : e4Var;
        t4.k kVar2 = textDecoration;
        m3.g drawStyle = (i11 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : gVar;
        t4.j jVarH = (i11 & 32768) != 0 ? t4.j.h(textStyle.paragraphStyle.getTextAlign()) : jVar;
        t4.l lVarG = (i11 & 65536) != 0 ? t4.l.g(textStyle.paragraphStyle.getTextDirection()) : lVar;
        long lineHeight = (i11 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : j15;
        TextIndent textIndent2 = (i11 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i11 & PKIFailureInfo.badCertTemplate) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        t4.f fVarC = (i11 & PKIFailureInfo.badSenderNonce) != 0 ? t4.f.c(textStyle.paragraphStyle.getLineBreak()) : fVar;
        t4.e eVarD = (i11 & 4194304) != 0 ? t4.e.d(textStyle.paragraphStyle.getHyphens()) : eVar;
        if ((i11 & 8388608) != 0) {
            eVar2 = eVarD;
            textMotion = textStyle.paragraphStyle.getTextMotion();
        } else {
            textMotion = sVar;
            eVar2 = eVarD;
        }
        return textStyle.d(j16, fontSize, fontWeight2, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform2, localeList2, background, kVar2, shadow, drawStyle, jVarH, lVarG, lineHeight, textIndent2, platformTextStyle2, lineHeightStyle2, fVarC, eVar2, textMotion);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final SpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    public final int B() {
        return this.paragraphStyle.getTextAlign();
    }

    public final t4.k C() {
        return this.spanStyle.getTextDecoration();
    }

    public final int D() {
        return this.paragraphStyle.getTextDirection();
    }

    public final TextGeometricTransform E() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final TextIndent F() {
        return this.paragraphStyle.getTextIndent();
    }

    public final t4.s G() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean H(TextStyle other) {
        return this == other || this.spanStyle.w(other.spanStyle);
    }

    public final boolean I(TextStyle other) {
        if (this != other) {
            return p013kotlin.jvm.internal.s.f(this.paragraphStyle, other.paragraphStyle) && this.spanStyle.v(other.spanStyle);
        }
        return true;
    }

    public final TextStyle J(ParagraphStyle other) {
        return new TextStyle(O(), getParagraphStyle().l(other));
    }

    public final TextStyle K(TextStyle other) {
        return (other == null || p013kotlin.jvm.internal.s.f(other, f75788e)) ? this : new TextStyle(O().x(other.O()), getParagraphStyle().l(other.getParagraphStyle()));
    }

    public final TextStyle L(long color, long fontSize, FontWeight fontWeight, p014n4.b0 fontStyle, p014n4.c0 fontSynthesis, p014n4.q fontFamily, String fontFeatureSettings, long letterSpacing, t4.a baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, t4.k textDecoration, Shadow shadow, m3.g drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, PlatformTextStyle platformStyle, t4.s textMotion) {
        SpanStyle spanStyleB = e0.b(this.spanStyle, color, null, Float.NaN, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle paragraphStyleA = v.a(this.paragraphStyle, textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion);
        return (this.spanStyle == spanStyleB && this.paragraphStyle == paragraphStyleA) ? this : new TextStyle(spanStyleB, paragraphStyleA);
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final ParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    public final SpanStyle O() {
        return this.spanStyle;
    }

    public final TextStyle b(long color, long fontSize, FontWeight fontWeight, p014n4.b0 fontStyle, p014n4.c0 fontSynthesis, p014n4.q fontFamily, String fontFeatureSettings, long letterSpacing, t4.a baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, t4.k textDecoration, Shadow shadow, m3.g drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, t4.s textMotion) {
        return new TextStyle(new SpanStyle(p1.r(color, this.spanStyle.g()) ? this.spanStyle.getTextForegroundStyle() : t4.n.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion, null), platformStyle);
    }

    @jn0.e
    public final /* synthetic */ TextStyle d(long color, long fontSize, FontWeight fontWeight, p014n4.b0 fontStyle, p014n4.c0 fontSynthesis, p014n4.q fontFamily, String fontFeatureSettings, long letterSpacing, t4.a baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, t4.k textDecoration, Shadow shadow, m3.g drawStyle, t4.j textAlign, t4.l textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, t4.f lineBreak, t4.e hyphens, t4.s textMotion) {
        return new TextStyle(new SpanStyle(p1.r(color, this.spanStyle.g()) ? this.spanStyle.getTextForegroundStyle() : t4.n.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign != null ? textAlign.getValue() : t4.j.INSTANCE.g(), textDirection != null ? textDirection.getValue() : t4.l.INSTANCE.f(), lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak != null ? lineBreak.getMask() : t4.f.INSTANCE.b(), hyphens != null ? hyphens.getValue() : t4.e.INSTANCE.c(), textMotion, null), platformStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) other;
        return p013kotlin.jvm.internal.s.f(this.spanStyle, textStyle.spanStyle) && p013kotlin.jvm.internal.s.f(this.paragraphStyle, textStyle.paragraphStyle) && p013kotlin.jvm.internal.s.f(this.platformStyle, textStyle.platformStyle);
    }

    public final float f() {
        return this.spanStyle.c();
    }

    public final long g() {
        return this.spanStyle.getBackground();
    }

    public final t4.a h() {
        return this.spanStyle.getBaselineShift();
    }

    public int hashCode() {
        int iHashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final h1 i() {
        return this.spanStyle.f();
    }

    public final long j() {
        return this.spanStyle.g();
    }

    public final m3.g k() {
        return this.spanStyle.getDrawStyle();
    }

    public final p014n4.q l() {
        return this.spanStyle.getFontFamily();
    }

    public final String m() {
        return this.spanStyle.getFontFeatureSettings();
    }

    public final long n() {
        return this.spanStyle.getFontSize();
    }

    public final p014n4.b0 o() {
        return this.spanStyle.getFontStyle();
    }

    public final p014n4.c0 p() {
        return this.spanStyle.getFontSynthesis();
    }

    public final FontWeight q() {
        return this.spanStyle.getFontWeight();
    }

    public final int r() {
        return this.paragraphStyle.getHyphens();
    }

    public final long s() {
        return this.spanStyle.getLetterSpacing();
    }

    public final int t() {
        return this.paragraphStyle.getLineBreak();
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) p1.y(j())) + ", brush=" + i() + ", alpha=" + f() + ", fontSize=" + ((Object) w4.v.k(n())) + ", fontWeight=" + q() + ", fontStyle=" + o() + ", fontSynthesis=" + p() + ", fontFamily=" + l() + ", fontFeatureSettings=" + m() + ", letterSpacing=" + ((Object) w4.v.k(s())) + ", baselineShift=" + h() + ", textGeometricTransform=" + E() + ", localeList=" + w() + ", background=" + ((Object) p1.y(g())) + ", textDecoration=" + C() + ", shadow=" + z() + ", drawStyle=" + k() + ", textAlign=" + ((Object) t4.j.m(B())) + ", textDirection=" + ((Object) t4.l.l(D())) + ", lineHeight=" + ((Object) w4.v.k(u())) + ", textIndent=" + F() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + v() + ", lineBreak=" + ((Object) t4.f.k(t())) + ", hyphens=" + ((Object) t4.e.i(r())) + ", textMotion=" + G() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final long u() {
        return this.paragraphStyle.getLineHeight();
    }

    public final LineHeightStyle v() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    public final LocaleList w() {
        return this.spanStyle.getLocaleList();
    }

    public final ParagraphStyle x() {
        return this.paragraphStyle;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow z() {
        return this.spanStyle.getShadow();
    }

    @jn0.e
    public /* synthetic */ TextStyle(long j11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow e4Var, m3.g gVar, t4.j jVar, t4.l lVar, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, t4.f fVar, t4.e eVar, t4.s sVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, fontWeight, b0Var, c0Var, qVar, str, j13, aVar, textGeometricTransform, localeList, j14, kVar, e4Var, gVar, jVar, lVar, j15, textIndent, platformTextStyle, lineHeightStyle, fVar, eVar, sVar);
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle, PlatformTextStyle platformTextStyle) {
        this.spanStyle = spanStyle;
        this.paragraphStyle = paragraphStyle;
        this.platformStyle = platformTextStyle;
    }

    public TextStyle(SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        this(spanStyle, paragraphStyle, s0.b(spanStyle.getPlatformStyle(), paragraphStyle.getPlatformStyle()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow e4Var, m3.g gVar, t4.j jVar, t4.l lVar, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, t4.f fVar, t4.e eVar, t4.s sVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        long j16 = (i11 & 1) != 0 ? p1.INSTANCE.j() : j11;
        long jA = (i11 & 2) != 0 ? w4.v.INSTANCE.a() : j12;
        FontWeight fontWeight2 = (i11 & 4) != 0 ? null : fontWeight;
        p014n4.b0 b0Var2 = (i11 & 8) != 0 ? null : b0Var;
        p014n4.c0 c0Var2 = (i11 & 16) != 0 ? null : c0Var;
        p014n4.q qVar2 = (i11 & 32) != 0 ? null : qVar;
        String str2 = (i11 & 64) != 0 ? null : str;
        long jA2 = (i11 & 128) != 0 ? w4.v.INSTANCE.a() : j13;
        t4.a aVar2 = (i11 & 256) != 0 ? null : aVar;
        TextGeometricTransform textGeometricTransform2 = (i11 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i11 & 1024) != 0 ? null : localeList;
        long j17 = (i11 & 2048) != 0 ? p1.INSTANCE.j() : j14;
        t4.k kVar2 = (i11 & 4096) != 0 ? null : kVar;
        long j18 = j16;
        Shadow e4Var2 = (i11 & PKIFailureInfo.certRevoked) != 0 ? null : e4Var;
        m3.g gVar2 = (i11 & 16384) != 0 ? null : gVar;
        t4.j jVar2 = (i11 & 32768) != 0 ? null : jVar;
        t4.l lVar2 = (i11 & 65536) != 0 ? null : lVar;
        long jA3 = (i11 & 131072) != 0 ? w4.v.INSTANCE.a() : j15;
        TextIndent textIndent2 = (i11 & 262144) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : lineHeightStyle;
        t4.f fVar2 = (i11 & PKIFailureInfo.badSenderNonce) != 0 ? null : fVar;
        t4.e eVar2 = (i11 & 4194304) != 0 ? null : eVar;
        long j19 = jA;
        FontWeight fontWeight3 = fontWeight2;
        t4.k kVar3 = kVar2;
        p014n4.b0 b0Var3 = b0Var2;
        p014n4.c0 c0Var3 = c0Var2;
        p014n4.q qVar3 = qVar2;
        String str3 = str2;
        long j21 = jA2;
        t4.a aVar3 = aVar2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j22 = j17;
        this(j18, j19, fontWeight3, b0Var3, c0Var3, qVar3, str3, j21, aVar3, textGeometricTransform3, localeList3, j22, kVar3, e4Var2, gVar2, jVar2, lVar2, jA3, textIndent2, platformTextStyle2, lineHeightStyle2, fVar2, eVar2, (i11 & 8388608) != 0 ? null : sVar, (DefaultConstructorMarker) null);
    }

    private TextStyle(long j11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow e4Var, m3.g gVar, t4.j jVar, t4.l lVar, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, t4.f fVar, t4.e eVar, t4.s sVar) {
        this(new SpanStyle(j11, j12, fontWeight, b0Var, c0Var, qVar, str, j13, aVar, textGeometricTransform, localeList, j14, kVar, e4Var, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, gVar, (DefaultConstructorMarker) null), new ParagraphStyle(jVar != null ? jVar.getValue() : t4.j.INSTANCE.g(), lVar != null ? lVar.getValue() : t4.l.INSTANCE.f(), j15, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, fVar != null ? fVar.getMask() : t4.f.INSTANCE.b(), eVar != null ? eVar.getValue() : t4.e.INSTANCE.c(), sVar, null), platformTextStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow e4Var, m3.g gVar, int i11, int i12, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i13, int i14, t4.s sVar, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        long j16 = (i15 & 1) != 0 ? p1.INSTANCE.j() : j11;
        long jA = (i15 & 2) != 0 ? w4.v.INSTANCE.a() : j12;
        FontWeight fontWeight2 = (i15 & 4) != 0 ? null : fontWeight;
        p014n4.b0 b0Var2 = (i15 & 8) != 0 ? null : b0Var;
        p014n4.c0 c0Var2 = (i15 & 16) != 0 ? null : c0Var;
        p014n4.q qVar2 = (i15 & 32) != 0 ? null : qVar;
        String str2 = (i15 & 64) != 0 ? null : str;
        long jA2 = (i15 & 128) != 0 ? w4.v.INSTANCE.a() : j13;
        t4.a aVar2 = (i15 & 256) != 0 ? null : aVar;
        TextGeometricTransform textGeometricTransform2 = (i15 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i15 & 1024) != 0 ? null : localeList;
        long j17 = (i15 & 2048) != 0 ? p1.INSTANCE.j() : j14;
        t4.k kVar2 = (i15 & 4096) != 0 ? null : kVar;
        long j18 = j16;
        Shadow e4Var2 = (i15 & PKIFailureInfo.certRevoked) != 0 ? null : e4Var;
        m3.g gVar2 = (i15 & 16384) != 0 ? null : gVar;
        int iG = (i15 & 32768) != 0 ? t4.j.INSTANCE.g() : i11;
        int iF = (i15 & 65536) != 0 ? t4.l.INSTANCE.f() : i12;
        long jA3 = (i15 & 131072) != 0 ? w4.v.INSTANCE.a() : j15;
        TextIndent textIndent2 = (i15 & 262144) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i15 & PKIFailureInfo.badCertTemplate) != 0 ? null : lineHeightStyle;
        int iB = (i15 & PKIFailureInfo.badSenderNonce) != 0 ? t4.f.INSTANCE.b() : i13;
        int iC = (i15 & 4194304) != 0 ? t4.e.INSTANCE.c() : i14;
        long j19 = jA;
        FontWeight fontWeight3 = fontWeight2;
        t4.k kVar3 = kVar2;
        p014n4.b0 b0Var3 = b0Var2;
        p014n4.c0 c0Var3 = c0Var2;
        p014n4.q qVar3 = qVar2;
        String str3 = str2;
        long j21 = jA2;
        t4.a aVar3 = aVar2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j22 = j17;
        this(j18, j19, fontWeight3, b0Var3, c0Var3, qVar3, str3, j21, aVar3, textGeometricTransform3, localeList3, j22, kVar3, e4Var2, gVar2, iG, iF, jA3, textIndent2, platformTextStyle2, lineHeightStyle2, iB, iC, (i15 & 8388608) != 0 ? null : sVar, (DefaultConstructorMarker) null);
    }

    private TextStyle(long j11, long j12, FontWeight fontWeight, p014n4.b0 b0Var, p014n4.c0 c0Var, p014n4.q qVar, String str, long j13, t4.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j14, t4.k kVar, Shadow e4Var, m3.g gVar, int i11, int i12, long j15, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i13, int i14, t4.s sVar) {
        this(new SpanStyle(j11, j12, fontWeight, b0Var, c0Var, qVar, str, j13, aVar, textGeometricTransform, localeList, j14, kVar, e4Var, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, gVar, (DefaultConstructorMarker) null), new ParagraphStyle(i11, i12, j15, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, i13, i14, sVar, null), platformTextStyle);
    }
}
