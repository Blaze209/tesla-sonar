package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.List;
import java.util.Map;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0017\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\rJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\rJ\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\rJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\rJ\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020 8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR$\u0010+\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001eR\u0016\u0010-\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001cR$\u00100\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001eR$\u00103\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b2\u0010\u001eR\u0016\u00105\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010\u001cR\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00108R*\u0010@\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u001c\u001a\u0004\b>\u0010\u001e\"\u0004\b\u001c\u0010?R*\u0010D\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u001c\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010?R*\u0010J\u001a\u0002062\u0006\u0010<\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u00108\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR*\u0010N\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u001c\u001a\u0004\bL\u0010\u001e\"\u0004\bM\u0010?R*\u0010R\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u001c\u001a\u0004\bP\u0010\u001e\"\u0004\bQ\u0010?R*\u0010U\u001a\u0002062\u0006\u0010<\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u00108\u001a\u0004\bS\u0010G\"\u0004\bT\u0010IR\u001e\u0010Z\u001a\u00060VR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\b8\u0010YR0\u0010_\u001a\b\u0018\u00010[R\u00020\u00002\f\u0010\u001a\u001a\b\u0018\u00010[R\u00020\u00008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bF\u0010\\\u001a\u0004\b]\u0010^R\u001c\u0010`\u001a\u00020\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bS\u0010'R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\b0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010bR\u0011\u0010g\u001a\u00020d8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0019\u0010j\u001a\u0004\u0018\u00010\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0019\u0010l\u001a\u0004\u0018\u00010\u00068Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bk\u0010iR\u0014\u0010n\u001a\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bm\u0010GR\u0014\u0010p\u001a\u0002068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bo\u0010GR\u0014\u0010s\u001a\u00020q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u0010rR\u0016\u0010u\u001a\u0004\u0018\u00010q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bt\u0010r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006v"}, d2 = {"Lb4/l0;", "", "Lb4/g0;", "layoutNode", "<init>", "(Lb4/g0;)V", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Ljn0/h0;", Gender.UNKNOWN, "(J)V", "T", Gender.OTHER, "()V", "R", "P", "Q", "S", "q", "c0", Gender.MALE, "V", Gender.NONE, "a", "Lb4/g0;", "", "<set-?>", "b", "Z", "w", "()Z", "detachedFromParentLookaheadPass", "Lb4/g0$e;", "c", "Lb4/g0$e;", "B", "()Lb4/g0$e;", "layoutState", DateTokenConverter.CONVERTER_KEY, "J", "measurePending", "e", "A", "layoutPending", "f", "layoutPendingForAlignment", "g", "G", "lookaheadMeasurePending", "h", Gender.FEMALE, "lookaheadLayoutPending", IntegerTokenConverter.CONVERTER_KEY, "lookaheadLayoutPendingForAlignment", "", "j", "I", "nextChildLookaheadPlaceOrder", "k", "nextChildPlaceOrder", "value", "l", "v", "(Z)V", "coordinatesAccessedDuringPlacement", "m", "u", "Y", "coordinatesAccessedDuringModifierPlacement", "n", "s", "()I", "W", "(I)V", "childrenAccessingCoordinatesDuringPlacement", "o", "E", "b0", "lookaheadCoordinatesAccessedDuringPlacement", "p", "D", "a0", "lookaheadCoordinatesAccessedDuringModifierPlacement", "t", "X", "childrenAccessingLookaheadCoordinatesDuringPlacement", "Lb4/l0$b;", "r", "Lb4/l0$b;", "()Lb4/l0$b;", "measurePassDelegate", "Lb4/l0$a;", "Lb4/l0$a;", "H", "()Lb4/l0$a;", "lookaheadPassDelegate", "performMeasureConstraints", "Lkotlin/Function0;", "Lwn0/a;", "performMeasureBlock", "Lb4/z0;", "K", "()Lb4/z0;", "outerCoordinator", "y", "()Lw4/b;", "lastConstraints", "z", "lastLookaheadConstraints", "x", Snapshot.HEIGHT, "L", Snapshot.WIDTH, "Lb4/b;", "()Lb4/b;", "alignmentLinesOwner", "C", "lookaheadAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 layoutNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean detachedFromParentLookaheadPass;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean measurePending;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean layoutPending;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean layoutPendingForAlignment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadMeasurePending;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadLayoutPending;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadLayoutPendingForAlignment;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int nextChildLookaheadPlaceOrder;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int nextChildPlaceOrder;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatesAccessedDuringPlacement;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatesAccessedDuringModifierPlacement;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int childrenAccessingCoordinatesDuringPlacement;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadCoordinatesAccessedDuringPlacement;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean lookaheadCoordinatesAccessedDuringModifierPlacement;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int childrenAccessingLookaheadCoordinatesDuringPlacement;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private a lookaheadPassDelegate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private g0.e layoutState = g0.e.Idle;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final b measurePassDelegate = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long performMeasureConstraints = w4.c.b(0, 0, 0, 0, 15, null);

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<jn0.h0> performMeasureBlock = new d();

    @Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJB\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\tJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\tJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\tJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\tJ\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0016¢\u0006\u0004\b\"\u0010#J#\u0010%\u001a\u00020\u00072\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0013H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010\tJ\u000f\u0010(\u001a\u00020\u0007H\u0016¢\u0006\u0004\b(\u0010\tJ\r\u0010)\u001a\u00020\u0007¢\u0006\u0004\b)\u0010\tJ\u001a\u0010,\u001a\u00020\u00012\u0006\u0010+\u001a\u00020*H\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020.2\u0006\u0010+\u001a\u00020*ø\u0001\u0000¢\u0006\u0004\b/\u00100J8\u00101\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013H\u0014ø\u0001\u0000¢\u0006\u0004\b1\u00102J*\u00103\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0014ø\u0001\u0000¢\u0006\u0004\b3\u00104J\u0018\u00106\u001a\u00020!2\u0006\u00105\u001a\u00020 H\u0096\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020!2\u0006\u00108\u001a\u00020!H\u0016¢\u0006\u0004\b;\u0010:J\u0017\u0010=\u001a\u00020!2\u0006\u0010<\u001a\u00020!H\u0016¢\u0006\u0004\b=\u0010:J\u0017\u0010>\u001a\u00020!2\u0006\u0010<\u001a\u00020!H\u0016¢\u0006\u0004\b>\u0010:J\u0015\u0010@\u001a\u00020\u00072\u0006\u0010?\u001a\u00020.¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u0007¢\u0006\u0004\bB\u0010\tJ\r\u0010C\u001a\u00020.¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0007H\u0000¢\u0006\u0004\bE\u0010\tJ\r\u0010F\u001a\u00020\u0007¢\u0006\u0004\bF\u0010\tJ\r\u0010G\u001a\u00020\u0007¢\u0006\u0004\bG\u0010\tR\u0016\u0010J\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001e\u0010M\u001a\u00020!2\u0006\u0010K\u001a\u00020!8\u0002@BX\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010%R\"\u0010S\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010%\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010[\u001a\u00020T8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010_\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010I\u001a\u0004\b]\u0010D\"\u0004\b^\u0010AR\"\u0010c\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010I\u001a\u0004\ba\u0010D\"\u0004\bb\u0010AR\u0016\u0010e\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010IR\u001e\u0010h\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bf\u0010gR*\u0010m\u001a\u00020\u000f2\u0006\u0010K\u001a\u00020\u000f8\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR$\u0010r\u001a\u00020\u00112\u0006\u0010K\u001a\u00020\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR@\u0010w\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\u0014\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00138\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR(\u0010|\u001a\u0004\u0018\u00010\u00162\b\u0010K\u001a\u0004\u0018\u00010\u00168\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R#\u0010\u0080\u0001\u001a\u00020.8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b}\u0010I\u001a\u0004\b~\u0010D\"\u0004\b\u007f\u0010AR\u001f\u0010\u0085\u0001\u001a\u00030\u0081\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0005\bx\u0010\u0084\u0001R#\u0010\u008a\u0001\u001a\u000e\u0012\t\u0012\u00070\u0000R\u00030\u0087\u00010\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R&\u0010\u008e\u0001\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010I\u001a\u0005\b\u008c\u0001\u0010D\"\u0005\b\u008d\u0001\u0010AR'\u0010\u0091\u0001\u001a\u00020.2\u0006\u0010K\u001a\u00020.8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010I\u001a\u0005\b\u0090\u0001\u0010DR\u0018\u0010\u0093\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010IR/\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0094\u00012\t\u0010K\u001a\u0005\u0018\u00010\u0094\u00018\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R.\u0010\u009b\u0001\u001a\u00020.2\u0007\u0010\u009a\u0001\u001a\u00020.8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0004\b~\u0010I\u001a\u0005\b\u009b\u0001\u0010D\"\u0005\b\u009c\u0001\u0010AR\u0018\u0010\u009e\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010IR\u001d\u0010¢\u0001\u001a\b0\u009f\u0001R\u00030\u0087\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u001c\u0010¥\u0001\u001a\u0004\u0018\u00010*8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010©\u0001\u001a\u00030¦\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R#\u0010\u00ad\u0001\u001a\u000e\u0012\t\u0012\u00070\u0000R\u00030\u0087\u00010ª\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u0019\u0010°\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006±\u0001"}, d2 = {"Lb4/l0$a;", "Lz3/w0;", "Lz3/h0;", "Lb4/b;", "Lb4/t0;", "<init>", "(Lb4/l0;)V", "Ljn0/h0;", "k1", "()V", "G1", "Lb4/g0;", "node", "b2", "(Lb4/g0;)V", "Lw4/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "Ln3/c;", "layer", "U1", "(JFLwn0/l;Ln3/c;)V", "P1", "n1", "F1", "L1", "i0", "", "Lz3/a;", "", "B", "()Ljava/util/Map;", "block", "I", "(Lwn0/l;)V", "requestLayout", Gender.UNKNOWN, "J1", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "x0", "(J)Lz3/w0;", "", "V1", "(J)Z", "Y0", "(JFLwn0/l;)V", "X0", "(JFLn3/c;)V", "alignmentLine", "g0", "(Lz3/a;)I", Snapshot.HEIGHT, "s0", "(I)I", "t0", Snapshot.WIDTH, "m0", "V", "forceRequest", "y1", "(Z)V", "B1", "c2", "()Z", "T1", "W1", "R1", "f", "Z", "relayoutWithoutParentInProgress", "<set-?>", "g", "previousPlaceOrder", "h", "getPlaceOrder$ui_release", "()I", "Z1", "(I)V", "placeOrder", "Lb4/g0$g;", IntegerTokenConverter.CONVERTER_KEY, "Lb4/g0$g;", "v1", "()Lb4/g0$g;", "Y1", "(Lb4/g0$g;)V", "measuredByParent", "j", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "duringAlignmentLinesQuery", "k", "x1", "setPlacedOnce$ui_release", "placedOnce", "l", "measuredOnce", "m", "Lw4/b;", "lookaheadConstraints", "n", "J", "getLastPosition-nOcc-ac$ui_release", "()J", "lastPosition", "o", Gender.FEMALE, "getLastZIndex$ui_release", "()F", "lastZIndex", "p", "Lwn0/l;", "getLastLayerBlock$ui_release", "()Lwn0/l;", "lastLayerBlock", "q", "Ln3/c;", "getLastExplicitLayer$ui_release", "()Ln3/c;", "lastExplicitLayer", "r", "y", "a2", "isPlaced", "Lb4/a;", "s", "Lb4/a;", "()Lb4/a;", "alignmentLines", "Lt2/b;", "Lb4/l0;", "t", "Lt2/b;", "_childDelegates", "u", "getChildDelegatesDirty$ui_release", "X1", "childDelegatesDirty", "v", "t1", "layingOutChildren", "w", "parentDataDirty", "", "x", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "parentData", "new", "isPlacedUnderMotionFrameOfReference", "y0", "z", "onNodePlacedCalled", "Lb4/l0$b;", "u1", "()Lb4/l0$b;", "measurePassDelegate", "q1", "()Lw4/b;", "lastConstraints", "Lb4/z0;", "n0", "()Lb4/z0;", "innerCoordinator", "", "o1", "()Ljava/util/List;", "childDelegates", "a0", "()Lb4/b;", "parentAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class a extends z3.w0 implements z3.h0, b4.b, t0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean relayoutWithoutParentInProgress;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean duringAlignmentLinesQuery;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private boolean placedOnce;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private boolean measuredOnce;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private w4.b lookaheadConstraints;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private float lastZIndex;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> lastLayerBlock;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private n3.c lastExplicitLayer;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private boolean isPlaced;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private boolean layingOutChildren;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        private boolean isPlacedUnderMotionFrameOfReference;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        private boolean onNodePlacedCalled;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int previousPlaceOrder = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int placeOrder = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private g0.g measuredByParent = g0.g.NotUsed;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private long lastPosition = w4.n.INSTANCE.a();

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final b4.a alignmentLines = new o0(this);

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final t2.b<a> _childDelegates = new t2.b<>(new a[16], 0);

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private boolean childDelegatesDirty = true;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        private boolean parentDataDirty = true;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        private Object parentData = u1().getParentData();

        /* JADX INFO: renamed from: b4.l0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class C0309a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16162a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f16163b;

            static {
                int[] iArr = new int[g0.e.values().length];
                try {
                    iArr[g0.e.LookaheadMeasuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g0.e.Measuring.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[g0.e.LayingOut.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[g0.e.LookaheadLayingOut.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f16162a = iArr;
                int[] iArr2 = new int[g0.g.values().length];
                try {
                    iArr2[g0.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[g0.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                f16163b = iArr2;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ q0 f16165d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ l0 f16166e;

            /* JADX INFO: renamed from: b4.l0$a$b$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/b;", "child", "Ljn0/h0;", "a", "(Lb4/b;)V"}, k = 3, mv = {1, 8, 0})
            static final class C0310a extends p013kotlin.jvm.internal.u implements wn0.l<b4.b, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final C0310a f16167c = new C0310a();

                C0310a() {
                    super(1);
                }

                public final void a(b4.b bVar) {
                    bVar.getAlignmentLines().t(false);
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(b4.b bVar) {
                    a(bVar);
                    return jn0.h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: b4.l0$a$b$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/b;", "child", "Ljn0/h0;", "a", "(Lb4/b;)V"}, k = 3, mv = {1, 8, 0})
            static final class C0311b extends p013kotlin.jvm.internal.u implements wn0.l<b4.b, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final C0311b f16168c = new C0311b();

                C0311b() {
                    super(1);
                }

                public final void a(b4.b bVar) {
                    bVar.getAlignmentLines().q(bVar.getAlignmentLines().getUsedDuringParentLayout());
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(b4.b bVar) {
                    a(bVar);
                    return jn0.h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(q0 q0Var, l0 l0Var) {
                super(0);
                this.f16165d = q0Var;
                this.f16166e = l0Var;
            }

            public final void b() {
                a.this.n1();
                a.this.I(C0310a.f16167c);
                q0 lookaheadDelegate = a.this.n0().getLookaheadDelegate();
                if (lookaheadDelegate != null) {
                    boolean isPlacingForAlignment = lookaheadDelegate.getIsPlacingForAlignment();
                    List<g0> listG = this.f16166e.layoutNode.G();
                    int size = listG.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        q0 lookaheadDelegate2 = listG.get(i11).l0().getLookaheadDelegate();
                        if (lookaheadDelegate2 != null) {
                            lookaheadDelegate2.W1(isPlacingForAlignment);
                        }
                    }
                }
                this.f16165d.x1().k();
                q0 lookaheadDelegate3 = a.this.n0().getLookaheadDelegate();
                if (lookaheadDelegate3 != null) {
                    lookaheadDelegate3.getIsPlacingForAlignment();
                    List<g0> listG2 = this.f16166e.layoutNode.G();
                    int size2 = listG2.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        q0 lookaheadDelegate4 = listG2.get(i12).l0().getLookaheadDelegate();
                        if (lookaheadDelegate4 != null) {
                            lookaheadDelegate4.W1(false);
                        }
                    }
                }
                a.this.k1();
                a.this.I(C0311b.f16168c);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                b();
                return jn0.h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class c extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l0 f16169c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ j1 f16170d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f16171e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(l0 l0Var, j1 j1Var, long j11) {
                super(0);
                this.f16169c = l0Var;
                this.f16170d = j1Var;
                this.f16171e = j11;
            }

            public final void b() {
                q0 lookaheadDelegate;
                z3.w0.a placementScope = null;
                if (m0.a(this.f16169c.layoutNode)) {
                    z0 wrappedBy = this.f16169c.K().getWrappedBy();
                    if (wrappedBy != null) {
                        placementScope = wrappedBy.getPlacementScope();
                    }
                } else {
                    z0 wrappedBy2 = this.f16169c.K().getWrappedBy();
                    if (wrappedBy2 != null && (lookaheadDelegate = wrappedBy2.getLookaheadDelegate()) != null) {
                        placementScope = lookaheadDelegate.getPlacementScope();
                    }
                }
                if (placementScope == null) {
                    placementScope = this.f16170d.getPlacementScope();
                }
                l0 l0Var = this.f16169c;
                long j11 = this.f16171e;
                q0 lookaheadDelegate2 = l0Var.K().getLookaheadDelegate();
                p013kotlin.jvm.internal.s.h(lookaheadDelegate2);
                z3.w0.a.j(placementScope, lookaheadDelegate2, j11, BitmapDescriptorFactory.HUE_RED, 2, null);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                b();
                return jn0.h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/b;", "it", "Ljn0/h0;", "a", "(Lb4/b;)V"}, k = 3, mv = {1, 8, 0})
        static final class d extends p013kotlin.jvm.internal.u implements wn0.l<b4.b, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f16172c = new d();

            d() {
                super(1);
            }

            public final void a(b4.b bVar) {
                bVar.getAlignmentLines().u(false);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(b4.b bVar) {
                a(bVar);
                return jn0.h0.f84049a;
            }
        }

        public a() {
        }

        private final void F1() {
            boolean isPlaced = getIsPlaced();
            a2(true);
            if (!isPlaced && l0.this.getLookaheadMeasurePending()) {
                g0.s1(l0.this.layoutNode, true, false, false, 6, null);
            }
            t2.b<g0> bVarW0 = l0.this.layoutNode.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                g0[] g0VarArrM = bVarW0.m();
                int i11 = 0;
                do {
                    g0 g0Var = g0VarArrM[i11];
                    a aVarY = g0Var.Y();
                    if (aVarY == null) {
                        throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                    }
                    if (aVarY.placeOrder != Integer.MAX_VALUE) {
                        aVarY.F1();
                        g0Var.x1(g0Var);
                    }
                    i11++;
                } while (i11 < size);
            }
        }

        private final void G1() {
            if (getIsPlaced()) {
                int i11 = 0;
                a2(false);
                t2.b<g0> bVarW0 = l0.this.layoutNode.w0();
                int size = bVarW0.getSize();
                if (size > 0) {
                    g0[] g0VarArrM = bVarW0.m();
                    do {
                        a lookaheadPassDelegate = g0VarArrM[i11].getLayoutDelegate().getLookaheadPassDelegate();
                        p013kotlin.jvm.internal.s.h(lookaheadPassDelegate);
                        lookaheadPassDelegate.G1();
                        i11++;
                    } while (i11 < size);
                }
            }
        }

        private final void L1() {
            g0 g0Var = l0.this.layoutNode;
            l0 l0Var = l0.this;
            t2.b<g0> bVarW0 = g0Var.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                g0[] g0VarArrM = bVarW0.m();
                int i11 = 0;
                do {
                    g0 g0Var2 = g0VarArrM[i11];
                    if (g0Var2.X() && g0Var2.f0() == g0.g.InMeasureBlock) {
                        a lookaheadPassDelegate = g0Var2.getLayoutDelegate().getLookaheadPassDelegate();
                        p013kotlin.jvm.internal.s.h(lookaheadPassDelegate);
                        w4.b bVarZ = g0Var2.getLayoutDelegate().z();
                        p013kotlin.jvm.internal.s.h(bVarZ);
                        if (lookaheadPassDelegate.V1(bVarZ.getValue())) {
                            g0.s1(l0Var.layoutNode, false, false, false, 7, null);
                        }
                    }
                    i11++;
                } while (i11 < size);
            }
        }

        private final void P1() {
            g0.g intrinsicsUsageByParent;
            g0.s1(l0.this.layoutNode, false, false, false, 7, null);
            g0 g0VarN0 = l0.this.layoutNode.n0();
            if (g0VarN0 == null || l0.this.layoutNode.getIntrinsicsUsageByParent() != g0.g.NotUsed) {
                return;
            }
            g0 g0Var = l0.this.layoutNode;
            int i11 = C0309a.f16162a[g0VarN0.V().ordinal()];
            if (i11 != 2) {
                intrinsicsUsageByParent = i11 != 3 ? g0VarN0.getIntrinsicsUsageByParent() : g0.g.InLayoutBlock;
            } else {
                intrinsicsUsageByParent = g0.g.InMeasureBlock;
            }
            g0Var.D1(intrinsicsUsageByParent);
        }

        private final void U1(long position, float zIndex, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> layerBlock, n3.c layer) {
            if (l0.this.layoutNode.getIsDeactivated()) {
                y3.a.a("place is called on a deactivated node");
            }
            l0.this.layoutState = g0.e.LookaheadLayingOut;
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            if (!w4.n.g(position, this.lastPosition)) {
                if (l0.this.getLookaheadCoordinatesAccessedDuringModifierPlacement() || l0.this.getLookaheadCoordinatesAccessedDuringPlacement()) {
                    l0.this.lookaheadLayoutPending = true;
                }
                J1();
            }
            j1 j1VarB = k0.b(l0.this.layoutNode);
            if (l0.this.getLookaheadLayoutPending() || !getIsPlaced()) {
                l0.this.a0(false);
                getAlignmentLines().r(false);
                l1.d(j1VarB.getSnapshotObserver(), l0.this.layoutNode, false, new c(l0.this, j1VarB, position), 2, null);
            } else {
                q0 lookaheadDelegate = l0.this.K().getLookaheadDelegate();
                p013kotlin.jvm.internal.s.h(lookaheadDelegate);
                lookaheadDelegate.j2(position);
                T1();
            }
            this.lastPosition = position;
            this.lastZIndex = zIndex;
            this.lastLayerBlock = layerBlock;
            this.lastExplicitLayer = layer;
            l0.this.layoutState = g0.e.Idle;
        }

        private final void b2(g0 node) {
            g0.g gVar;
            g0 g0VarN0 = node.n0();
            if (g0VarN0 == null) {
                this.measuredByParent = g0.g.NotUsed;
                return;
            }
            if (!(this.measuredByParent == g0.g.NotUsed || node.getCanMultiMeasure())) {
                y3.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i11 = C0309a.f16162a[g0VarN0.V().ordinal()];
            if (i11 == 1 || i11 == 2) {
                gVar = g0.g.InMeasureBlock;
            } else {
                if (i11 != 3 && i11 != 4) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + g0VarN0.V());
                }
                gVar = g0.g.InLayoutBlock;
            }
            this.measuredByParent = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void k1() {
            t2.b<g0> bVarW0 = l0.this.layoutNode.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                g0[] g0VarArrM = bVarW0.m();
                int i11 = 0;
                do {
                    a lookaheadPassDelegate = g0VarArrM[i11].getLayoutDelegate().getLookaheadPassDelegate();
                    p013kotlin.jvm.internal.s.h(lookaheadPassDelegate);
                    int i12 = lookaheadPassDelegate.previousPlaceOrder;
                    int i13 = lookaheadPassDelegate.placeOrder;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        lookaheadPassDelegate.G1();
                    }
                    i11++;
                } while (i11 < size);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n1() {
            int i11 = 0;
            l0.this.nextChildLookaheadPlaceOrder = 0;
            t2.b<g0> bVarW0 = l0.this.layoutNode.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                g0[] g0VarArrM = bVarW0.m();
                do {
                    a lookaheadPassDelegate = g0VarArrM[i11].getLayoutDelegate().getLookaheadPassDelegate();
                    p013kotlin.jvm.internal.s.h(lookaheadPassDelegate);
                    lookaheadPassDelegate.previousPlaceOrder = lookaheadPassDelegate.placeOrder;
                    lookaheadPassDelegate.placeOrder = Integer.MAX_VALUE;
                    if (lookaheadPassDelegate.measuredByParent == g0.g.InLayoutBlock) {
                        lookaheadPassDelegate.measuredByParent = g0.g.NotUsed;
                    }
                    i11++;
                } while (i11 < size);
            }
        }

        @Override // b4.b
        public Map<z3.a, Integer> B() {
            if (!this.duringAlignmentLinesQuery) {
                if (l0.this.getLayoutState() == g0.e.LookaheadMeasuring) {
                    getAlignmentLines().s(true);
                    if (getAlignmentLines().getDirty()) {
                        l0.this.P();
                    }
                } else {
                    getAlignmentLines().r(true);
                }
            }
            q0 lookaheadDelegate = n0().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                lookaheadDelegate.W1(true);
            }
            i0();
            q0 lookaheadDelegate2 = n0().getLookaheadDelegate();
            if (lookaheadDelegate2 != null) {
                lookaheadDelegate2.W1(false);
            }
            return getAlignmentLines().h();
        }

        public final void B1() {
            this.parentDataDirty = true;
        }

        @Override // b4.b
        public void I(wn0.l<? super b4.b, jn0.h0> block) {
            t2.b<g0> bVarW0 = l0.this.layoutNode.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                g0[] g0VarArrM = bVarW0.m();
                int i11 = 0;
                do {
                    b4.b bVarC = g0VarArrM[i11].getLayoutDelegate().C();
                    p013kotlin.jvm.internal.s.h(bVarC);
                    block.invoke(bVarC);
                    i11++;
                } while (i11 < size);
            }
        }

        public final void J1() {
            t2.b<g0> bVarW0;
            int size;
            if (l0.this.getChildrenAccessingLookaheadCoordinatesDuringPlacement() <= 0 || (size = (bVarW0 = l0.this.layoutNode.w0()).getSize()) <= 0) {
                return;
            }
            g0[] g0VarArrM = bVarW0.m();
            int i11 = 0;
            do {
                g0 g0Var = g0VarArrM[i11];
                l0 layoutDelegate = g0Var.getLayoutDelegate();
                if ((layoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() || layoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLookaheadLayoutPending()) {
                    g0.q1(g0Var, false, 1, null);
                }
                a lookaheadPassDelegate = layoutDelegate.getLookaheadPassDelegate();
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.J1();
                }
                i11++;
            } while (i11 < size);
        }

        public final void R1() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            a2(false);
        }

        public final void T1() {
            this.onNodePlacedCalled = true;
            g0 g0VarN0 = l0.this.layoutNode.n0();
            if (!getIsPlaced()) {
                F1();
                if (this.relayoutWithoutParentInProgress && g0VarN0 != null) {
                    g0.q1(g0VarN0, false, 1, null);
                }
            }
            if (g0VarN0 == null) {
                this.placeOrder = 0;
            } else if (!this.relayoutWithoutParentInProgress && (g0VarN0.V() == g0.e.LayingOut || g0VarN0.V() == g0.e.LookaheadLayingOut)) {
                if (!(this.placeOrder == Integer.MAX_VALUE)) {
                    y3.a.b("Place was called on a node which was placed already");
                }
                this.placeOrder = g0VarN0.getLayoutDelegate().nextChildLookaheadPlaceOrder;
                g0VarN0.getLayoutDelegate().nextChildLookaheadPlaceOrder++;
            }
            i0();
        }

        @Override // b4.b
        public void U() {
            g0.s1(l0.this.layoutNode, false, false, false, 7, null);
        }

        @Override // z3.q
        public int V(int width) {
            P1();
            q0 lookaheadDelegate = l0.this.K().getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            return lookaheadDelegate.V(width);
        }

        public final boolean V1(long constraints) {
            if (l0.this.layoutNode.getIsDeactivated()) {
                y3.a.a("measure is called on a deactivated node");
            }
            g0 g0VarN0 = l0.this.layoutNode.n0();
            l0.this.layoutNode.A1(l0.this.layoutNode.getCanMultiMeasure() || (g0VarN0 != null && g0VarN0.getCanMultiMeasure()));
            if (!l0.this.layoutNode.X()) {
                w4.b bVar = this.lookaheadConstraints;
                if (bVar == null ? false : w4.b.f(bVar.getValue(), constraints)) {
                    j1 owner = l0.this.layoutNode.getOwner();
                    if (owner != null) {
                        owner.k(l0.this.layoutNode, true);
                    }
                    l0.this.layoutNode.z1();
                    return false;
                }
            }
            this.lookaheadConstraints = w4.b.a(constraints);
            e1(constraints);
            getAlignmentLines().s(false);
            I(d.f16172c);
            long measuredSize = this.measuredOnce ? getMeasuredSize() : w4.s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
            this.measuredOnce = true;
            q0 lookaheadDelegate = l0.this.K().getLookaheadDelegate();
            if (!(lookaheadDelegate != null)) {
                y3.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            l0.this.T(constraints);
            a1(w4.s.a(lookaheadDelegate.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), lookaheadDelegate.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()));
            return (w4.r.g(measuredSize) == lookaheadDelegate.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() && w4.r.f(measuredSize) == lookaheadDelegate.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()) ? false : true;
        }

        public final void W1() {
            a aVar;
            g0 g0VarN0;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    y3.a.b("replace() called on item that was not placed");
                }
                this.onNodePlacedCalled = false;
                boolean isPlaced = getIsPlaced();
                aVar = this;
                try {
                    aVar.U1(this.lastPosition, BitmapDescriptorFactory.HUE_RED, this.lastLayerBlock, this.lastExplicitLayer);
                    if (isPlaced && !aVar.onNodePlacedCalled && (g0VarN0 = l0.this.layoutNode.n0()) != null) {
                        g0.q1(g0VarN0, false, 1, null);
                    }
                    aVar.relayoutWithoutParentInProgress = false;
                } catch (Throwable th2) {
                    th = th2;
                    aVar.relayoutWithoutParentInProgress = false;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                aVar = this;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // z3.w0
        public void X0(long position, float zIndex, n3.c layer) {
            U1(position, zIndex, null, layer);
        }

        public final void X1(boolean z11) {
            this.childDelegatesDirty = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // z3.w0
        public void Y0(long position, float zIndex, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> layerBlock) {
            U1(position, zIndex, layerBlock, null);
        }

        public final void Y1(g0.g gVar) {
            this.measuredByParent = gVar;
        }

        public final void Z1(int i11) {
            this.placeOrder = i11;
        }

        @Override // b4.b
        public b4.b a0() {
            l0 layoutDelegate;
            g0 g0VarN0 = l0.this.layoutNode.n0();
            if (g0VarN0 == null || (layoutDelegate = g0VarN0.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.C();
        }

        public void a2(boolean z11) {
            this.isPlaced = z11;
        }

        @Override // z3.l0, z3.q
        /* JADX INFO: renamed from: c, reason: from getter */
        public Object getParentData() {
            return this.parentData;
        }

        public final boolean c2() {
            if (getParentData() == null) {
                q0 lookaheadDelegate = l0.this.K().getLookaheadDelegate();
                p013kotlin.jvm.internal.s.h(lookaheadDelegate);
                if (lookaheadDelegate.getParentData() == null) {
                    return false;
                }
            }
            if (!this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            q0 lookaheadDelegate2 = l0.this.K().getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate2);
            this.parentData = lookaheadDelegate2.getParentData();
            return true;
        }

        @Override // z3.l0
        public int g0(z3.a alignmentLine) {
            g0 g0VarN0 = l0.this.layoutNode.n0();
            if ((g0VarN0 != null ? g0VarN0.V() : null) == g0.e.LookaheadMeasuring) {
                getAlignmentLines().u(true);
            } else {
                g0 g0VarN1 = l0.this.layoutNode.n0();
                if ((g0VarN1 != null ? g0VarN1.V() : null) == g0.e.LookaheadLayingOut) {
                    getAlignmentLines().t(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            q0 lookaheadDelegate = l0.this.K().getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            int iG0 = lookaheadDelegate.g0(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return iG0;
        }

        @Override // b4.b
        public void i0() {
            this.layingOutChildren = true;
            getAlignmentLines().o();
            if (l0.this.getLookaheadLayoutPending()) {
                L1();
            }
            q0 lookaheadDelegate = n0().getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            if (l0.this.lookaheadLayoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !lookaheadDelegate.getIsPlacingForAlignment() && l0.this.getLookaheadLayoutPending())) {
                l0.this.lookaheadLayoutPending = false;
                g0.e layoutState = l0.this.getLayoutState();
                l0.this.layoutState = g0.e.LookaheadLayingOut;
                j1 j1VarB = k0.b(l0.this.layoutNode);
                l0.this.b0(false);
                l1.f(j1VarB.getSnapshotObserver(), l0.this.layoutNode, false, new b(lookaheadDelegate, l0.this), 2, null);
                l0.this.layoutState = layoutState;
                if (l0.this.getLookaheadCoordinatesAccessedDuringPlacement() && lookaheadDelegate.getIsPlacingForAlignment()) {
                    requestLayout();
                }
                l0.this.lookaheadLayoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout()) {
                getAlignmentLines().q(true);
            }
            if (getAlignmentLines().getDirty() && getAlignmentLines().k()) {
                getAlignmentLines().n();
            }
            this.layingOutChildren = false;
        }

        @Override // z3.q
        public int m0(int width) {
            P1();
            q0 lookaheadDelegate = l0.this.K().getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            return lookaheadDelegate.m0(width);
        }

        @Override // b4.b
        public z0 n0() {
            return l0.this.layoutNode.O();
        }

        public final List<a> o1() {
            l0.this.layoutNode.G();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.g();
            }
            g0 g0Var = l0.this.layoutNode;
            t2.b<a> bVar = this._childDelegates;
            t2.b<g0> bVarW0 = g0Var.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                g0[] g0VarArrM = bVarW0.m();
                int i11 = 0;
                do {
                    g0 g0Var2 = g0VarArrM[i11];
                    if (bVar.getSize() <= i11) {
                        a lookaheadPassDelegate = g0Var2.getLayoutDelegate().getLookaheadPassDelegate();
                        p013kotlin.jvm.internal.s.h(lookaheadPassDelegate);
                        bVar.b(lookaheadPassDelegate);
                    } else {
                        a lookaheadPassDelegate2 = g0Var2.getLayoutDelegate().getLookaheadPassDelegate();
                        p013kotlin.jvm.internal.s.h(lookaheadPassDelegate2);
                        bVar.y(i11, lookaheadPassDelegate2);
                    }
                    i11++;
                } while (i11 < size);
            }
            bVar.w(g0Var.G().size(), bVar.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.g();
        }

        @Override // b4.b
        /* JADX INFO: renamed from: q, reason: from getter */
        public b4.a getAlignmentLines() {
            return this.alignmentLines;
        }

        /* JADX INFO: renamed from: q1, reason: from getter */
        public final w4.b getLookaheadConstraints() {
            return this.lookaheadConstraints;
        }

        @Override // b4.b
        public void requestLayout() {
            g0.q1(l0.this.layoutNode, false, 1, null);
        }

        @Override // z3.q
        public int s0(int height) {
            P1();
            q0 lookaheadDelegate = l0.this.K().getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            return lookaheadDelegate.s0(height);
        }

        @Override // z3.q
        public int t0(int height) {
            P1();
            q0 lookaheadDelegate = l0.this.K().getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            return lookaheadDelegate.t0(height);
        }

        /* JADX INFO: renamed from: t1, reason: from getter */
        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }

        public final b u1() {
            return l0.this.getMeasurePassDelegate();
        }

        /* JADX INFO: renamed from: v1, reason: from getter */
        public final g0.g getMeasuredByParent() {
            return this.measuredByParent;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002b  */
        @Override // z3.h0
        public z3.w0 x0(long constraints) {
            g0 g0VarN0 = l0.this.layoutNode.n0();
            if ((g0VarN0 != null ? g0VarN0.V() : null) == g0.e.LookaheadMeasuring) {
                l0.this.detachedFromParentLookaheadPass = false;
            } else {
                g0 g0VarN1 = l0.this.layoutNode.n0();
                if ((g0VarN1 != null ? g0VarN1.V() : null) == g0.e.LookaheadLayingOut) {
                    l0.this.detachedFromParentLookaheadPass = false;
                }
            }
            b2(l0.this.layoutNode);
            if (l0.this.layoutNode.getIntrinsicsUsageByParent() == g0.g.NotUsed) {
                l0.this.layoutNode.t();
            }
            V1(constraints);
            return this;
        }

        /* JADX INFO: renamed from: x1, reason: from getter */
        public final boolean getPlacedOnce() {
            return this.placedOnce;
        }

        @Override // b4.b
        /* JADX INFO: renamed from: y, reason: from getter */
        public boolean getIsPlaced() {
            return this.isPlaced;
        }

        @Override // b4.t0
        public void y0(boolean z11) {
            q0 lookaheadDelegate;
            q0 lookaheadDelegate2 = l0.this.K().getLookaheadDelegate();
            if (!p013kotlin.jvm.internal.s.f(Boolean.valueOf(z11), lookaheadDelegate2 != null ? Boolean.valueOf(lookaheadDelegate2.getIsPlacedUnderMotionFrameOfReference()) : null) && (lookaheadDelegate = l0.this.K().getLookaheadDelegate()) != null) {
                lookaheadDelegate.y0(z11);
            }
            this.isPlacedUnderMotionFrameOfReference = z11;
        }

        public final void y1(boolean forceRequest) {
            g0 g0Var;
            g0 g0VarN0 = l0.this.layoutNode.n0();
            g0.g intrinsicsUsageByParent = l0.this.layoutNode.getIntrinsicsUsageByParent();
            if (g0VarN0 == null || intrinsicsUsageByParent == g0.g.NotUsed) {
                return;
            }
            do {
                g0Var = g0VarN0;
                if (g0Var.getIntrinsicsUsageByParent() != intrinsicsUsageByParent) {
                    break;
                } else {
                    g0VarN0 = g0Var.n0();
                }
            } while (g0VarN0 != null);
            int i11 = C0309a.f16163b[intrinsicsUsageByParent.ordinal()];
            if (i11 == 1) {
                if (g0Var.getLookaheadRoot() != null) {
                    g0.s1(g0Var, forceRequest, false, false, 6, null);
                    return;
                } else {
                    g0.w1(g0Var, forceRequest, false, false, 6, null);
                    return;
                }
            }
            if (i11 != 2) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (g0Var.getLookaheadRoot() != null) {
                g0Var.p1(forceRequest);
            } else {
                g0Var.t1(forceRequest);
            }
        }
    }

    @Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\tJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJB\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\tJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\tJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001f\u0010\tJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\tJ\u000f\u0010!\u001a\u00020\u0007H\u0000¢\u0006\u0004\b!\u0010\tJ\u001a\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0018\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0096\u0002¢\u0006\u0004\b,\u0010-J8\u0010.\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015H\u0014ø\u0001\u0000¢\u0006\u0004\b.\u0010/J*\u00100\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0014ø\u0001\u0000¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0007¢\u0006\u0004\b2\u0010\tJ\u0017\u00104\u001a\u00020+2\u0006\u00103\u001a\u00020+H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020+2\u0006\u00103\u001a\u00020+H\u0016¢\u0006\u0004\b6\u00105J\u0017\u00108\u001a\u00020+2\u0006\u00107\u001a\u00020+H\u0016¢\u0006\u0004\b8\u00105J\u0017\u00109\u001a\u00020+2\u0006\u00107\u001a\u00020+H\u0016¢\u0006\u0004\b9\u00105J\r\u0010:\u001a\u00020\u0007¢\u0006\u0004\b:\u0010\tJ\r\u0010;\u001a\u00020&¢\u0006\u0004\b;\u0010<J\u001b\u0010>\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020+0=H\u0016¢\u0006\u0004\b>\u0010?J#\u0010A\u001a\u00020\u00072\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0015H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0007H\u0016¢\u0006\u0004\bC\u0010\tJ\u000f\u0010D\u001a\u00020\u0007H\u0016¢\u0006\u0004\bD\u0010\tJ\r\u0010E\u001a\u00020\u0007¢\u0006\u0004\bE\u0010\tJ\u0015\u0010G\u001a\u00020\u00072\u0006\u0010F\u001a\u00020&¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\u0007¢\u0006\u0004\bI\u0010\tR\u0016\u0010L\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR$\u0010Q\u001a\u00020+2\u0006\u0010M\u001a\u00020+8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bN\u0010A\u001a\u0004\bO\u0010PR$\u0010T\u001a\u00020+2\u0006\u0010M\u001a\u00020+8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bR\u0010A\u001a\u0004\bS\u0010PR\u0016\u0010V\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010KR\u0016\u0010X\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010KR\"\u0010`\u001a\u00020Y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010d\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010K\u001a\u0004\bb\u0010<\"\u0004\bc\u0010HR\u001c\u0010g\u001a\u00020\u00118\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\be\u0010fR$\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010m\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010p\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010r\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010KR(\u0010x\u001a\u0004\u0018\u00010s2\b\u0010M\u001a\u0004\u0018\u00010s8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR*\u0010|\u001a\u00020&2\u0006\u0010M\u001a\u00020&8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\by\u0010K\u001a\u0004\bz\u0010<\"\u0004\b{\u0010HR+\u0010\u0080\u0001\u001a\u00020&2\u0006\u0010M\u001a\u00020&8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010K\u001a\u0004\b~\u0010<\"\u0004\b\u007f\u0010HR\u001f\u0010\u0085\u0001\u001a\u00030\u0081\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0005\bq\u0010\u0084\u0001R#\u0010\u008a\u0001\u001a\u000e\u0012\t\u0012\u00070\u0000R\u00030\u0087\u00010\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R&\u0010\u008e\u0001\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010K\u001a\u0005\b\u008c\u0001\u0010<\"\u0005\b\u008d\u0001\u0010HR'\u0010\u0091\u0001\u001a\u00020&2\u0006\u0010M\u001a\u00020&8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010K\u001a\u0005\b\u0090\u0001\u0010<R\u001d\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u0092\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bz\u0010\u0093\u0001R'\u0010\u0014\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\u00138\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b\u0095\u0001\u0010o\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u0099\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010KR%\u0010\u009a\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010iR\u001a\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010lR\u001e\u0010\u009e\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010fR\u0018\u0010 \u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009f\u0001\u0010oR\u001d\u0010¡\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u0092\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bo\u0010\u0093\u0001R\u0018\u0010£\u0001\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010KR/\u0010¦\u0001\u001a\u00020&2\u0007\u0010¤\u0001\u001a\u00020&8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b¥\u0001\u0010K\u001a\u0005\b¦\u0001\u0010<\"\u0005\b§\u0001\u0010HR\u001c\u0010ª\u0001\u001a\u0004\u0018\u00010\"8Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010®\u0001\u001a\u00030«\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R#\u0010²\u0001\u001a\u000e\u0012\t\u0012\u00070\u0000R\u00030\u0087\u00010¯\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001R\u0019\u0010µ\u0001\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¶\u0001"}, d2 = {"Lb4/l0$b;", "Lz3/h0;", "Lz3/w0;", "Lb4/b;", "Lb4/t0;", "<init>", "(Lb4/l0;)V", "Ljn0/h0;", "t1", "()V", "U1", "T1", "u1", "Lb4/g0;", "node", "h2", "(Lb4/g0;)V", "Lw4/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "Ln3/c;", "layer", "b2", "(JFLwn0/l;Ln3/c;)V", "a2", "X1", "W1", "R1", "i0", "Z1", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "x0", "(J)Lz3/w0;", "", "c2", "(J)Z", "Lz3/a;", "alignmentLine", "", "g0", "(Lz3/a;)I", "Y0", "(JFLwn0/l;)V", "X0", "(JFLn3/c;)V", "d2", Snapshot.HEIGHT, "s0", "(I)I", "t0", Snapshot.WIDTH, "m0", "V", "L1", "i2", "()Z", "", "B", "()Ljava/util/Map;", "block", "I", "(Lwn0/l;)V", "requestLayout", Gender.UNKNOWN, "V1", "forceRequest", "J1", "(Z)V", "Y1", "f", "Z", "relayoutWithoutParentInProgress", "<set-?>", "g", "getPreviousPlaceOrder$ui_release", "()I", "previousPlaceOrder", "h", "F1", "placeOrder", IntegerTokenConverter.CONVERTER_KEY, "measuredOnce", "j", "placedOnce", "Lb4/g0$g;", "k", "Lb4/g0$g;", "B1", "()Lb4/g0$g;", "f2", "(Lb4/g0$g;)V", "measuredByParent", "l", "getDuringAlignmentLinesQuery$ui_release", "setDuringAlignmentLinesQuery$ui_release", "duringAlignmentLinesQuery", "m", "J", "lastPosition", "n", "Lwn0/l;", "lastLayerBlock", "o", "Ln3/c;", "lastExplicitLayer", "p", Gender.FEMALE, "lastZIndex", "q", "parentDataDirty", "", "r", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "parentData", "s", "y", "g2", "isPlaced", "t", "P1", "setPlacedByParent$ui_release", "isPlacedByParent", "Lb4/a;", "u", "Lb4/a;", "()Lb4/a;", "alignmentLines", "Lt2/b;", "Lb4/l0;", "v", "Lt2/b;", "_childDelegates", "w", "getChildDelegatesDirty$ui_release", "e2", "childDelegatesDirty", "x", "y1", "layingOutChildren", "Lkotlin/Function0;", "Lwn0/a;", "layoutChildrenBlock", "z", "G1", "()F", "A", "onNodePlacedCalled", "placeOuterCoordinatorLayerBlock", "C", "placeOuterCoordinatorLayer", "D", "placeOuterCoordinatorPosition", "E", "placeOuterCoordinatorZIndex", "placeOuterCoordinatorBlock", "G", "needsCoordinatesUpdate", "new", "H", "isPlacedUnderMotionFrameOfReference", "y0", "x1", "()Lw4/b;", "lastConstraints", "Lb4/z0;", "n0", "()Lb4/z0;", "innerCoordinator", "", "v1", "()Ljava/util/List;", "childDelegates", "a0", "()Lb4/b;", "parentAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b extends z3.w0 implements z3.h0, b4.b, t0 {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        private boolean onNodePlacedCalled;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        private wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> placeOuterCoordinatorLayerBlock;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        private n3.c placeOuterCoordinatorLayer;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        private long placeOuterCoordinatorPosition;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        private float placeOuterCoordinatorZIndex;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        private final wn0.a<jn0.h0> placeOuterCoordinatorBlock;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        private boolean needsCoordinatesUpdate;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        private boolean isPlacedUnderMotionFrameOfReference;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean relayoutWithoutParentInProgress;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean measuredOnce;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean placedOnce;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private boolean duringAlignmentLinesQuery;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private long lastPosition;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> lastLayerBlock;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private n3.c lastExplicitLayer;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private float lastZIndex;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private boolean parentDataDirty;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private Object parentData;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private boolean isPlaced;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private boolean isPlacedByParent;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final b4.a alignmentLines;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private final t2.b<b> _childDelegates;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
        private boolean childDelegatesDirty;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
        private boolean layingOutChildren;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<jn0.h0> layoutChildrenBlock;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
        private float zIndex;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int previousPlaceOrder = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private int placeOrder = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private g0.g measuredByParent = g0.g.NotUsed;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f16194a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f16195b;

            static {
                int[] iArr = new int[g0.e.values().length];
                try {
                    iArr[g0.e.Measuring.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[g0.e.LayingOut.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f16194a = iArr;
                int[] iArr2 = new int[g0.g.values().length];
                try {
                    iArr2[g0.g.InMeasureBlock.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[g0.g.InLayoutBlock.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f16195b = iArr2;
            }
        }

        /* JADX INFO: renamed from: b4.l0$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class C0312b extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

            /* JADX INFO: renamed from: b4.l0$b$b$a */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/b;", "it", "Ljn0/h0;", "a", "(Lb4/b;)V"}, k = 3, mv = {1, 8, 0})
            static final class a extends p013kotlin.jvm.internal.u implements wn0.l<b4.b, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final a f16197c = new a();

                a() {
                    super(1);
                }

                public final void a(b4.b bVar) {
                    bVar.getAlignmentLines().t(false);
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(b4.b bVar) {
                    a(bVar);
                    return jn0.h0.f84049a;
                }
            }

            /* JADX INFO: renamed from: b4.l0$b$b$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/b;", "it", "Ljn0/h0;", "a", "(Lb4/b;)V"}, k = 3, mv = {1, 8, 0})
            static final class C0313b extends p013kotlin.jvm.internal.u implements wn0.l<b4.b, jn0.h0> {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final C0313b f16198c = new C0313b();

                C0313b() {
                    super(1);
                }

                public final void a(b4.b bVar) {
                    bVar.getAlignmentLines().q(bVar.getAlignmentLines().getUsedDuringParentLayout());
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ jn0.h0 invoke(b4.b bVar) {
                    a(bVar);
                    return jn0.h0.f84049a;
                }
            }

            C0312b() {
                super(0);
            }

            public final void b() {
                b.this.u1();
                b.this.I(a.f16197c);
                b.this.n0().x1().k();
                b.this.t1();
                b.this.I(C0313b.f16198c);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                b();
                return jn0.h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class c extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l0 f16199c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f16200d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(l0 l0Var, b bVar) {
                super(0);
                this.f16199c = l0Var;
                this.f16200d = bVar;
            }

            public final void b() {
                z3.w0.a placementScope;
                z0 wrappedBy = this.f16199c.K().getWrappedBy();
                if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                    placementScope = k0.b(this.f16199c.layoutNode).getPlacementScope();
                }
                z3.w0.a aVar = placementScope;
                b bVar = this.f16200d;
                l0 l0Var = this.f16199c;
                wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> lVar = bVar.placeOuterCoordinatorLayerBlock;
                n3.c cVar = bVar.placeOuterCoordinatorLayer;
                if (cVar != null) {
                    aVar.x(l0Var.K(), bVar.placeOuterCoordinatorPosition, cVar, bVar.placeOuterCoordinatorZIndex);
                } else if (lVar == null) {
                    aVar.i(l0Var.K(), bVar.placeOuterCoordinatorPosition, bVar.placeOuterCoordinatorZIndex);
                } else {
                    aVar.w(l0Var.K(), bVar.placeOuterCoordinatorPosition, bVar.placeOuterCoordinatorZIndex, lVar);
                }
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                b();
                return jn0.h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/b;", "it", "Ljn0/h0;", "a", "(Lb4/b;)V"}, k = 3, mv = {1, 8, 0})
        static final class d extends p013kotlin.jvm.internal.u implements wn0.l<b4.b, jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final d f16201c = new d();

            d() {
                super(1);
            }

            public final void a(b4.b bVar) {
                bVar.getAlignmentLines().u(false);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ jn0.h0 invoke(b4.b bVar) {
                a(bVar);
                return jn0.h0.f84049a;
            }
        }

        public b() {
            w4.n.Companion companion = w4.n.INSTANCE;
            this.lastPosition = companion.a();
            this.parentDataDirty = true;
            this.alignmentLines = new h0(this);
            this._childDelegates = new t2.b<>(new b[16], 0);
            this.childDelegatesDirty = true;
            this.layoutChildrenBlock = new C0312b();
            this.placeOuterCoordinatorPosition = companion.a();
            this.placeOuterCoordinatorBlock = new c(l0.this, this);
        }

        private final void T1() {
            boolean isPlaced = getIsPlaced();
            g2(true);
            g0 g0Var = l0.this.layoutNode;
            if (!isPlaced) {
                if (g0Var.c0()) {
                    g0.w1(g0Var, true, false, false, 6, null);
                } else if (g0Var.X()) {
                    g0.s1(g0Var, true, false, false, 6, null);
                }
            }
            z0 wrapped = g0Var.O().getWrapped();
            for (z0 z0VarL0 = g0Var.l0(); !p013kotlin.jvm.internal.s.f(z0VarL0, wrapped) && z0VarL0 != null; z0VarL0 = z0VarL0.getWrapped()) {
                if (z0VarL0.getLastLayerDrawingWasSkipped()) {
                    z0VarL0.S2();
                }
            }
            t2.b<g0> bVarW0 = g0Var.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                g0[] g0VarArrM = bVarW0.m();
                int i11 = 0;
                do {
                    g0 g0Var2 = g0VarArrM[i11];
                    if (g0Var2.o0() != Integer.MAX_VALUE) {
                        g0Var2.b0().T1();
                        g0Var.x1(g0Var2);
                    }
                    i11++;
                } while (i11 < size);
            }
        }

        private final void U1() {
            if (getIsPlaced()) {
                int i11 = 0;
                g2(false);
                g0 g0Var = l0.this.layoutNode;
                z0 wrapped = g0Var.O().getWrapped();
                for (z0 z0VarL0 = g0Var.l0(); !p013kotlin.jvm.internal.s.f(z0VarL0, wrapped) && z0VarL0 != null; z0VarL0 = z0VarL0.getWrapped()) {
                    z0VarL0.i3();
                }
                t2.b<g0> bVarW0 = l0.this.layoutNode.w0();
                int size = bVarW0.getSize();
                if (size > 0) {
                    g0[] g0VarArrM = bVarW0.m();
                    do {
                        g0VarArrM[i11].b0().U1();
                        i11++;
                    } while (i11 < size);
                }
            }
        }

        private final void W1() {
            g0 g0Var = l0.this.layoutNode;
            l0 l0Var = l0.this;
            t2.b<g0> bVarW0 = g0Var.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                g0[] g0VarArrM = bVarW0.m();
                int i11 = 0;
                do {
                    g0 g0Var2 = g0VarArrM[i11];
                    if (g0Var2.c0() && g0Var2.e0() == g0.g.InMeasureBlock && g0.l1(g0Var2, null, 1, null)) {
                        g0.w1(l0Var.layoutNode, false, false, false, 7, null);
                    }
                    i11++;
                } while (i11 < size);
            }
        }

        private final void X1() {
            g0.g intrinsicsUsageByParent;
            g0.w1(l0.this.layoutNode, false, false, false, 7, null);
            g0 g0VarN0 = l0.this.layoutNode.n0();
            if (g0VarN0 == null || l0.this.layoutNode.getIntrinsicsUsageByParent() != g0.g.NotUsed) {
                return;
            }
            g0 g0Var = l0.this.layoutNode;
            int i11 = a.f16194a[g0VarN0.V().ordinal()];
            if (i11 != 1) {
                intrinsicsUsageByParent = i11 != 2 ? g0VarN0.getIntrinsicsUsageByParent() : g0.g.InLayoutBlock;
            } else {
                intrinsicsUsageByParent = g0.g.InMeasureBlock;
            }
            g0Var.D1(intrinsicsUsageByParent);
        }

        private final void a2(long position, float zIndex, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> layerBlock, n3.c layer) {
            if (l0.this.layoutNode.getIsDeactivated()) {
                y3.a.a("place is called on a deactivated node");
            }
            l0.this.layoutState = g0.e.LayingOut;
            this.lastPosition = position;
            this.lastZIndex = zIndex;
            this.lastLayerBlock = layerBlock;
            this.lastExplicitLayer = layer;
            this.placedOnce = true;
            this.onNodePlacedCalled = false;
            j1 j1VarB = k0.b(l0.this.layoutNode);
            if (l0.this.getLayoutPending() || !getIsPlaced()) {
                getAlignmentLines().r(false);
                l0.this.Y(false);
                this.placeOuterCoordinatorLayerBlock = layerBlock;
                this.placeOuterCoordinatorPosition = position;
                this.placeOuterCoordinatorZIndex = zIndex;
                this.placeOuterCoordinatorLayer = layer;
                j1VarB.getSnapshotObserver().c(l0.this.layoutNode, false, this.placeOuterCoordinatorBlock);
            } else {
                l0.this.K().f3(position, zIndex, layerBlock, layer);
                Z1();
            }
            l0.this.layoutState = g0.e.Idle;
        }

        private final void b2(long position, float zIndex, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> layerBlock, n3.c layer) {
            z3.w0.a placementScope;
            this.isPlacedByParent = true;
            if (!w4.n.g(position, this.lastPosition) || this.needsCoordinatesUpdate) {
                if (l0.this.getCoordinatesAccessedDuringModifierPlacement() || l0.this.getCoordinatesAccessedDuringPlacement() || this.needsCoordinatesUpdate) {
                    l0.this.layoutPending = true;
                    this.needsCoordinatesUpdate = false;
                }
                V1();
            }
            if (m0.a(l0.this.layoutNode)) {
                z0 wrappedBy = l0.this.K().getWrappedBy();
                if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                    placementScope = k0.b(l0.this.layoutNode).getPlacementScope();
                }
                z3.w0.a aVar = placementScope;
                l0 l0Var = l0.this;
                a lookaheadPassDelegate = l0Var.getLookaheadPassDelegate();
                p013kotlin.jvm.internal.s.h(lookaheadPassDelegate);
                g0 g0VarN0 = l0Var.layoutNode.n0();
                if (g0VarN0 != null) {
                    g0VarN0.getLayoutDelegate().nextChildLookaheadPlaceOrder = 0;
                }
                lookaheadPassDelegate.Z1(Integer.MAX_VALUE);
                z3.w0.a.h(aVar, lookaheadPassDelegate, w4.n.h(position), w4.n.i(position), BitmapDescriptorFactory.HUE_RED, 4, null);
            }
            a lookaheadPassDelegate2 = l0.this.getLookaheadPassDelegate();
            if ((lookaheadPassDelegate2 == null || lookaheadPassDelegate2.getPlacedOnce()) ? false : true) {
                y3.a.b("Error: Placement happened before lookahead.");
            }
            a2(position, zIndex, layerBlock, layer);
        }

        private final void h2(g0 node) {
            g0.g gVar;
            g0 g0VarN0 = node.n0();
            if (g0VarN0 == null) {
                this.measuredByParent = g0.g.NotUsed;
                return;
            }
            if (!(this.measuredByParent == g0.g.NotUsed || node.getCanMultiMeasure())) {
                y3.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i11 = a.f16194a[g0VarN0.V().ordinal()];
            if (i11 == 1) {
                gVar = g0.g.InMeasureBlock;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + g0VarN0.V());
                }
                gVar = g0.g.InLayoutBlock;
            }
            this.measuredByParent = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void t1() {
            g0 g0Var = l0.this.layoutNode;
            t2.b<g0> bVarW0 = g0Var.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                g0[] g0VarArrM = bVarW0.m();
                int i11 = 0;
                do {
                    g0 g0Var2 = g0VarArrM[i11];
                    if (g0Var2.b0().previousPlaceOrder != g0Var2.o0()) {
                        g0Var.h1();
                        g0Var.D0();
                        if (g0Var2.o0() == Integer.MAX_VALUE) {
                            g0Var2.b0().U1();
                        }
                    }
                    i11++;
                } while (i11 < size);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void u1() {
            l0.this.nextChildPlaceOrder = 0;
            t2.b<g0> bVarW0 = l0.this.layoutNode.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                g0[] g0VarArrM = bVarW0.m();
                int i11 = 0;
                do {
                    b bVarB0 = g0VarArrM[i11].b0();
                    bVarB0.previousPlaceOrder = bVarB0.placeOrder;
                    bVarB0.placeOrder = Integer.MAX_VALUE;
                    bVarB0.isPlacedByParent = false;
                    if (bVarB0.measuredByParent == g0.g.InLayoutBlock) {
                        bVarB0.measuredByParent = g0.g.NotUsed;
                    }
                    i11++;
                } while (i11 < size);
            }
        }

        @Override // b4.b
        public Map<z3.a, Integer> B() {
            if (!this.duringAlignmentLinesQuery) {
                if (l0.this.getLayoutState() == g0.e.Measuring) {
                    getAlignmentLines().s(true);
                    if (getAlignmentLines().getDirty()) {
                        l0.this.O();
                    }
                } else {
                    getAlignmentLines().r(true);
                }
            }
            n0().W1(true);
            i0();
            n0().W1(false);
            return getAlignmentLines().h();
        }

        /* JADX INFO: renamed from: B1, reason: from getter */
        public final g0.g getMeasuredByParent() {
            return this.measuredByParent;
        }

        /* JADX INFO: renamed from: F1, reason: from getter */
        public final int getPlaceOrder() {
            return this.placeOrder;
        }

        /* JADX INFO: renamed from: G1, reason: from getter */
        public final float getZIndex() {
            return this.zIndex;
        }

        @Override // b4.b
        public void I(wn0.l<? super b4.b, jn0.h0> block) {
            t2.b<g0> bVarW0 = l0.this.layoutNode.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                g0[] g0VarArrM = bVarW0.m();
                int i11 = 0;
                do {
                    block.invoke(g0VarArrM[i11].getLayoutDelegate().r());
                    i11++;
                } while (i11 < size);
            }
        }

        public final void J1(boolean forceRequest) {
            g0 g0Var;
            g0 g0VarN0 = l0.this.layoutNode.n0();
            g0.g intrinsicsUsageByParent = l0.this.layoutNode.getIntrinsicsUsageByParent();
            if (g0VarN0 == null || intrinsicsUsageByParent == g0.g.NotUsed) {
                return;
            }
            do {
                g0Var = g0VarN0;
                if (g0Var.getIntrinsicsUsageByParent() != intrinsicsUsageByParent) {
                    break;
                } else {
                    g0VarN0 = g0Var.n0();
                }
            } while (g0VarN0 != null);
            int i11 = a.f16195b[intrinsicsUsageByParent.ordinal()];
            if (i11 == 1) {
                g0.w1(g0Var, forceRequest, false, false, 6, null);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                g0Var.t1(forceRequest);
            }
        }

        public final void L1() {
            this.parentDataDirty = true;
        }

        /* JADX INFO: renamed from: P1, reason: from getter */
        public final boolean getIsPlacedByParent() {
            return this.isPlacedByParent;
        }

        public final void R1() {
            l0.this.detachedFromParentLookaheadPass = true;
        }

        @Override // b4.b
        public void U() {
            g0.w1(l0.this.layoutNode, false, false, false, 7, null);
        }

        @Override // z3.q
        public int V(int width) {
            X1();
            return l0.this.K().V(width);
        }

        public final void V1() {
            t2.b<g0> bVarW0;
            int size;
            if (l0.this.getChildrenAccessingCoordinatesDuringPlacement() <= 0 || (size = (bVarW0 = l0.this.layoutNode.w0()).getSize()) <= 0) {
                return;
            }
            g0[] g0VarArrM = bVarW0.m();
            int i11 = 0;
            do {
                g0 g0Var = g0VarArrM[i11];
                l0 layoutDelegate = g0Var.getLayoutDelegate();
                if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLayoutPending()) {
                    g0.u1(g0Var, false, 1, null);
                }
                layoutDelegate.getMeasurePassDelegate().V1();
                i11++;
            } while (i11 < size);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // z3.w0
        public void X0(long position, float zIndex, n3.c layer) {
            b2(position, zIndex, null, layer);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // z3.w0
        public void Y0(long position, float zIndex, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> layerBlock) {
            b2(position, zIndex, layerBlock, null);
        }

        public final void Y1() {
            this.placeOrder = Integer.MAX_VALUE;
            this.previousPlaceOrder = Integer.MAX_VALUE;
            g2(false);
        }

        public final void Z1() {
            this.onNodePlacedCalled = true;
            g0 g0VarN0 = l0.this.layoutNode.n0();
            float zIndex = n0().getZIndex();
            g0 g0Var = l0.this.layoutNode;
            z0 z0VarL0 = g0Var.l0();
            z0 z0VarO = g0Var.O();
            while (z0VarL0 != z0VarO) {
                p013kotlin.jvm.internal.s.i(z0VarL0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                c0 c0Var = (c0) z0VarL0;
                zIndex += c0Var.getZIndex();
                z0VarL0 = c0Var.getWrapped();
            }
            if (zIndex != this.zIndex) {
                this.zIndex = zIndex;
                if (g0VarN0 != null) {
                    g0VarN0.h1();
                }
                if (g0VarN0 != null) {
                    g0VarN0.D0();
                }
            }
            if (!getIsPlaced()) {
                if (g0VarN0 != null) {
                    g0VarN0.D0();
                }
                T1();
                if (this.relayoutWithoutParentInProgress && g0VarN0 != null) {
                    g0.u1(g0VarN0, false, 1, null);
                }
            }
            if (g0VarN0 == null) {
                this.placeOrder = 0;
            } else if (!this.relayoutWithoutParentInProgress && g0VarN0.V() == g0.e.LayingOut) {
                if (!(this.placeOrder == Integer.MAX_VALUE)) {
                    y3.a.b("Place was called on a node which was placed already");
                }
                this.placeOrder = g0VarN0.getLayoutDelegate().nextChildPlaceOrder;
                g0VarN0.getLayoutDelegate().nextChildPlaceOrder++;
            }
            i0();
        }

        @Override // b4.b
        public b4.b a0() {
            l0 layoutDelegate;
            g0 g0VarN0 = l0.this.layoutNode.n0();
            if (g0VarN0 == null || (layoutDelegate = g0VarN0.getLayoutDelegate()) == null) {
                return null;
            }
            return layoutDelegate.r();
        }

        @Override // z3.l0, z3.q
        /* JADX INFO: renamed from: c, reason: from getter */
        public Object getParentData() {
            return this.parentData;
        }

        public final boolean c2(long constraints) {
            if (l0.this.layoutNode.getIsDeactivated()) {
                y3.a.a("measure is called on a deactivated node");
            }
            j1 j1VarB = k0.b(l0.this.layoutNode);
            g0 g0VarN0 = l0.this.layoutNode.n0();
            boolean z11 = true;
            l0.this.layoutNode.A1(l0.this.layoutNode.getCanMultiMeasure() || (g0VarN0 != null && g0VarN0.getCanMultiMeasure()));
            if (!l0.this.layoutNode.c0() && w4.b.f(getMeasurementConstraints(), constraints)) {
                j1.p(j1VarB, l0.this.layoutNode, false, 2, null);
                l0.this.layoutNode.z1();
                return false;
            }
            getAlignmentLines().s(false);
            I(d.f16201c);
            this.measuredOnce = true;
            long jE = l0.this.K().e();
            e1(constraints);
            l0.this.U(constraints);
            if (w4.r.e(l0.this.K().e(), jE) && l0.this.K().getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() == getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String() && l0.this.K().getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String() == getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()) {
                z11 = false;
            }
            a1(w4.s.a(l0.this.K().getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String(), l0.this.K().getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String()));
            return z11;
        }

        public final void d2() {
            b bVar;
            g0 g0VarN0;
            try {
                this.relayoutWithoutParentInProgress = true;
                if (!this.placedOnce) {
                    y3.a.b("replace called on unplaced item");
                }
                boolean isPlaced = getIsPlaced();
                bVar = this;
                try {
                    bVar.a2(this.lastPosition, this.lastZIndex, this.lastLayerBlock, this.lastExplicitLayer);
                    if (isPlaced && !bVar.onNodePlacedCalled && (g0VarN0 = l0.this.layoutNode.n0()) != null) {
                        g0.u1(g0VarN0, false, 1, null);
                    }
                    bVar.relayoutWithoutParentInProgress = false;
                } catch (Throwable th2) {
                    th = th2;
                    bVar.relayoutWithoutParentInProgress = false;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bVar = this;
            }
        }

        public final void e2(boolean z11) {
            this.childDelegatesDirty = z11;
        }

        public final void f2(g0.g gVar) {
            this.measuredByParent = gVar;
        }

        @Override // z3.l0
        public int g0(z3.a alignmentLine) {
            g0 g0VarN0 = l0.this.layoutNode.n0();
            if ((g0VarN0 != null ? g0VarN0.V() : null) == g0.e.Measuring) {
                getAlignmentLines().u(true);
            } else {
                g0 g0VarN1 = l0.this.layoutNode.n0();
                if ((g0VarN1 != null ? g0VarN1.V() : null) == g0.e.LayingOut) {
                    getAlignmentLines().t(true);
                }
            }
            this.duringAlignmentLinesQuery = true;
            int iG0 = l0.this.K().g0(alignmentLine);
            this.duringAlignmentLinesQuery = false;
            return iG0;
        }

        public void g2(boolean z11) {
            this.isPlaced = z11;
        }

        @Override // b4.b
        public void i0() {
            this.layingOutChildren = true;
            getAlignmentLines().o();
            if (l0.this.getLayoutPending()) {
                W1();
            }
            if (l0.this.layoutPendingForAlignment || (!this.duringAlignmentLinesQuery && !n0().getIsPlacingForAlignment() && l0.this.getLayoutPending())) {
                l0.this.layoutPending = false;
                g0.e layoutState = l0.this.getLayoutState();
                l0.this.layoutState = g0.e.LayingOut;
                l0.this.Z(false);
                g0 g0Var = l0.this.layoutNode;
                k0.b(g0Var).getSnapshotObserver().e(g0Var, false, this.layoutChildrenBlock);
                l0.this.layoutState = layoutState;
                if (n0().getIsPlacingForAlignment() && l0.this.getCoordinatesAccessedDuringPlacement()) {
                    requestLayout();
                }
                l0.this.layoutPendingForAlignment = false;
            }
            if (getAlignmentLines().getUsedDuringParentLayout()) {
                getAlignmentLines().q(true);
            }
            if (getAlignmentLines().getDirty() && getAlignmentLines().k()) {
                getAlignmentLines().n();
            }
            this.layingOutChildren = false;
        }

        public final boolean i2() {
            if ((getParentData() == null && l0.this.K().getParentData() == null) || !this.parentDataDirty) {
                return false;
            }
            this.parentDataDirty = false;
            this.parentData = l0.this.K().getParentData();
            return true;
        }

        @Override // z3.q
        public int m0(int width) {
            X1();
            return l0.this.K().m0(width);
        }

        @Override // b4.b
        public z0 n0() {
            return l0.this.layoutNode.O();
        }

        @Override // b4.b
        /* JADX INFO: renamed from: q, reason: from getter */
        public b4.a getAlignmentLines() {
            return this.alignmentLines;
        }

        @Override // b4.b
        public void requestLayout() {
            g0.u1(l0.this.layoutNode, false, 1, null);
        }

        @Override // z3.q
        public int s0(int height) {
            X1();
            return l0.this.K().s0(height);
        }

        @Override // z3.q
        public int t0(int height) {
            X1();
            return l0.this.K().t0(height);
        }

        public final List<b> v1() {
            l0.this.layoutNode.K1();
            if (!this.childDelegatesDirty) {
                return this._childDelegates.g();
            }
            g0 g0Var = l0.this.layoutNode;
            t2.b<b> bVar = this._childDelegates;
            t2.b<g0> bVarW0 = g0Var.w0();
            int size = bVarW0.getSize();
            if (size > 0) {
                g0[] g0VarArrM = bVarW0.m();
                int i11 = 0;
                do {
                    g0 g0Var2 = g0VarArrM[i11];
                    if (bVar.getSize() <= i11) {
                        bVar.b(g0Var2.getLayoutDelegate().getMeasurePassDelegate());
                    } else {
                        bVar.y(i11, g0Var2.getLayoutDelegate().getMeasurePassDelegate());
                    }
                    i11++;
                } while (i11 < size);
            }
            bVar.w(g0Var.G().size(), bVar.getSize());
            this.childDelegatesDirty = false;
            return this._childDelegates.g();
        }

        @Override // z3.h0
        public z3.w0 x0(long constraints) {
            g0.g intrinsicsUsageByParent = l0.this.layoutNode.getIntrinsicsUsageByParent();
            g0.g gVar = g0.g.NotUsed;
            if (intrinsicsUsageByParent == gVar) {
                l0.this.layoutNode.t();
            }
            if (m0.a(l0.this.layoutNode)) {
                a lookaheadPassDelegate = l0.this.getLookaheadPassDelegate();
                p013kotlin.jvm.internal.s.h(lookaheadPassDelegate);
                lookaheadPassDelegate.Y1(gVar);
                lookaheadPassDelegate.x0(constraints);
            }
            h2(l0.this.layoutNode);
            c2(constraints);
            return this;
        }

        public final w4.b x1() {
            if (this.measuredOnce) {
                return w4.b.a(getMeasurementConstraints());
            }
            return null;
        }

        @Override // b4.b
        /* JADX INFO: renamed from: y, reason: from getter */
        public boolean getIsPlaced() {
            return this.isPlaced;
        }

        @Override // b4.t0
        public void y0(boolean z11) {
            boolean isPlacedUnderMotionFrameOfReference = l0.this.K().getIsPlacedUnderMotionFrameOfReference();
            if (z11 != isPlacedUnderMotionFrameOfReference) {
                l0.this.K().y0(isPlacedUnderMotionFrameOfReference);
                this.needsCoordinatesUpdate = true;
            }
            this.isPlacedUnderMotionFrameOfReference = z11;
        }

        /* JADX INFO: renamed from: y1, reason: from getter */
        public final boolean getLayingOutChildren() {
            return this.layingOutChildren;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f16203d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11) {
            super(0);
            this.f16203d = j11;
        }

        public final void b() {
            q0 lookaheadDelegate = l0.this.K().getLookaheadDelegate();
            p013kotlin.jvm.internal.s.h(lookaheadDelegate);
            lookaheadDelegate.x0(this.f16203d);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {
        d() {
            super(0);
        }

        public final void b() {
            l0.this.K().x0(l0.this.performMeasureConstraints);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    public l0(g0 g0Var) {
        this.layoutNode = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(long constraints) {
        this.layoutState = g0.e.LookaheadMeasuring;
        this.lookaheadMeasurePending = false;
        l1.h(k0.b(this.layoutNode).getSnapshotObserver(), this.layoutNode, false, new c(constraints), 2, null);
        P();
        if (m0.a(this.layoutNode)) {
            O();
        } else {
            R();
        }
        this.layoutState = g0.e.Idle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(long constraints) {
        g0.e eVar = this.layoutState;
        g0.e eVar2 = g0.e.Idle;
        if (!(eVar == eVar2)) {
            y3.a.b("layout state is not idle before measure starts");
        }
        g0.e eVar3 = g0.e.Measuring;
        this.layoutState = eVar3;
        this.measurePending = false;
        this.performMeasureConstraints = constraints;
        k0.b(this.layoutNode).getSnapshotObserver().g(this.layoutNode, false, this.performMeasureBlock);
        if (this.layoutState == eVar3) {
            O();
            this.layoutState = eVar2;
        }
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final g0.e getLayoutState() {
        return this.layoutState;
    }

    public final b4.b C() {
        return this.lookaheadPassDelegate;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getLookaheadCoordinatesAccessedDuringModifierPlacement() {
        return this.lookaheadCoordinatesAccessedDuringModifierPlacement;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final boolean getLookaheadCoordinatesAccessedDuringPlacement() {
        return this.lookaheadCoordinatesAccessedDuringPlacement;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final boolean getLookaheadLayoutPending() {
        return this.lookaheadLayoutPending;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final boolean getLookaheadMeasurePending() {
        return this.lookaheadMeasurePending;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final a getLookaheadPassDelegate() {
        return this.lookaheadPassDelegate;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final b getMeasurePassDelegate() {
        return this.measurePassDelegate;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    public final z0 K() {
        return this.layoutNode.getNodes().getOuterCoordinator();
    }

    public final int L() {
        return this.measurePassDelegate.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
    }

    public final void M() {
        this.measurePassDelegate.L1();
        a aVar = this.lookaheadPassDelegate;
        if (aVar != null) {
            aVar.B1();
        }
    }

    public final void N() {
        this.measurePassDelegate.e2(true);
        a aVar = this.lookaheadPassDelegate;
        if (aVar != null) {
            aVar.X1(true);
        }
    }

    public final void O() {
        this.layoutPending = true;
        this.layoutPendingForAlignment = true;
    }

    public final void P() {
        this.lookaheadLayoutPending = true;
        this.lookaheadLayoutPendingForAlignment = true;
    }

    public final void Q() {
        this.lookaheadMeasurePending = true;
    }

    public final void R() {
        this.measurePending = true;
    }

    public final void S() {
        g0.e eVarV = this.layoutNode.V();
        if (eVarV == g0.e.LayingOut || eVarV == g0.e.LookaheadLayingOut) {
            if (this.measurePassDelegate.getLayingOutChildren()) {
                Z(true);
            } else {
                Y(true);
            }
        }
        if (eVarV == g0.e.LookaheadLayingOut) {
            a aVar = this.lookaheadPassDelegate;
            if (aVar == null || !aVar.getLayingOutChildren()) {
                a0(true);
            } else {
                b0(true);
            }
        }
    }

    public final void V() {
        b4.a alignmentLines;
        this.measurePassDelegate.getAlignmentLines().p();
        a aVar = this.lookaheadPassDelegate;
        if (aVar == null || (alignmentLines = aVar.getAlignmentLines()) == null) {
            return;
        }
        alignmentLines.p();
    }

    public final void W(int i11) {
        int i12 = this.childrenAccessingCoordinatesDuringPlacement;
        this.childrenAccessingCoordinatesDuringPlacement = i11;
        if ((i12 == 0) != (i11 == 0)) {
            g0 g0VarN0 = this.layoutNode.n0();
            l0 layoutDelegate = g0VarN0 != null ? g0VarN0.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i11 == 0) {
                    layoutDelegate.W(layoutDelegate.childrenAccessingCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.W(layoutDelegate.childrenAccessingCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void X(int i11) {
        int i12 = this.childrenAccessingLookaheadCoordinatesDuringPlacement;
        this.childrenAccessingLookaheadCoordinatesDuringPlacement = i11;
        if ((i12 == 0) != (i11 == 0)) {
            g0 g0VarN0 = this.layoutNode.n0();
            l0 layoutDelegate = g0VarN0 != null ? g0VarN0.getLayoutDelegate() : null;
            if (layoutDelegate != null) {
                if (i11 == 0) {
                    layoutDelegate.X(layoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
                } else {
                    layoutDelegate.X(layoutDelegate.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
                }
            }
        }
    }

    public final void Y(boolean z11) {
        if (this.coordinatesAccessedDuringModifierPlacement != z11) {
            this.coordinatesAccessedDuringModifierPlacement = z11;
            if (z11 && !this.coordinatesAccessedDuringPlacement) {
                W(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z11 || this.coordinatesAccessedDuringPlacement) {
                    return;
                }
                W(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void Z(boolean z11) {
        if (this.coordinatesAccessedDuringPlacement != z11) {
            this.coordinatesAccessedDuringPlacement = z11;
            if (z11 && !this.coordinatesAccessedDuringModifierPlacement) {
                W(this.childrenAccessingCoordinatesDuringPlacement + 1);
            } else {
                if (z11 || this.coordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                W(this.childrenAccessingCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void a0(boolean z11) {
        if (this.lookaheadCoordinatesAccessedDuringModifierPlacement != z11) {
            this.lookaheadCoordinatesAccessedDuringModifierPlacement = z11;
            if (z11 && !this.lookaheadCoordinatesAccessedDuringPlacement) {
                X(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z11 || this.lookaheadCoordinatesAccessedDuringPlacement) {
                    return;
                }
                X(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void b0(boolean z11) {
        if (this.lookaheadCoordinatesAccessedDuringPlacement != z11) {
            this.lookaheadCoordinatesAccessedDuringPlacement = z11;
            if (z11 && !this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                X(this.childrenAccessingLookaheadCoordinatesDuringPlacement + 1);
            } else {
                if (z11 || this.lookaheadCoordinatesAccessedDuringModifierPlacement) {
                    return;
                }
                X(this.childrenAccessingLookaheadCoordinatesDuringPlacement - 1);
            }
        }
    }

    public final void c0() {
        g0 g0VarN0;
        if (this.measurePassDelegate.i2() && (g0VarN0 = this.layoutNode.n0()) != null) {
            g0.w1(g0VarN0, false, false, false, 7, null);
        }
        a aVar = this.lookaheadPassDelegate;
        if (aVar == null || !aVar.c2()) {
            return;
        }
        if (m0.a(this.layoutNode)) {
            g0 g0VarN1 = this.layoutNode.n0();
            if (g0VarN1 != null) {
                g0.w1(g0VarN1, false, false, false, 7, null);
                return;
            }
            return;
        }
        g0 g0VarN2 = this.layoutNode.n0();
        if (g0VarN2 != null) {
            g0.s1(g0VarN2, false, false, false, 7, null);
        }
    }

    public final void q() {
        if (this.lookaheadPassDelegate == null) {
            this.lookaheadPassDelegate = new a();
        }
    }

    public final b4.b r() {
        return this.measurePassDelegate;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getChildrenAccessingCoordinatesDuringPlacement() {
        return this.childrenAccessingCoordinatesDuringPlacement;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getChildrenAccessingLookaheadCoordinatesDuringPlacement() {
        return this.childrenAccessingLookaheadCoordinatesDuringPlacement;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getCoordinatesAccessedDuringModifierPlacement() {
        return this.coordinatesAccessedDuringModifierPlacement;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getCoordinatesAccessedDuringPlacement() {
        return this.coordinatesAccessedDuringPlacement;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getDetachedFromParentLookaheadPass() {
        return this.detachedFromParentLookaheadPass;
    }

    public final int x() {
        return this.measurePassDelegate.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
    }

    public final w4.b y() {
        return this.measurePassDelegate.x1();
    }

    public final w4.b z() {
        a aVar = this.lookaheadPassDelegate;
        if (aVar != null) {
            return aVar.getLookaheadConstraints();
        }
        return null;
    }
}
