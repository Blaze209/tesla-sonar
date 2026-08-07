package m3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import j3.m;
import k3.b1;
import k3.d3;
import k3.h1;
import k3.i3;
import k3.i4;
import k3.j1;
import k3.j4;
import k3.p1;
import k3.q0;
import k3.q1;
import k3.r3;
import k3.s3;
import k3.t3;
import k3.u3;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import w4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001_B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\u0017\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJj\u0010%\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&Jl\u0010'\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001e\u0010)\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*J`\u0010/\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b/\u00100J`\u00101\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102JN\u00106\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107JN\u00108\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109JF\u0010<\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u00103\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b<\u0010=Jf\u0010D\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020@2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010EJV\u0010H\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u0010G\u001a\u00020F2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bH\u0010IJV\u0010J\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u0010G\u001a\u00020F2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJN\u0010N\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bN\u0010OJf\u0010T\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020R2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bT\u0010UJf\u0010V\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020R2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bV\u0010WJF\u0010Z\u001a\u00020.2\u0006\u0010Y\u001a\u00020X2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bZ\u0010[JF\u0010\\\u001a\u00020.2\u0006\u0010Y\u001a\u00020X2\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b\\\u0010]R \u0010d\u001a\u00020^8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b_\u0010`\u0012\u0004\bc\u0010\u0003\u001a\u0004\ba\u0010bR\u001a\u0010j\u001a\u00020e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u0018\u0010l\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010kR\u0018\u0010n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010kR\u0014\u0010r\u001a\u00020o8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010u\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0014\u0010w\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006x"}, d2 = {"Lm3/a;", "Lm3/f;", "<init>", "()V", "Lk3/r3;", Gender.MALE, "()Lk3/r3;", "P", "Lm3/g;", "drawStyle", Gender.UNKNOWN, "(Lm3/g;)Lk3/r3;", "Lk3/h1;", "brush", "style", "", "alpha", "Lk3/q1;", "colorFilter", "Lk3/b1;", "blendMode", "Lk3/d3;", "filterQuality", "q", "(Lk3/h1;Lm3/g;FLk3/q1;II)Lk3/r3;", "Lk3/p1;", "color", "c", "(JLm3/g;FLk3/q1;II)Lk3/r3;", "strokeWidth", "miter", "Lk3/i4;", "cap", "Lk3/j4;", "join", "Lk3/u3;", "pathEffect", "B", "(JFFIILk3/u3;FLk3/q1;II)Lk3/r3;", Gender.FEMALE, "(Lk3/h1;FFIILk3/u3;FLk3/q1;II)Lk3/r3;", "K", "(JF)J", "Lj3/g;", "start", "end", "Ljn0/h0;", "r0", "(Lk3/h1;JJFILk3/u3;FLk3/q1;I)V", "Z0", "(JJJFILk3/u3;FLk3/q1;I)V", "topLeft", "Lj3/m;", "size", "h0", "(Lk3/h1;JJFLm3/g;Lk3/q1;I)V", "w0", "(JJJFLm3/g;Lk3/q1;I)V", "Lk3/i3;", "image", "p1", "(Lk3/i3;JFLm3/g;Lk3/q1;I)V", "Lw4/n;", "srcOffset", "Lw4/r;", "srcSize", "dstOffset", "dstSize", "l0", "(Lk3/i3;JJJJFLm3/g;Lk3/q1;II)V", "Lj3/a;", "cornerRadius", "W0", "(Lk3/h1;JJJFLm3/g;Lk3/q1;I)V", "A1", "(JJJJLm3/g;FLk3/q1;I)V", "radius", "center", "C1", "(JFJFLm3/g;Lk3/q1;I)V", "startAngle", "sweepAngle", "", "useCenter", "V0", "(Lk3/h1;FFZJJFLm3/g;Lk3/q1;I)V", "z1", "(JFFZJJFLm3/g;Lk3/q1;I)V", "Lk3/t3;", "path", "e0", "(Lk3/t3;JFLm3/g;Lk3/q1;I)V", "E1", "(Lk3/t3;Lk3/h1;FLm3/g;Lk3/q1;I)V", "Lm3/a$a;", "a", "Lm3/a$a;", "I", "()Lm3/a$a;", "getDrawParams$annotations", "drawParams", "Lm3/d;", "b", "Lm3/d;", "D0", "()Lm3/d;", "drawContext", "Lk3/r3;", "fillPaint", DateTokenConverter.CONVERTER_KEY, "strokePaint", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "layoutDirection", "getDensity", "()F", "density", "M1", "fontScale", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d drawContext = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private r3 fillPaint;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private r3 strokePaint;

    /* JADX INFO: renamed from: m3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010%R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010)R(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010-\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Lm3/a$a;", "", "Lw4/d;", "density", "Lw4/t;", "layoutDirection", "Lk3/j1;", "canvas", "Lj3/m;", "size", "<init>", "(Lw4/d;Lw4/t;Lk3/j1;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "()Lw4/d;", "b", "()Lw4/t;", "c", "()Lk3/j1;", DateTokenConverter.CONVERTER_KEY, "()J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lw4/d;", "f", "j", "(Lw4/d;)V", "Lw4/t;", "g", "k", "(Lw4/t;)V", "Lk3/j1;", "e", IntegerTokenConverter.CONVERTER_KEY, "(Lk3/j1;)V", "J", "h", "l", "(J)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DrawParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private w4.d density;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private t layoutDirection;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private j1 canvas;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private long size;

        public /* synthetic */ DrawParams(w4.d dVar, t tVar, j1 j1Var, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, tVar, j1Var, j11);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final w4.d getDensity() {
            return this.density;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final t getLayoutDirection() {
            return this.layoutDirection;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final j1 getCanvas() {
            return this.canvas;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        public final j1 e() {
            return this.canvas;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) other;
            return s.f(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && s.f(this.canvas, drawParams.canvas) && m.h(this.size, drawParams.size);
        }

        public final w4.d f() {
            return this.density;
        }

        public final t g() {
            return this.layoutDirection;
        }

        public final long h() {
            return this.size;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + m.l(this.size);
        }

        public final void i(j1 j1Var) {
            this.canvas = j1Var;
        }

        public final void j(w4.d dVar) {
            this.density = dVar;
        }

        public final void k(t tVar) {
            this.layoutDirection = tVar;
        }

        public final void l(long j11) {
            this.size = j11;
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) m.o(this.size)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        private DrawParams(w4.d dVar, t tVar, j1 j1Var, long j11) {
            this.density = dVar;
            this.layoutDirection = tVar;
            this.canvas = j1Var;
            this.size = j11;
        }

        public /* synthetic */ DrawParams(w4.d dVar, t tVar, j1 j1Var, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? e.a() : dVar, (i11 & 2) != 0 ? t.Ltr : tVar, (i11 & 4) != 0 ? new i() : j1Var, (i11 & 8) != 0 ? m.INSTANCE.b() : j11, null);
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00168V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\t\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"m3/a$b", "Lm3/d;", "Lm3/h;", "a", "Lm3/h;", IntegerTokenConverter.CONVERTER_KEY, "()Lm3/h;", "transform", "Ln3/c;", "b", "Ln3/c;", "g", "()Ln3/c;", "e", "(Ln3/c;)V", "graphicsLayer", "Lk3/j1;", "value", "()Lk3/j1;", "h", "(Lk3/j1;)V", "canvas", "Lj3/m;", "()J", "f", "(J)V", "size", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "c", "(Lw4/t;)V", "layoutDirection", "Lw4/d;", "getDensity", "()Lw4/d;", DateTokenConverter.CONVERTER_KEY, "(Lw4/d;)V", "density", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final h transform = m3.b.b(this);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private n3.c graphicsLayer;

        b() {
        }

        @Override // m3.d
        public j1 a() {
            return a.this.getDrawParams().e();
        }

        @Override // m3.d
        public long b() {
            return a.this.getDrawParams().h();
        }

        @Override // m3.d
        public void c(t tVar) {
            a.this.getDrawParams().k(tVar);
        }

        @Override // m3.d
        public void d(w4.d dVar) {
            a.this.getDrawParams().j(dVar);
        }

        @Override // m3.d
        public void e(n3.c cVar) {
            this.graphicsLayer = cVar;
        }

        @Override // m3.d
        public void f(long j11) {
            a.this.getDrawParams().l(j11);
        }

        @Override // m3.d
        /* JADX INFO: renamed from: g, reason: from getter */
        public n3.c getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // m3.d
        public w4.d getDensity() {
            return a.this.getDrawParams().f();
        }

        @Override // m3.d
        public t getLayoutDirection() {
            return a.this.getDrawParams().g();
        }

        @Override // m3.d
        public void h(j1 j1Var) {
            a.this.getDrawParams().i(j1Var);
        }

        @Override // m3.d
        /* JADX INFO: renamed from: i, reason: from getter */
        public h getTransform() {
            return this.transform;
        }
    }

    private final r3 B(long color, float strokeWidth, float miter, int cap, int join, u3 pathEffect, float alpha, q1 colorFilter, int blendMode, int filterQuality) {
        r3 r3VarP = P();
        long jK = K(color, alpha);
        if (!p1.r(r3VarP.c(), jK)) {
            r3VarP.s(jK);
        }
        if (r3VarP.getInternalShader() != null) {
            r3VarP.F(null);
        }
        if (!s.f(r3VarP.getInternalColorFilter(), colorFilter)) {
            r3VarP.t(colorFilter);
        }
        if (!b1.E(r3VarP.get_blendMode(), blendMode)) {
            r3VarP.D(blendMode);
        }
        if (r3VarP.C() != strokeWidth) {
            r3VarP.B(strokeWidth);
        }
        if (r3VarP.v() != miter) {
            r3VarP.y(miter);
        }
        if (!i4.e(r3VarP.q(), cap)) {
            r3VarP.o(cap);
        }
        if (!j4.e(r3VarP.u(), join)) {
            r3VarP.r(join);
        }
        if (!s.f(r3VarP.getPathEffect(), pathEffect)) {
            r3VarP.A(pathEffect);
        }
        if (!d3.d(r3VarP.G(), filterQuality)) {
            r3VarP.p(filterQuality);
        }
        return r3VarP;
    }

    static /* synthetic */ r3 D(a aVar, long j11, float f11, float f12, int i11, int i12, u3 u3Var, float f13, q1 q1Var, int i13, int i14, int i15, Object obj) {
        return aVar.B(j11, f11, f12, i11, i12, u3Var, f13, q1Var, i13, (i15 & 512) != 0 ? f.INSTANCE.b() : i14);
    }

    private final r3 F(h1 brush, float strokeWidth, float miter, int cap, int join, u3 pathEffect, float alpha, q1 colorFilter, int blendMode, int filterQuality) {
        r3 r3VarP = P();
        if (brush != null) {
            brush.a(b(), r3VarP, alpha);
        } else if (r3VarP.b() != alpha) {
            r3VarP.a(alpha);
        }
        if (!s.f(r3VarP.getInternalColorFilter(), colorFilter)) {
            r3VarP.t(colorFilter);
        }
        if (!b1.E(r3VarP.get_blendMode(), blendMode)) {
            r3VarP.D(blendMode);
        }
        if (r3VarP.C() != strokeWidth) {
            r3VarP.B(strokeWidth);
        }
        if (r3VarP.v() != miter) {
            r3VarP.y(miter);
        }
        if (!i4.e(r3VarP.q(), cap)) {
            r3VarP.o(cap);
        }
        if (!j4.e(r3VarP.u(), join)) {
            r3VarP.r(join);
        }
        if (!s.f(r3VarP.getPathEffect(), pathEffect)) {
            r3VarP.A(pathEffect);
        }
        if (!d3.d(r3VarP.G(), filterQuality)) {
            r3VarP.p(filterQuality);
        }
        return r3VarP;
    }

    static /* synthetic */ r3 G(a aVar, h1 h1Var, float f11, float f12, int i11, int i12, u3 u3Var, float f13, q1 q1Var, int i13, int i14, int i15, Object obj) {
        return aVar.F(h1Var, f11, f12, i11, i12, u3Var, f13, q1Var, i13, (i15 & 512) != 0 ? f.INSTANCE.b() : i14);
    }

    private final long K(long j11, float f11) {
        return f11 == 1.0f ? j11 : p1.p(j11, p1.s(j11) * f11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
    }

    private final r3 M() {
        r3 r3Var = this.fillPaint;
        if (r3Var != null) {
            return r3Var;
        }
        r3 r3VarA = q0.a();
        r3VarA.z(s3.INSTANCE.a());
        this.fillPaint = r3VarA;
        return r3VarA;
    }

    private final r3 P() {
        r3 r3Var = this.strokePaint;
        if (r3Var != null) {
            return r3Var;
        }
        r3 r3VarA = q0.a();
        r3VarA.z(s3.INSTANCE.b());
        this.strokePaint = r3VarA;
        return r3VarA;
    }

    private final r3 U(g drawStyle) {
        if (s.f(drawStyle, j.f90966a)) {
            return M();
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        r3 r3VarP = P();
        Stroke kVar = (Stroke) drawStyle;
        if (r3VarP.C() != kVar.getWidth()) {
            r3VarP.B(kVar.getWidth());
        }
        if (!i4.e(r3VarP.q(), kVar.getCap())) {
            r3VarP.o(kVar.getCap());
        }
        if (r3VarP.v() != kVar.getMiter()) {
            r3VarP.y(kVar.getMiter());
        }
        if (!j4.e(r3VarP.u(), kVar.getJoin())) {
            r3VarP.r(kVar.getJoin());
        }
        if (!s.f(r3VarP.getPathEffect(), kVar.getPathEffect())) {
            r3VarP.A(kVar.getPathEffect());
        }
        return r3VarP;
    }

    private final r3 c(long color, g style, float alpha, q1 colorFilter, int blendMode, int filterQuality) {
        r3 r3VarU = U(style);
        long jK = K(color, alpha);
        if (!p1.r(r3VarU.c(), jK)) {
            r3VarU.s(jK);
        }
        if (r3VarU.getInternalShader() != null) {
            r3VarU.F(null);
        }
        if (!s.f(r3VarU.getInternalColorFilter(), colorFilter)) {
            r3VarU.t(colorFilter);
        }
        if (!b1.E(r3VarU.get_blendMode(), blendMode)) {
            r3VarU.D(blendMode);
        }
        if (!d3.d(r3VarU.G(), filterQuality)) {
            r3VarU.p(filterQuality);
        }
        return r3VarU;
    }

    static /* synthetic */ r3 n(a aVar, long j11, g gVar, float f11, q1 q1Var, int i11, int i12, int i13, Object obj) {
        return aVar.c(j11, gVar, f11, q1Var, i11, (i13 & 32) != 0 ? f.INSTANCE.b() : i12);
    }

    private final r3 q(h1 brush, g style, float alpha, q1 colorFilter, int blendMode, int filterQuality) {
        r3 r3VarU = U(style);
        if (brush != null) {
            brush.a(b(), r3VarU, alpha);
        } else {
            if (r3VarU.getInternalShader() != null) {
                r3VarU.F(null);
            }
            long jC = r3VarU.c();
            p1.Companion companion = p1.INSTANCE;
            if (!p1.r(jC, companion.a())) {
                r3VarU.s(companion.a());
            }
            if (r3VarU.b() != alpha) {
                r3VarU.a(alpha);
            }
        }
        if (!s.f(r3VarU.getInternalColorFilter(), colorFilter)) {
            r3VarU.t(colorFilter);
        }
        if (!b1.E(r3VarU.get_blendMode(), blendMode)) {
            r3VarU.D(blendMode);
        }
        if (!d3.d(r3VarU.G(), filterQuality)) {
            r3VarU.p(filterQuality);
        }
        return r3VarU;
    }

    static /* synthetic */ r3 y(a aVar, h1 h1Var, g gVar, float f11, q1 q1Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            i12 = f.INSTANCE.b();
        }
        return aVar.q(h1Var, gVar, f11, q1Var, i11, i12);
    }

    @Override // m3.f
    public void A1(long color, long topLeft, long size, long cornerRadius, g style, float alpha, q1 colorFilter, int blendMode) {
        this.drawParams.e().m(j3.g.m(topLeft), j3.g.n(topLeft), j3.g.m(topLeft) + m.k(size), j3.g.n(topLeft) + m.i(size), j3.a.d(cornerRadius), j3.a.e(cornerRadius), n(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // m3.f
    public void C1(long color, float radius, long center, float alpha, g style, q1 colorFilter, int blendMode) {
        this.drawParams.e().h(center, radius, n(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // m3.f
    /* JADX INFO: renamed from: D0, reason: from getter */
    public d getDrawContext() {
        return this.drawContext;
    }

    @Override // m3.f
    public void E1(t3 path, h1 brush, float alpha, g style, q1 colorFilter, int blendMode) {
        this.drawParams.e().f(path, y(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // w4.l
    /* JADX INFO: renamed from: M1 */
    public float getFontScale() {
        return this.drawParams.f().getFontScale();
    }

    @Override // m3.f
    public void V0(h1 brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, g style, q1 colorFilter, int blendMode) {
        this.drawParams.e().s(j3.g.m(topLeft), j3.g.n(topLeft), j3.g.m(topLeft) + m.k(size), j3.g.n(topLeft) + m.i(size), startAngle, sweepAngle, useCenter, y(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // m3.f
    public void W0(h1 brush, long topLeft, long size, long cornerRadius, float alpha, g style, q1 colorFilter, int blendMode) {
        this.drawParams.e().m(j3.g.m(topLeft), j3.g.n(topLeft), j3.g.m(topLeft) + m.k(size), j3.g.n(topLeft) + m.i(size), j3.a.d(cornerRadius), j3.a.e(cornerRadius), y(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // m3.f
    public void Z0(long color, long start, long end, float strokeWidth, int cap, u3 pathEffect, float alpha, q1 colorFilter, int blendMode) {
        this.drawParams.e().n(start, end, D(this, color, strokeWidth, 4.0f, cap, j4.INSTANCE.b(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // m3.f
    public void e0(t3 path, long color, float alpha, g style, q1 colorFilter, int blendMode) {
        this.drawParams.e().f(path, n(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // w4.d
    public float getDensity() {
        return this.drawParams.f().getDensity();
    }

    @Override // m3.f
    public t getLayoutDirection() {
        return this.drawParams.g();
    }

    @Override // m3.f
    public void h0(h1 brush, long topLeft, long size, float alpha, g style, q1 colorFilter, int blendMode) {
        this.drawParams.e().i(j3.g.m(topLeft), j3.g.n(topLeft), j3.g.m(topLeft) + m.k(size), j3.g.n(topLeft) + m.i(size), y(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // m3.f
    public void l0(i3 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, g style, q1 colorFilter, int blendMode, int filterQuality) {
        this.drawParams.e().t(image, srcOffset, srcSize, dstOffset, dstSize, q(null, style, alpha, colorFilter, blendMode, filterQuality));
    }

    @Override // m3.f
    public void p1(i3 image, long topLeft, float alpha, g style, q1 colorFilter, int blendMode) {
        this.drawParams.e().x(image, topLeft, y(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // m3.f
    public void r0(h1 brush, long start, long end, float strokeWidth, int cap, u3 pathEffect, float alpha, q1 colorFilter, int blendMode) {
        this.drawParams.e().n(start, end, G(this, brush, strokeWidth, 4.0f, cap, j4.INSTANCE.b(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // m3.f
    public void w0(long color, long topLeft, long size, float alpha, g style, q1 colorFilter, int blendMode) {
        this.drawParams.e().i(j3.g.m(topLeft), j3.g.n(topLeft), j3.g.m(topLeft) + m.k(size), j3.g.n(topLeft) + m.i(size), n(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // m3.f
    public void z1(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, g style, q1 colorFilter, int blendMode) {
        this.drawParams.e().s(j3.g.m(topLeft), j3.g.n(topLeft), j3.g.m(topLeft) + m.k(size), j3.g.n(topLeft) + m.i(size), startAngle, sweepAngle, useCenter, n(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }
}
