package p3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.List;
import k3.b1;
import k3.h1;
import k3.p1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b \b\u0007\u0018\u0000 &2\u00020\u0001:\u0002\u001b\u001fB[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\r\u001a\u00020\f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010.\u001a\u0004\b/\u0010\u001aR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b#\u00101R\u001a\u0010\u0013\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b'\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"Lp3/d;", "", "", "name", "Lw4/h;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "Lp3/n;", "root", "Lk3/p1;", "tintColor", "Lk3/b1;", "tintBlendMode", "", "autoMirror", "", "genId", "<init>", "(Ljava/lang/String;FFFFLp3/n;JIZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", Gender.FEMALE, "e", "()F", "c", DateTokenConverter.CONVERTER_KEY, "l", "k", "f", "Lp3/n;", "h", "()Lp3/n;", "J", "j", "()J", "I", IntegerTokenConverter.CONVERTER_KEY, "Z", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f100893l;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float defaultWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float defaultHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float viewportWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float viewportHeight;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final n root;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long tintColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int tintBlendMode;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean autoMirror;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int genId;

    @Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001#BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018Jm\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0000¢\u0006\u0004\b%\u0010&J¤\u0001\u00108\u001a\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020!0 2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010,\u001a\u00020\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u00020\u00072\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\b\b\u0002\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\u00072\b\b\u0002\u00106\u001a\u00020\u00072\b\b\u0002\u00107\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109J\r\u0010;\u001a\u00020:¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010=R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b8\u0010?R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010?R\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b;\u0010AR\u001a\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b%\u0010BR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010CR$\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u00150Dj\b\u0012\u0004\u0012\u00020\u0015`E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010CR\u0014\u0010O\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010N\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Lp3/d$a;", "", "", "name", "Lw4/h;", "defaultWidth", "defaultHeight", "", "viewportWidth", "viewportHeight", "Lk3/p1;", "tintColor", "Lk3/b1;", "tintBlendMode", "", "autoMirror", "<init>", "(Ljava/lang/String;FFFFJIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljn0/h0;", "h", "()V", "Lp3/d$a$a;", "Lp3/n;", "e", "(Lp3/d$a$a;)Lp3/n;", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Lp3/h;", "clipPathData", "a", "(Ljava/lang/String;FFFFFFFLjava/util/List;)Lp3/d$a;", "g", "()Lp3/d$a;", "pathData", "Lk3/v3;", "pathFillType", "Lk3/h1;", "fill", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Lk3/i4;", "strokeLineCap", "Lk3/j4;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "c", "(Ljava/util/List;ILjava/lang/String;Lk3/h1;FLk3/h1;FFIIFFFF)Lp3/d$a;", "Lp3/d;", "f", "()Lp3/d;", "Ljava/lang/String;", "b", Gender.FEMALE, DateTokenConverter.CONVERTER_KEY, "J", "I", "Z", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/util/ArrayList;", "nodes", "j", "Lp3/d$a$a;", "root", "k", "isConsumed", "()Lp3/d$a$a;", "currentGroup", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float defaultWidth;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float defaultHeight;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float viewportWidth;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float viewportHeight;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final long tintColor;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final int tintBlendMode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final boolean autoMirror;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<C2136a> nodes;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private C2136a root;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private boolean isConsumed;

        /* JADX INFO: renamed from: p3.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b!\b\u0002\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001b\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010,\u001a\u0004\b\u001a\u0010-\"\u0004\b.\u0010/R(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010,\u001a\u0004\b\u0014\u0010-\"\u0004\b0\u0010/¨\u00061"}, d2 = {"Lp3/d$a$a;", "", "", "name", "", "rotate", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Lp3/h;", "clipPathData", "", "Lp3/p;", "children", "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "b", Gender.FEMALE, "f", "()F", "setRotate", "(F)V", DateTokenConverter.CONVERTER_KEY, "setPivotX", "e", "setPivotY", "g", "setScaleX", "h", "setScaleY", IntegerTokenConverter.CONVERTER_KEY, "setTranslationX", "j", "setTranslationY", "Ljava/util/List;", "()Ljava/util/List;", "setClipPathData", "(Ljava/util/List;)V", "setChildren", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private static final class C2136a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private String name;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private float rotate;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private float pivotX;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private float pivotY;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            private float scaleX;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            private float scaleY;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private float translationX;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private float translationY;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
            private List<? extends h> clipPathData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            private List<p> children;

            public C2136a() {
                this(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, 1023, null);
            }

            public final List<p> a() {
                return this.children;
            }

            public final List<h> b() {
                return this.clipPathData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final float getPivotX() {
                return this.pivotX;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final float getPivotY() {
                return this.pivotY;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final float getRotate() {
                return this.rotate;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final float getScaleX() {
                return this.scaleX;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final float getScaleY() {
                return this.scaleY;
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final float getTranslationX() {
                return this.translationX;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final float getTranslationY() {
                return this.translationY;
            }

            public C2136a(String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List<? extends h> list, List<p> list2) {
                this.name = str;
                this.rotate = f11;
                this.pivotX = f12;
                this.pivotY = f13;
                this.scaleX = f14;
                this.scaleY = f15;
                this.translationX = f16;
                this.translationY = f17;
                this.clipPathData = list;
                this.children = list2;
            }

            public /* synthetic */ C2136a(String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) != 0 ? 0.0f : f12, (i11 & 8) != 0 ? 0.0f : f13, (i11 & 16) != 0 ? 1.0f : f14, (i11 & 32) != 0 ? 1.0f : f15, (i11 & 64) != 0 ? 0.0f : f16, (i11 & 128) != 0 ? 0.0f : f17, (i11 & 256) != 0 ? o.d() : list, (i11 & 512) != 0 ? new ArrayList() : list2);
            }
        }

        public /* synthetic */ a(String str, float f11, float f12, float f13, float f14, long j11, int i11, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f11, f12, f13, f14, j11, i11, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a b(a aVar, String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "";
            }
            if ((i11 & 2) != 0) {
                f11 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f12 = 0.0f;
            }
            if ((i11 & 8) != 0) {
                f13 = 0.0f;
            }
            if ((i11 & 16) != 0) {
                f14 = 1.0f;
            }
            if ((i11 & 32) != 0) {
                f15 = 1.0f;
            }
            if ((i11 & 64) != 0) {
                f16 = 0.0f;
            }
            if ((i11 & 128) != 0) {
                f17 = 0.0f;
            }
            if ((i11 & 256) != 0) {
                list = o.d();
            }
            float f18 = f17;
            List list2 = list;
            float f19 = f16;
            float f21 = f14;
            return aVar.a(str, f11, f12, f13, f21, f15, f19, f18, list2);
        }

        private final n e(C2136a c2136a) {
            return new n(c2136a.getName(), c2136a.getRotate(), c2136a.getPivotX(), c2136a.getPivotY(), c2136a.getScaleX(), c2136a.getScaleY(), c2136a.getTranslationX(), c2136a.getTranslationY(), c2136a.b(), c2136a.a());
        }

        private final void h() {
            if (this.isConsumed) {
                y3.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        private final C2136a i() {
            return (C2136a) e.d(this.nodes);
        }

        public final a a(String name, float rotate, float pivotX, float pivotY, float scaleX, float scaleY, float translationX, float translationY, List<? extends h> clipPathData) {
            h();
            e.f(this.nodes, new C2136a(name, rotate, pivotX, pivotY, scaleX, scaleY, translationX, translationY, clipPathData, null, 512, null));
            return this;
        }

        public final a c(List<? extends h> pathData, int pathFillType, String name, h1 fill, float fillAlpha, h1 stroke, float strokeAlpha, float strokeLineWidth, int strokeLineCap, int strokeLineJoin, float strokeLineMiter, float trimPathStart, float trimPathEnd, float trimPathOffset) {
            h();
            i().a().add(new r(name, pathData, pathFillType, fill, fillAlpha, stroke, strokeAlpha, strokeLineWidth, strokeLineCap, strokeLineJoin, strokeLineMiter, trimPathStart, trimPathEnd, trimPathOffset, null));
            return this;
        }

        public final d f() {
            h();
            while (this.nodes.size() > 1) {
                g();
            }
            d dVar = new d(this.name, this.defaultWidth, this.defaultHeight, this.viewportWidth, this.viewportHeight, e(this.root), this.tintColor, this.tintBlendMode, this.autoMirror, 0, 512, null);
            this.isConsumed = true;
            return dVar;
        }

        public final a g() {
            h();
            i().a().add(e((C2136a) e.e(this.nodes)));
            return this;
        }

        private a(String str, float f11, float f12, float f13, float f14, long j11, int i11, boolean z11) {
            this.name = str;
            this.defaultWidth = f11;
            this.defaultHeight = f12;
            this.viewportWidth = f13;
            this.viewportHeight = f14;
            this.tintColor = j11;
            this.tintBlendMode = i11;
            this.autoMirror = z11;
            ArrayList<C2136a> arrayList = new ArrayList<>();
            this.nodes = arrayList;
            C2136a c2136a = new C2136a(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, 1023, null);
            this.root = c2136a;
            e.f(arrayList, c2136a);
        }

        public /* synthetic */ a(String str, float f11, float f12, float f13, float f14, long j11, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? "" : str, f11, f12, f13, f14, (i12 & 32) != 0 ? p1.INSTANCE.j() : j11, (i12 & 64) != 0 ? b1.INSTANCE.z() : i11, (i12 & 128) != 0 ? false : z11, null);
        }
    }

    /* JADX INFO: renamed from: p3.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp3/d$b;", "", "<init>", "()V", "", "a", "()I", "imageVectorCount", "I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            int i11;
            synchronized (this) {
                i11 = d.f100893l;
                d.f100893l = i11 + 1;
            }
            return i11;
        }

        private Companion() {
        }
    }

    public /* synthetic */ d(String str, float f11, float f12, float f13, float f14, n nVar, long j11, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f11, f12, f13, f14, nVar, j11, i11, z11, i12);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAutoMirror() {
        return this.autoMirror;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getDefaultHeight() {
        return this.defaultHeight;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getDefaultWidth() {
        return this.defaultWidth;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return s.f(this.name, dVar.name) && w4.h.i(this.defaultWidth, dVar.defaultWidth) && w4.h.i(this.defaultHeight, dVar.defaultHeight) && this.viewportWidth == dVar.viewportWidth && this.viewportHeight == dVar.viewportHeight && s.f(this.root, dVar.root) && p1.r(this.tintColor, dVar.tintColor) && b1.E(this.tintBlendMode, dVar.tintBlendMode) && this.autoMirror == dVar.autoMirror;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getGenId() {
        return this.genId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final n getRoot() {
        return this.root;
    }

    public int hashCode() {
        return (((((((((((((((this.name.hashCode() * 31) + w4.h.j(this.defaultWidth)) * 31) + w4.h.j(this.defaultHeight)) * 31) + Float.hashCode(this.viewportWidth)) * 31) + Float.hashCode(this.viewportHeight)) * 31) + this.root.hashCode()) * 31) + p1.x(this.tintColor)) * 31) + b1.F(this.tintBlendMode)) * 31) + Boolean.hashCode(this.autoMirror);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getTintBlendMode() {
        return this.tintBlendMode;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getTintColor() {
        return this.tintColor;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getViewportHeight() {
        return this.viewportHeight;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getViewportWidth() {
        return this.viewportWidth;
    }

    private d(String str, float f11, float f12, float f13, float f14, n nVar, long j11, int i11, boolean z11, int i12) {
        this.name = str;
        this.defaultWidth = f11;
        this.defaultHeight = f12;
        this.viewportWidth = f13;
        this.viewportHeight = f14;
        this.root = nVar;
        this.tintColor = j11;
        this.tintBlendMode = i11;
        this.autoMirror = z11;
        this.genId = i12;
    }

    public /* synthetic */ d(String str, float f11, float f12, float f13, float f14, n nVar, long j11, int i11, boolean z11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f11, f12, f13, f14, nVar, j11, i11, z11, (i13 & 512) != 0 ? INSTANCE.a() : i12, null);
    }
}
