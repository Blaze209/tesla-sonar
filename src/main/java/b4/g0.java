package b4;

import android.view.View;
import androidx.compose.ui.platform.e3;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.util.Comparator;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import z3.ModifierInfo;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Æ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 £\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0007\u008e\u0001\u008b\u0001{\u009a\u0001B\u001b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\u0010J\u000f\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\u000eH\u0000¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010'\u001a\n\u0018\u00010%j\u0004\u0018\u0001`&H\u0017¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000eH\u0000¢\u0006\u0004\b-\u0010\u0010J\u001f\u0010/\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0000¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0000¢\u0006\u0004\b1\u0010\u0010J'\u00104\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0000¢\u0006\u0004\b6\u0010\u0010J\u0017\u00109\u001a\u00020\u000e2\u0006\u00108\u001a\u000207H\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000eH\u0000¢\u0006\u0004\b;\u0010\u0010J\u000f\u0010<\u001a\u00020\u0016H\u0016¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n¢\u0006\u0004\bB\u0010@J\u0015\u0010C\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\bC\u0010@J\u0015\u0010D\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n¢\u0006\u0004\bD\u0010@J\u0015\u0010E\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\bE\u0010@J\u0015\u0010F\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n¢\u0006\u0004\bF\u0010@J\u0015\u0010G\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n¢\u0006\u0004\bG\u0010@J\u0015\u0010H\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n¢\u0006\u0004\bH\u0010@J\u000f\u0010I\u001a\u00020\u000eH\u0000¢\u0006\u0004\bI\u0010\u0010J\u000f\u0010J\u001a\u00020\u000eH\u0000¢\u0006\u0004\bJ\u0010\u0010J\u001f\u0010L\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\n2\u0006\u0010K\u001a\u00020\nH\u0000¢\u0006\u0004\bL\u00100J\u000f\u0010M\u001a\u00020\u000eH\u0000¢\u0006\u0004\bM\u0010\u0010J\u000f\u0010N\u001a\u00020\u000eH\u0000¢\u0006\u0004\bN\u0010\u0010J!\u0010S\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020O2\b\u0010R\u001a\u0004\u0018\u00010QH\u0000¢\u0006\u0004\bS\u0010TJ6\u0010[\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020W2\b\b\u0002\u0010Y\u001a\u00020\b2\b\b\u0002\u0010Z\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J6\u0010^\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020U2\u0006\u0010]\u001a\u00020W2\b\b\u0002\u0010Y\u001a\u00020\b2\b\b\u0002\u0010Z\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b^\u0010\\J\u0017\u0010`\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u0000H\u0000¢\u0006\u0004\b`\u0010\u0014J-\u0010d\u001a\u00020\u000e2\b\b\u0002\u0010a\u001a\u00020\b2\b\b\u0002\u0010b\u001a\u00020\b2\b\b\u0002\u0010c\u001a\u00020\bH\u0000¢\u0006\u0004\bd\u0010eJ-\u0010f\u001a\u00020\u000e2\b\b\u0002\u0010a\u001a\u00020\b2\b\b\u0002\u0010b\u001a\u00020\b2\b\b\u0002\u0010c\u001a\u00020\bH\u0000¢\u0006\u0004\bf\u0010eJ\u000f\u0010g\u001a\u00020\u000eH\u0000¢\u0006\u0004\bg\u0010\u0010J\u000f\u0010h\u001a\u00020\u000eH\u0000¢\u0006\u0004\bh\u0010\u0010J\u0019\u0010i\u001a\u00020\u000e2\b\b\u0002\u0010a\u001a\u00020\bH\u0000¢\u0006\u0004\bi\u0010jJ\u0019\u0010k\u001a\u00020\u000e2\b\b\u0002\u0010a\u001a\u00020\bH\u0000¢\u0006\u0004\bk\u0010jJ\u000f\u0010l\u001a\u00020\u000eH\u0000¢\u0006\u0004\bl\u0010\u0010J\u0015\u0010o\u001a\b\u0012\u0004\u0012\u00020n0mH\u0016¢\u0006\u0004\bo\u0010pJ\u000f\u0010q\u001a\u00020\u000eH\u0000¢\u0006\u0004\bq\u0010\u0010J\u001e\u0010t\u001a\u00020\b2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010rH\u0000ø\u0001\u0000¢\u0006\u0004\bt\u0010uJ\u001e\u0010v\u001a\u00020\b2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010rH\u0000ø\u0001\u0000¢\u0006\u0004\bv\u0010uJ\u000f\u0010w\u001a\u00020\u000eH\u0000¢\u0006\u0004\bw\u0010\u0010J\u000f\u0010x\u001a\u00020\u000eH\u0000¢\u0006\u0004\bx\u0010\u0010J\u000f\u0010y\u001a\u00020\u000eH\u0000¢\u0006\u0004\by\u0010\u0010J\u000f\u0010z\u001a\u00020\u000eH\u0000¢\u0006\u0004\bz\u0010\u0010J\u000f\u0010{\u001a\u00020\u000eH\u0016¢\u0006\u0004\b{\u0010\u0010J\u000f\u0010|\u001a\u00020\u000eH\u0016¢\u0006\u0004\b|\u0010\u0010J\u000f\u0010}\u001a\u00020\u000eH\u0000¢\u0006\u0004\b}\u0010\u0010J\u000f\u0010~\u001a\u00020\u000eH\u0000¢\u0006\u0004\b~\u0010\u0010J\u000f\u0010\u007f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u007f\u0010\u0010J\u0011\u0010\u0080\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0080\u0001\u0010\u0010J\u0011\u0010\u0081\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0081\u0001\u0010\u0010R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R(\u0010\u000b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R9\u0010\u008d\u0001\u001a\u00020\n2\u0007\u0010\u0088\u0001\u001a\u00020\n8W@WX\u0097\u000e¢\u0006\u001f\n\u0006\b\u0089\u0001\u0010\u0083\u0001\u0012\u0005\b\u008c\u0001\u0010\u0010\u001a\u0006\b\u008a\u0001\u0010\u0085\u0001\"\u0006\b\u008b\u0001\u0010\u0087\u0001R(\u0010\u0092\u0001\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u008e\u0001\u0010\u0082\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0005\b\u0091\u0001\u0010jR5\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00008\u0000@BX\u0080\u000e¢\u0006\u0017\n\u0006\b\u008b\u0001\u0010\u0094\u0001\u001a\u0006\b\u0082\u0001\u0010\u0095\u0001\"\u0005\b\u0096\u0001\u0010\u0014R\u0018\u0010\u0098\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b{\u0010\u0083\u0001R\u001e\u0010\u009c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\"\u0010 \u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0019\u0010¢\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u0082\u0001R\u001b\u0010¤\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u0094\u0001R,\u00108\u001a\u0004\u0018\u0001072\t\u0010\u0088\u0001\u001a\u0004\u0018\u0001078\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b\u007f\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R2\u0010¯\u0001\u001a\f\u0018\u00010¨\u0001j\u0005\u0018\u0001`©\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b|\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R(\u0010\u0015\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010\u0083\u0001\u001a\u0006\b±\u0001\u0010\u0085\u0001\"\u0006\b²\u0001\u0010\u0087\u0001R\u0019\u0010´\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010\u0082\u0001R\u001c\u0010¸\u0001\u001a\u0005\u0018\u00010µ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001e\u0010º\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010\u009f\u0001R\u0019\u0010¼\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010\u0082\u0001R3\u0010Ã\u0001\u001a\u00030½\u00012\b\u0010¾\u0001\u001a\u00030½\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b\u001f\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\b\u009a\u0001\u0010Â\u0001R\u001a\u0010Å\u0001\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b9\u0010Ä\u0001R3\u0010Ë\u0001\u001a\u00030Æ\u00012\b\u0010¾\u0001\u001a\u00030Æ\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b}\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\b\u008e\u0001\u0010Ê\u0001R3\u0010Ñ\u0001\u001a\u00030Ì\u00012\b\u0010¾\u0001\u001a\u00030Ì\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b#\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\b\u0089\u0001\u0010Ð\u0001R3\u0010×\u0001\u001a\u00030Ò\u00012\b\u0010¾\u0001\u001a\u00030Ò\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b\u0017\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\b£\u0001\u0010Ö\u0001R4\u0010Ý\u0001\u001a\u00030Ø\u00012\b\u0010¾\u0001\u001a\u00030Ø\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\b\u0083\u0001\u0010Û\u0001\"\u0006\b\u009e\u0001\u0010Ü\u0001R)\u0010ä\u0001\u001a\u00030Þ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b;\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001\"\u0006\bâ\u0001\u0010ã\u0001R\u0019\u0010å\u0001\u001a\u00030Þ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bK\u0010ß\u0001R.\u0010é\u0001\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0005\bl\u0010\u0082\u0001\u0012\u0005\bè\u0001\u0010\u0010\u001a\u0006\bæ\u0001\u0010\u0090\u0001\"\u0005\bç\u0001\u0010jR\u001f\u0010î\u0001\u001a\u00030ê\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bS\u0010ë\u0001\u001a\u0006\bì\u0001\u0010í\u0001R \u0010ô\u0001\u001a\u00030ï\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bð\u0001\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001R,\u0010ü\u0001\u001a\u0005\u0018\u00010õ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R\u001c\u0010ÿ\u0001\u001a\u0005\u0018\u00010ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010þ\u0001R(\u0010\u0083\u0002\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0080\u0002\u0010\u0082\u0001\u001a\u0006\b\u0081\u0002\u0010\u0090\u0001\"\u0005\b\u0082\u0002\u0010jR\u0019\u0010\u0086\u0002\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R\u001b\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0002\u0010\u0085\u0002R8\u0010\u0090\u0002\u001a\u0011\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0089\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008a\u0002\u0010\u008b\u0002\u001a\u0006\b\u008c\u0002\u0010\u008d\u0002\"\u0006\b\u008e\u0002\u0010\u008f\u0002R8\u0010\u0093\u0002\u001a\u0011\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0089\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u008b\u0002\u001a\u0006\b\u0091\u0002\u0010\u008d\u0002\"\u0006\b\u0092\u0002\u0010\u008f\u0002R(\u0010\u0096\u0002\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bÈ\u0001\u0010\u0082\u0001\u001a\u0006\b\u0094\u0002\u0010\u0090\u0001\"\u0005\b\u0095\u0002\u0010jR*\u0010\u0098\u0002\u001a\u00020\b2\u0007\u0010\u0088\u0001\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\b±\u0001\u0010\u0082\u0001\u001a\u0006\b\u0097\u0002\u0010\u0090\u0001R\u0018\u0010\u009c\u0002\u001a\u00030\u0099\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R\u001a\u0010\u009f\u0002\u001a\u0005\u0018\u00010ý\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0016\u0010¢\u0002\u001a\u0004\u0018\u00010\b8F¢\u0006\b\u001a\u0006\b \u0002\u0010¡\u0002R\u001c\u0010¤\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000m8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b£\u0002\u0010pR\u001d\u0010¦\u0002\u001a\t\u0012\u0005\u0012\u00030¥\u00020m8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0002\u0010pR\u001d\u0010§\u0002\u001a\t\u0012\u0005\u0012\u00030¥\u00020m8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0002\u0010pR\u001e\u0010ª\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u009d\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¨\u0002\u0010©\u0002R\u001c\u0010«\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000m8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0002\u0010pR\u0019\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\b¬\u0002\u0010\u0095\u0001R\u0017\u0010¯\u0002\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b®\u0002\u0010\u0090\u0001R\u0018\u0010³\u0002\u001a\u00030°\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b±\u0002\u0010²\u0002R\u001f\u0010·\u0002\u001a\n\u0018\u00010´\u0002R\u00030ï\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bµ\u0002\u0010¶\u0002R\u001d\u0010»\u0002\u001a\b0¸\u0002R\u00030ï\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¹\u0002\u0010º\u0002R\u001a\u0010½\u0002\u001a\u0005\u0018\u00010µ\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010¼\u0002R%\u0010À\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u009d\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b¿\u0002\u0010\u0010\u001a\u0006\b¾\u0002\u0010©\u0002R\u0017\u0010Â\u0002\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0002\u0010\u0090\u0001R\u0017\u0010Ä\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÃ\u0002\u0010\u0090\u0001R\u0016\u0010A\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÅ\u0002\u0010\u0085\u0001R\u0016\u0010>\u001a\u00020\n8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÆ\u0002\u0010\u0085\u0001R\u0017\u0010Ç\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bð\u0001\u0010\u0090\u0001R\u0018\u0010Ë\u0002\u001a\u00030È\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÉ\u0002\u0010Ê\u0002R\u0016\u0010Ì\u0002\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bK\u0010\u0090\u0001R\u0014\u0010Î\u0002\u001a\u00020\b8F¢\u0006\b\u001a\u0006\bÍ\u0002\u0010\u0090\u0001R\u0017\u0010Ð\u0002\u001a\u00020\n8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÏ\u0002\u0010\u0085\u0001R\u0018\u0010Ò\u0002\u001a\u00030Þ\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÑ\u0002\u0010á\u0001R\u0018\u0010Ô\u0002\u001a\u00030Þ\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÓ\u0002\u0010á\u0001R\u0018\u0010Ö\u0002\u001a\u00030ý\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÕ\u0002\u0010\u009e\u0002R\u0018\u0010Ø\u0002\u001a\u00030ý\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b×\u0002\u0010\u009e\u0002R\u0017\u0010Ù\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bö\u0001\u0010\u0090\u0001R(\u0010\u001e\u001a\u00020\u001d2\u0007\u0010¾\u0001\u001a\u00020\u001d8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bÚ\u0002\u0010Û\u0002\"\u0005\b¡\u0001\u0010 R\u0018\u0010ß\u0002\u001a\u00030Ü\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bÝ\u0002\u0010Þ\u0002R\u0017\u0010á\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bà\u0002\u0010\u0090\u0001R\u0017\u0010ã\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bâ\u0002\u0010\u0090\u0001R\u0017\u0010å\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bä\u0002\u0010\u0090\u0001R\u0017\u0010ç\u0002\u001a\u00020\b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bæ\u0002\u0010\u0090\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006è\u0002"}, d2 = {"Lb4/g0;", "Lr2/k;", "Lz3/y0;", "Lb4/k1;", "Lz3/z;", "Lb4/g;", "", "Lb4/j1$b;", "", "isVirtual", "", "semanticsId", "<init>", "(ZI)V", "Ljn0/h0;", "j1", "()V", "J0", "child", "f1", "(Lb4/g0;)V", "depth", "", "v", "(I)Ljava/lang/String;", "Lb4/y;", "k0", "()Lb4/y;", "g1", "Landroidx/compose/ui/d;", "modifier", "r", "(Landroidx/compose/ui/d;)V", "y1", "C0", "u", "K1", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "Q", "()Landroid/view/View;", "index", "instance", "B0", "(ILb4/g0;)V", "h1", "count", "n1", "(II)V", "m1", "from", "to", "e1", "(III)V", "I0", "Lb4/j1;", "owner", "s", "(Lb4/j1;)V", "x", "toString", "()Ljava/lang/String;", Snapshot.HEIGHT, "d1", "(I)I", Snapshot.WIDTH, "c1", "Z0", "Y0", "b1", "a1", "X0", "W0", "D0", "H0", "y", "i1", "o1", "R0", "Lk3/j1;", "canvas", "Ln3/c;", "graphicsLayer", "A", "(Lk3/j1;Ln3/c;)V", "Lj3/g;", "pointerPosition", "Lb4/u;", "hitTestResult", "isTouchEvent", "isInLayer", "x0", "(JLb4/u;ZZ)V", "hitSemanticsEntities", "z0", "it", "x1", "forceRequest", "scheduleMeasureAndLayout", "invalidateIntrinsics", "v1", "(ZZZ)V", "r1", "F0", "G0", "t1", "(Z)V", "p1", "z", "", "Lz3/n0;", "h0", "()Ljava/util/List;", "E0", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "P0", "(Lw4/b;)Z", "k1", "S0", "V0", "T0", "U0", "f", "l", "t", "z1", "k", "b", "a", "Z", "I", "p0", "()I", "I1", "(I)V", "<set-?>", "c", "getCompositeKeyHash", "e", "getCompositeKeyHash$annotations", "compositeKeyHash", DateTokenConverter.CONVERTER_KEY, "O0", "()Z", "setVirtualLookaheadRoot$ui_release", "isVirtualLookaheadRoot", "newRoot", "Lb4/g0;", "()Lb4/g0;", "E1", "lookaheadRoot", "virtualChildrenCount", "Lb4/u0;", "g", "Lb4/u0;", "_foldedChildren", "Lt2/b;", "h", "Lt2/b;", "_unfoldedChildren", IntegerTokenConverter.CONVERTER_KEY, "unfoldedVirtualChildrenListDirty", "j", "_foldedParent", "Lb4/j1;", "m0", "()Lb4/j1;", "Landroidx/compose/ui/viewinterop/d;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "Landroidx/compose/ui/viewinterop/d;", "R", "()Landroidx/compose/ui/viewinterop/d;", "C1", "(Landroidx/compose/ui/viewinterop/d;)V", "interopViewFactoryHolder", "m", "K", "setDepth$ui_release", "n", "ignoreRemeasureRequests", "Lg4/l;", "o", "Lg4/l;", "_collapsedSemantics", "p", "_zSortedChildren", "q", "zSortedChildrenInvalidated", "Lz3/i0;", "value", "Lz3/i0;", "d0", "()Lz3/i0;", "(Lz3/i0;)V", "measurePolicy", "Lb4/y;", "intrinsicsPolicy", "Lw4/d;", "Lw4/d;", "J", "()Lw4/d;", "(Lw4/d;)V", "density", "Lw4/t;", "Lw4/t;", "getLayoutDirection", "()Lw4/t;", "(Lw4/t;)V", "layoutDirection", "Landroidx/compose/ui/platform/e3;", "Landroidx/compose/ui/platform/e3;", "r0", "()Landroidx/compose/ui/platform/e3;", "(Landroidx/compose/ui/platform/e3;)V", "viewConfiguration", "Lr2/x;", "w", "Lr2/x;", "()Lr2/x;", "(Lr2/x;)V", "compositionLocalMap", "Lb4/g0$g;", "Lb4/g0$g;", "S", "()Lb4/g0$g;", "D1", "(Lb4/g0$g;)V", "intrinsicsUsageByParent", "previousIntrinsicsUsageByParent", "D", "A1", "getCanMultiMeasure$ui_release$annotations", "canMultiMeasure", "Lb4/x0;", "Lb4/x0;", "j0", "()Lb4/x0;", "nodes", "Lb4/l0;", "B", "Lb4/l0;", "T", "()Lb4/l0;", "layoutDelegate", "Lz3/d0;", "C", "Lz3/d0;", "q0", "()Lz3/d0;", "J1", "(Lz3/d0;)V", "subcompositionsState", "Lb4/z0;", "Lb4/z0;", "_innerLayerCoordinator", "E", "getInnerLayerCoordinatorIsDirty$ui_release", "B1", "innerLayerCoordinatorIsDirty", Gender.FEMALE, "Landroidx/compose/ui/d;", "_modifier", "G", "pendingModifier", "Lkotlin/Function1;", "H", "Lwn0/l;", "getOnAttach$ui_release", "()Lwn0/l;", "G1", "(Lwn0/l;)V", "onAttach", "getOnDetach$ui_release", "H1", "onDetach", "i0", "F1", "needsOnPositionedDispatch", "L0", "isDeactivated", "", "t0", "()F", "zIndex", "P", "()Lb4/z0;", "innerLayerCoordinator", "N0", "()Ljava/lang/Boolean;", "isPlacedInLookahead", "L", "foldedChildren", "Lz3/h0;", "childMeasurables", "childLookaheadMeasurables", "w0", "()Lt2/b;", "_children", "children", "n0", "parent", "K0", "isAttached", "Lb4/g0$e;", "V", "()Lb4/g0$e;", "layoutState", "Lb4/l0$a;", "Y", "()Lb4/l0$a;", "lookaheadPassDelegate", "Lb4/l0$b;", "b0", "()Lb4/l0$b;", "measurePassDelegate", "()Lg4/l;", "collapsedSemantics", "v0", "getZSortedChildren$annotations", "zSortedChildren", "u0", "isValidOwnerScope", Gender.MALE, "hasFixedInnerContentConstraints", "s0", Gender.NONE, "alignmentLinesRequired", "Lb4/i0;", "a0", "()Lb4/i0;", "mDrawScope", "isPlaced", "M0", "isPlacedByParent", "o0", "placeOrder", "e0", "measuredByParent", "f0", "measuredByParentInLookahead", Gender.OTHER, "innerCoordinator", "l0", "outerCoordinator", "applyingModifierOnAttach", "g0", "()Landroidx/compose/ui/d;", "Lz3/v;", "getCoordinates", "()Lz3/v;", "coordinates", "c0", "measurePending", Gender.UNKNOWN, "layoutPending", "X", "lookaheadMeasurePending", "W", "lookaheadLayoutPending", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g0 implements p020r2.k, z3.y0, k1, z3.z, b4.g, j1.b {

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int M = 8;
    private static final f N = new c();
    private static final wn0.a<g0> O = a.f16098c;
    private static final e3 P = new b();
    private static final Comparator<g0> Q = new Comparator() { // from class: b4.f0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return g0.n((g0) obj, (g0) obj2);
        }
    };

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final x0 nodes;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final l0 layoutDelegate;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private z3.d0 subcompositionsState;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private z0 _innerLayerCoordinator;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean innerLayerCoordinatorIsDirty;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private androidx.compose.ui.d _modifier;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private androidx.compose.ui.d pendingModifier;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private wn0.l<? super j1, jn0.h0> onAttach;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private wn0.l<? super j1, jn0.h0> onDetach;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private boolean needsOnPositionedDispatch;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean isDeactivated;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isVirtual;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int semanticsId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int compositeKeyHash;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isVirtualLookaheadRoot;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private g0 lookaheadRoot;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int virtualChildrenCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final u0<g0> _foldedChildren;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private t2.b<g0> _unfoldedChildren;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean unfoldedVirtualChildrenListDirty;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private g0 _foldedParent;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private j1 owner;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.viewinterop.d interopViewFactoryHolder;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int depth;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean ignoreRemeasureRequests;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private g4.l _collapsedSemantics;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final t2.b<g0> _zSortedChildren;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean zSortedChildrenInvalidated;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private z3.i0 measurePolicy;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private y intrinsicsPolicy;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private w4.d density;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private w4.t layoutDirection;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private e3 viewConfiguration;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private p020r2.x compositionLocalMap;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private g intrinsicsUsageByParent;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private g previousIntrinsicsUsageByParent;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean canMultiMeasure;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb4/g0;", "b", "()Lb4/g0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<g0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f16098c = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g0 invoke() {
            return new g0(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"b4/g0$b", "Landroidx/compose/ui/platform/e3;", "", "f", "()J", "longPressTimeoutMillis", "e", "doubleTapTimeoutMillis", "a", "doubleTapMinTimeMillis", "", "c", "()F", "touchSlop", "Lw4/k;", "g", "minimumTouchTargetSize", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements e3 {
        b() {
        }

        @Override // androidx.compose.ui.platform.e3
        public long a() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.e3
        public float c() {
            return 16.0f;
        }

        @Override // androidx.compose.ui.platform.e3
        public long e() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.e3
        public long f() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.e3
        public long g() {
            return w4.k.INSTANCE.b();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"b4/g0$c", "Lb4/g0$f;", "Lz3/k0;", "", "Lz3/h0;", "measurables", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "", "h", "(Lz3/k0;Ljava/util/List;J)Ljava/lang/Void;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // z3.i0
        public /* bridge */ /* synthetic */ z3.j0 c(z3.k0 k0Var, List list, long j11) {
            return (z3.j0) h(k0Var, list, j11);
        }

        public Void h(z3.k0 k0Var, List<? extends z3.h0> list, long j11) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    /* JADX INFO: renamed from: b4.g0$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lb4/g0$d;", "", "<init>", "()V", "Lkotlin/Function0;", "Lb4/g0;", "Constructor", "Lwn0/a;", "a", "()Lwn0/a;", "Ljava/util/Comparator;", "ZComparator", "Ljava/util/Comparator;", "b", "()Ljava/util/Comparator;", "Lb4/g0$f;", "ErrorMeasurePolicy", "Lb4/g0$f;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wn0.a<g0> a() {
            return g0.O;
        }

        public final Comparator<g0> b() {
            return g0.Q;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lb4/g0$e;", "", "<init>", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0011\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ)\u0010\u0012\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb4/g0$f;", "Lz3/i0;", "", AnalyticsAttribute.Error, "<init>", "(Ljava/lang/String;)V", "Lz3/r;", "", "Lz3/q;", "measurables", "", Snapshot.HEIGHT, "", "f", "(Lz3/r;Ljava/util/List;I)Ljava/lang/Void;", Snapshot.WIDTH, "e", "b", "a", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class f implements z3.i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String error;

        public f(String str) {
            this.error = str;
        }

        public Void a(z3.r rVar, List<? extends z3.q> list, int i11) {
            throw new IllegalStateException(this.error.toString());
        }

        public Void b(z3.r rVar, List<? extends z3.q> list, int i11) {
            throw new IllegalStateException(this.error.toString());
        }

        @Override // z3.i0
        public /* bridge */ /* synthetic */ int d(z3.r rVar, List list, int i11) {
            return ((Number) b(rVar, list, i11)).intValue();
        }

        public Void e(z3.r rVar, List<? extends z3.q> list, int i11) {
            throw new IllegalStateException(this.error.toString());
        }

        public Void f(z3.r rVar, List<? extends z3.q> list, int i11) {
            throw new IllegalStateException(this.error.toString());
        }

        @Override // z3.i0
        public /* bridge */ /* synthetic */ int g(z3.r rVar, List list, int i11) {
            return ((Number) f(rVar, list, i11)).intValue();
        }

        @Override // z3.i0
        public /* bridge */ /* synthetic */ int i(z3.r rVar, List list, int i11) {
            return ((Number) a(rVar, list, i11)).intValue();
        }

        @Override // z3.i0
        public /* bridge */ /* synthetic */ int j(z3.r rVar, List list, int i11) {
            return ((Number) e(rVar, list, i11)).intValue();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lb4/g0$g;", "", "<init>", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16100a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f16100a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {
        i() {
            super(0);
        }

        public final void b() {
            g0.this.getLayoutDelegate().N();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p013kotlin.jvm.internal.n0<g4.l> f16103d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(p013kotlin.jvm.internal.n0<g4.l> n0Var) {
            super(0);
            this.f16103d = n0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r6v7, types: [T, g4.l] */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException
            */
        public final void b() {
            /*
                r11 = this;
                b4.g0 r0 = b4.g0.this
                b4.x0 r0 = r0.getNodes()
                r1 = 8
                int r1 = b4.b1.a(r1)
                kotlin.jvm.internal.n0<g4.l> r2 = r11.f16103d
                int r3 = b4.x0.c(r0)
                r3 = r3 & r1
                if (r3 == 0) goto L9d
                androidx.compose.ui.d$c r0 = r0.getTail()
            L19:
                if (r0 == 0) goto L9d
                int r3 = r0.getKindSet()
                r3 = r3 & r1
                if (r3 == 0) goto L97
                r3 = 0
                r4 = r0
                r5 = r3
            L25:
                if (r4 == 0) goto L97
                boolean r6 = r4 instanceof b4.s1
                r7 = 1
                if (r6 == 0) goto L53
                b4.s1 r4 = (b4.s1) r4
                boolean r6 = r4.getIsClearingSemantics()
                if (r6 == 0) goto L3e
                g4.l r6 = new g4.l
                r6.<init>()
                r2.f86529a = r6
                r6.p(r7)
            L3e:
                boolean r6 = r4.getMergeDescendants()
                if (r6 == 0) goto L4b
                T r6 = r2.f86529a
                g4.l r6 = (g4.l) r6
                r6.q(r7)
            L4b:
                T r6 = r2.f86529a
                g4.l r6 = (g4.l) r6
                r4.G0(r6)
                goto L92
            L53:
                int r6 = r4.getKindSet()
                r6 = r6 & r1
                if (r6 == 0) goto L92
                boolean r6 = r4 instanceof b4.m
                if (r6 == 0) goto L92
                r6 = r4
                b4.m r6 = (b4.m) r6
                androidx.compose.ui.d$c r6 = r6.getDelegate()
                r8 = 0
                r9 = r8
            L67:
                if (r6 == 0) goto L8f
                int r10 = r6.getKindSet()
                r10 = r10 & r1
                if (r10 == 0) goto L8a
                int r9 = r9 + 1
                if (r9 != r7) goto L76
                r4 = r6
                goto L8a
            L76:
                if (r5 != 0) goto L81
                t2.b r5 = new t2.b
                r10 = 16
                androidx.compose.ui.d$c[] r10 = new androidx.compose.ui.d.c[r10]
                r5.<init>(r10, r8)
            L81:
                if (r4 == 0) goto L87
                r5.b(r4)
                r4 = r3
            L87:
                r5.b(r6)
            L8a:
                androidx.compose.ui.d$c r6 = r6.getChild()
                goto L67
            L8f:
                if (r9 != r7) goto L92
                goto L25
            L92:
                androidx.compose.ui.d$c r4 = b4.k.b(r5)
                goto L25
            L97:
                androidx.compose.ui.d$c r0 = r0.getParent()
                goto L19
            L9d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b4.g0.j.b():void");
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ void A0(g0 g0Var, long j11, u uVar, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        g0Var.z0(j11, uVar, z11, z12);
    }

    private final void C0() {
        if (this.nodes.q(b1.a(1024) | b1.a(2048) | b1.a(4096))) {
            for (androidx.compose.ui.d.c head = this.nodes.getHead(); head != null; head = head.getChild()) {
                if (((b1.a(1024) & head.getKindSet()) != 0) | ((b1.a(2048) & head.getKindSet()) != 0) | ((b1.a(4096) & head.getKindSet()) != 0)) {
                    c1.a(head);
                }
            }
        }
    }

    private final void E1(g0 g0Var) {
        if (p013kotlin.jvm.internal.s.f(g0Var, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = g0Var;
        if (g0Var != null) {
            this.layoutDelegate.q();
            z0 wrapped = O().getWrapped();
            for (z0 z0VarL0 = l0(); !p013kotlin.jvm.internal.s.f(z0VarL0, wrapped) && z0VarL0 != null; z0VarL0 = z0VarL0.getWrapped()) {
                z0VarL0.t2();
            }
        }
        F0();
    }

    private final void J0() {
        g0 g0Var;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (g0Var = this._foldedParent) == null) {
            return;
        }
        g0Var.J0();
    }

    private final z0 P() {
        if (this.innerLayerCoordinatorIsDirty) {
            z0 z0VarO = O();
            z0 wrappedBy = l0().getWrappedBy();
            this._innerLayerCoordinator = null;
            while (!p013kotlin.jvm.internal.s.f(z0VarO, wrappedBy)) {
                if ((z0VarO != null ? z0VarO.getLayer() : null) != null) {
                    this._innerLayerCoordinator = z0VarO;
                    break;
                }
                z0VarO = z0VarO != null ? z0VarO.getWrappedBy() : null;
            }
        }
        z0 z0Var = this._innerLayerCoordinator;
        if (z0Var == null || z0Var.getLayer() != null) {
            return z0Var;
        }
        y3.a.c("layer was not set");
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ boolean Q0(g0 g0Var, w4.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = g0Var.layoutDelegate.z();
        }
        return g0Var.P0(bVar);
    }

    private final void f1(g0 child) {
        if (child.layoutDelegate.s() > 0) {
            l0 l0Var = this.layoutDelegate;
            l0Var.W(l0Var.s() - 1);
        }
        if (this.owner != null) {
            child.x();
        }
        child._foldedParent = null;
        child.l0().o3(null);
        if (child.isVirtual) {
            this.virtualChildrenCount--;
            t2.b<g0> bVarF = child._foldedChildren.f();
            int iN = bVarF.getSize();
            if (iN > 0) {
                g0[] g0VarArrM = bVarF.m();
                int i11 = 0;
                do {
                    g0VarArrM[i11].l0().o3(null);
                    i11++;
                } while (i11 < iN);
            }
        }
        J0();
        h1();
    }

    private final void g1() {
        F0();
        g0 g0VarN0 = n0();
        if (g0VarN0 != null) {
            g0VarN0.D0();
        }
        E0();
    }

    private final void j1() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i11 = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            t2.b<g0> bVar = this._unfoldedChildren;
            if (bVar == null) {
                bVar = new t2.b<>(new g0[16], 0);
                this._unfoldedChildren = bVar;
            }
            bVar.h();
            t2.b<g0> bVarF = this._foldedChildren.f();
            int iN = bVarF.getSize();
            if (iN > 0) {
                g0[] g0VarArrM = bVarF.m();
                do {
                    g0 g0Var = g0VarArrM[i11];
                    if (g0Var.isVirtual) {
                        bVar.e(bVar.getSize(), g0Var.w0());
                    } else {
                        bVar.b(g0Var);
                    }
                    i11++;
                } while (i11 < iN);
            }
            this.layoutDelegate.N();
        }
    }

    private final y k0() {
        y yVar = this.intrinsicsPolicy;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this, getMeasurePolicy());
        this.intrinsicsPolicy = yVar2;
        return yVar2;
    }

    public static /* synthetic */ boolean l1(g0 g0Var, w4.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = g0Var.layoutDelegate.y();
        }
        return g0Var.k1(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(g0 g0Var, g0 g0Var2) {
        return g0Var.t0() == g0Var2.t0() ? p013kotlin.jvm.internal.s.m(g0Var.o0(), g0Var2.o0()) : Float.compare(g0Var.t0(), g0Var2.t0());
    }

    public static /* synthetic */ void q1(g0 g0Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        g0Var.p1(z11);
    }

    private final void r(androidx.compose.ui.d modifier) {
        this._modifier = modifier;
        this.nodes.F(modifier);
        this.layoutDelegate.c0();
        if (this.lookaheadRoot == null && this.nodes.r(b1.a(512))) {
            E1(this);
        }
    }

    public static /* synthetic */ void s1(g0 g0Var, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            z13 = true;
        }
        g0Var.r1(z11, z12, z13);
    }

    private final float t0() {
        return b0().G1();
    }

    private final void u() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = g.NotUsed;
        t2.b<g0> bVarW0 = w0();
        int iN = bVarW0.getSize();
        if (iN > 0) {
            g0[] g0VarArrM = bVarW0.m();
            int i11 = 0;
            do {
                g0 g0Var = g0VarArrM[i11];
                if (g0Var.intrinsicsUsageByParent == g.InLayoutBlock) {
                    g0Var.u();
                }
                i11++;
            } while (i11 < iN);
        }
    }

    public static /* synthetic */ void u1(g0 g0Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        g0Var.t1(z11);
    }

    private final String v(int depth) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < depth; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append('\n');
        t2.b<g0> bVarW0 = w0();
        int iN = bVarW0.getSize();
        if (iN > 0) {
            g0[] g0VarArrM = bVarW0.m();
            int i12 = 0;
            do {
                sb2.append(g0VarArrM[i12].v(depth + 1));
                i12++;
            } while (i12 < iN);
        }
        String string = sb2.toString();
        if (depth != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    static /* synthetic */ String w(g0 g0Var, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return g0Var.v(i11);
    }

    public static /* synthetic */ void w1(g0 g0Var, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            z13 = true;
        }
        g0Var.v1(z11, z12, z13);
    }

    public static /* synthetic */ void y0(g0 g0Var, long j11, u uVar, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        g0Var.x0(j11, uVar, z13, z12);
    }

    private final void y1() {
        this.nodes.y();
    }

    public final void A(k3.j1 canvas, n3.c graphicsLayer) {
        l0().q2(canvas, graphicsLayer);
    }

    public final void A1(boolean z11) {
        this.canMultiMeasure = z11;
    }

    public final boolean B() {
        b4.b bVarC;
        b4.a aVarQ;
        l0 l0Var = this.layoutDelegate;
        return l0Var.r().q().k() || !((bVarC = l0Var.C()) == null || (aVarQ = bVarC.q()) == null || !aVarQ.k());
    }

    public final void B0(int index, g0 instance) {
        if (!(instance._foldedParent == null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot insert ");
            sb2.append(instance);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(w(this, 0, 1, null));
            sb2.append(" Other tree: ");
            g0 g0Var = instance._foldedParent;
            sb2.append(g0Var != null ? w(g0Var, 0, 1, null) : null);
            y3.a.b(sb2.toString());
        }
        if (!(instance.owner == null)) {
            y3.a.b("Cannot insert " + instance + " because it already has an owner. This tree: " + w(this, 0, 1, null) + " Other tree: " + w(instance, 0, 1, null));
        }
        instance._foldedParent = this;
        this._foldedChildren.a(index, instance);
        h1();
        if (instance.isVirtual) {
            this.virtualChildrenCount++;
        }
        J0();
        j1 j1Var = this.owner;
        if (j1Var != null) {
            instance.s(j1Var);
        }
        if (instance.layoutDelegate.s() > 0) {
            l0 l0Var = this.layoutDelegate;
            l0Var.W(l0Var.s() + 1);
        }
    }

    public final void B1(boolean z11) {
        this.innerLayerCoordinatorIsDirty = z11;
    }

    public final boolean C() {
        return this.pendingModifier != null;
    }

    public final void C1(androidx.compose.ui.viewinterop.d dVar) {
        this.interopViewFactoryHolder = dVar;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    public final void D0() {
        z0 z0VarP = P();
        if (z0VarP != null) {
            z0VarP.S2();
            return;
        }
        g0 g0VarN0 = n0();
        if (g0VarN0 != null) {
            g0VarN0.D0();
        }
    }

    public final void D1(g gVar) {
        this.intrinsicsUsageByParent = gVar;
    }

    public final List<z3.h0> E() {
        l0.a aVarY = Y();
        p013kotlin.jvm.internal.s.h(aVarY);
        return aVarY.o1();
    }

    public final void E0() {
        z0 z0VarL0 = l0();
        z0 z0VarO = O();
        while (z0VarL0 != z0VarO) {
            p013kotlin.jvm.internal.s.i(z0VarL0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            c0 c0Var = (c0) z0VarL0;
            i1 layer = c0Var.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            z0VarL0 = c0Var.getWrapped();
        }
        i1 layer2 = O().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final List<z3.h0> F() {
        return b0().v1();
    }

    public final void F0() {
        if (this.lookaheadRoot != null) {
            s1(this, false, false, false, 7, null);
        } else {
            w1(this, false, false, false, 7, null);
        }
    }

    public final void F1(boolean z11) {
        this.needsOnPositionedDispatch = z11;
    }

    public final List<g0> G() {
        return w0().g();
    }

    public final void G0() {
        if (U() || c0() || this.needsOnPositionedDispatch) {
            return;
        }
        k0.b(this).d(this);
    }

    public final void G1(wn0.l<? super j1, jn0.h0> lVar) {
        this.onAttach = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, g4.l] */
    public final g4.l H() {
        if (!K0() || getIsDeactivated()) {
            return null;
        }
        if (!this.nodes.r(b1.a(8)) || this._collapsedSemantics != null) {
            return this._collapsedSemantics;
        }
        p013kotlin.jvm.internal.n0 n0Var = new p013kotlin.jvm.internal.n0();
        n0Var.f86529a = new g4.l();
        k0.b(this).getSnapshotObserver().j(this, new j(n0Var));
        T t11 = n0Var.f86529a;
        this._collapsedSemantics = (g4.l) t11;
        return (g4.l) t11;
    }

    public final void H0() {
        this.layoutDelegate.M();
    }

    public final void H1(wn0.l<? super j1, jn0.h0> lVar) {
        this.onDetach = lVar;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public p020r2.x getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    public final void I0() {
        this._collapsedSemantics = null;
        k0.b(this).x();
    }

    public void I1(int i11) {
        this.semanticsId = i11;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public w4.d getDensity() {
        return this.density;
    }

    public final void J1(z3.d0 d0Var) {
        this.subcompositionsState = d0Var;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    public boolean K0() {
        return this.owner != null;
    }

    public final void K1() {
        if (this.virtualChildrenCount > 0) {
            j1();
        }
    }

    public final List<g0> L() {
        return this._foldedChildren.b();
    }

    /* JADX INFO: renamed from: L0, reason: from getter */
    public boolean getIsDeactivated() {
        return this.isDeactivated;
    }

    public final boolean M() {
        long jB2 = O().B2();
        return w4.b.j(jB2) && w4.b.i(jB2);
    }

    public final boolean M0() {
        return b0().P1();
    }

    public int N() {
        return this.layoutDelegate.x();
    }

    public final Boolean N0() {
        l0.a aVarY = Y();
        if (aVarY != null) {
            return Boolean.valueOf(aVarY.y());
        }
        return null;
    }

    public final z0 O() {
        return this.nodes.getInnerCoordinator();
    }

    /* JADX INFO: renamed from: O0, reason: from getter */
    public final boolean getIsVirtualLookaheadRoot() {
        return this.isVirtualLookaheadRoot;
    }

    public final boolean P0(w4.b constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        l0.a aVarY = Y();
        p013kotlin.jvm.internal.s.h(aVarY);
        return aVarY.V1(constraints.getValue());
    }

    public View Q() {
        androidx.compose.ui.viewinterop.d dVar = this.interopViewFactoryHolder;
        if (dVar != null) {
            return dVar.getInteropView();
        }
        return null;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final androidx.compose.ui.viewinterop.d getInteropViewFactoryHolder() {
        return this.interopViewFactoryHolder;
    }

    public final void R0() {
        if (this.intrinsicsUsageByParent == g.NotUsed) {
            u();
        }
        l0.a aVarY = Y();
        p013kotlin.jvm.internal.s.h(aVarY);
        aVarY.W1();
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final g getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    public final void S0() {
        this.layoutDelegate.O();
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final l0 getLayoutDelegate() {
        return this.layoutDelegate;
    }

    public final void T0() {
        this.layoutDelegate.P();
    }

    public final boolean U() {
        return this.layoutDelegate.A();
    }

    public final void U0() {
        this.layoutDelegate.Q();
    }

    public final e V() {
        return this.layoutDelegate.B();
    }

    public final void V0() {
        this.layoutDelegate.R();
    }

    public final boolean W() {
        return this.layoutDelegate.F();
    }

    public final int W0(int width) {
        return k0().b(width);
    }

    public final boolean X() {
        return this.layoutDelegate.G();
    }

    public final int X0(int height) {
        return k0().c(height);
    }

    public final l0.a Y() {
        return this.layoutDelegate.H();
    }

    public final int Y0(int width) {
        return k0().d(width);
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final g0 getLookaheadRoot() {
        return this.lookaheadRoot;
    }

    public final int Z0(int height) {
        return k0().e(height);
    }

    @Override // p020r2.k
    public void a() {
        androidx.compose.ui.viewinterop.d dVar = this.interopViewFactoryHolder;
        if (dVar != null) {
            dVar.a();
        }
        z3.d0 d0Var = this.subcompositionsState;
        if (d0Var != null) {
            d0Var.a();
        }
        z0 wrapped = O().getWrapped();
        for (z0 z0VarL0 = l0(); !p013kotlin.jvm.internal.s.f(z0VarL0, wrapped) && z0VarL0 != null; z0VarL0 = z0VarL0.getWrapped()) {
            z0VarL0.c3();
        }
    }

    public final i0 a0() {
        return k0.b(this).getSharedDrawScope();
    }

    public final int a1(int width) {
        return k0().f(width);
    }

    @Override // p020r2.k
    public void b() {
        androidx.compose.ui.viewinterop.d dVar = this.interopViewFactoryHolder;
        if (dVar != null) {
            dVar.b();
        }
        z3.d0 d0Var = this.subcompositionsState;
        if (d0Var != null) {
            d0Var.b();
        }
        this.isDeactivated = true;
        y1();
        if (K0()) {
            I0();
        }
    }

    public final l0.b b0() {
        return this.layoutDelegate.I();
    }

    public final int b1(int height) {
        return k0().g(height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // b4.g
    public void c(w4.t tVar) {
        if (this.layoutDirection != tVar) {
            this.layoutDirection = tVar;
            g1();
            x0 x0Var = this.nodes;
            int iA = b1.a(4);
            if ((x0Var.i() & iA) != 0) {
                for (androidx.compose.ui.d.c head = x0Var.getHead(); head != null; head = head.getChild()) {
                    if ((head.getKindSet() & iA) != 0) {
                        androidx.compose.ui.d.c cVarG = head;
                        t2.b bVar = null;
                        while (cVarG != 0) {
                            if (cVarG instanceof r) {
                                r rVar = (r) cVarG;
                                if (rVar instanceof h3.c) {
                                    ((h3.c) rVar).t1();
                                }
                            } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof m)) {
                                androidx.compose.ui.d.c cVarY2 = ((m) cVarG).getDelegate();
                                int i11 = 0;
                                cVarG = cVarG;
                                while (cVarY2 != null) {
                                    if ((cVarY2.getKindSet() & iA) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVarG = cVarY2;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                            }
                                            if (cVarG != 0) {
                                                bVar.b(cVarG);
                                                cVarG = 0;
                                            }
                                            bVar.b(cVarY2);
                                        }
                                    }
                                    cVarY2 = cVarY2.getChild();
                                    cVarG = cVarG;
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVarG = k.g(bVar);
                        }
                    }
                    if ((head.getAggregateChildKindSet() & iA) == 0) {
                        return;
                    }
                }
            }
        }
    }

    public final boolean c0() {
        return this.layoutDelegate.J();
    }

    public final int c1(int width) {
        return k0().h(width);
    }

    @Override // b4.g
    public void d(w4.d dVar) {
        if (p013kotlin.jvm.internal.s.f(this.density, dVar)) {
            return;
        }
        this.density = dVar;
        g1();
        for (androidx.compose.ui.d.c head = this.nodes.getHead(); head != null; head = head.getChild()) {
            if ((b1.a(16) & head.getKindSet()) != 0) {
                ((p1) head).J1();
            } else if (head instanceof h3.c) {
                ((h3.c) head).t1();
            }
        }
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public z3.i0 getMeasurePolicy() {
        return this.measurePolicy;
    }

    public final int d1(int height) {
        return k0().i(height);
    }

    @Override // b4.g
    public void e(int i11) {
        this.compositeKeyHash = i11;
    }

    public final g e0() {
        return b0().B1();
    }

    public final void e1(int from, int to2, int count) {
        if (from == to2) {
            return;
        }
        for (int i11 = 0; i11 < count; i11++) {
            this._foldedChildren.a(from > to2 ? to2 + i11 : (to2 + count) - 2, this._foldedChildren.g(from > to2 ? from + i11 : from));
        }
        h1();
        J0();
        F0();
    }

    @Override // z3.y0
    public void f() {
        g0 g0Var;
        if (this.lookaheadRoot != null) {
            g0Var = this;
            s1(g0Var, false, false, false, 5, null);
        } else {
            w1(this, false, false, false, 5, null);
            g0Var = this;
        }
        w4.b bVarY = g0Var.layoutDelegate.y();
        if (bVarY != null) {
            j1 j1Var = g0Var.owner;
            if (j1Var != null) {
                j1Var.y(this, bVarY.getValue());
                return;
            }
            return;
        }
        j1 j1Var2 = g0Var.owner;
        if (j1Var2 != null) {
            j1.u(j1Var2, false, 1, null);
        }
    }

    public final g f0() {
        g gVarV1;
        l0.a aVarY = Y();
        return (aVarY == null || (gVarV1 = aVarY.v1()) == null) ? g.NotUsed : gVarV1;
    }

    @Override // b4.g
    public void g(z3.i0 i0Var) {
        if (p013kotlin.jvm.internal.s.f(this.measurePolicy, i0Var)) {
            return;
        }
        this.measurePolicy = i0Var;
        y yVar = this.intrinsicsPolicy;
        if (yVar != null) {
            yVar.k(getMeasurePolicy());
        }
        F0();
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public androidx.compose.ui.d get_modifier() {
        return this._modifier;
    }

    @Override // z3.z
    public z3.v getCoordinates() {
        return O();
    }

    @Override // z3.z
    public w4.t getLayoutDirection() {
        return this.layoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // b4.g
    public void h(p020r2.x r10) {
        /*
            r9 = this;
            r9.compositionLocalMap = r10
            r2.g2 r0 = androidx.compose.ui.platform.z0.g()
            java.lang.Object r0 = r10.b(r0)
            w4.d r0 = (w4.d) r0
            r9.d(r0)
            r2.g2 r0 = androidx.compose.ui.platform.z0.m()
            java.lang.Object r0 = r10.b(r0)
            w4.t r0 = (w4.t) r0
            r9.c(r0)
            r2.g2 r0 = androidx.compose.ui.platform.z0.u()
            java.lang.Object r10 = r10.b(r0)
            androidx.compose.ui.platform.e3 r10 = (androidx.compose.ui.platform.e3) r10
            r9.j(r10)
            b4.x0 r10 = r9.nodes
            r0 = 32768(0x8000, float:4.5918E-41)
            int r0 = b4.b1.a(r0)
            int r1 = b4.x0.c(r10)
            r1 = r1 & r0
            if (r1 == 0) goto Lb4
            androidx.compose.ui.d$c r10 = r10.getHead()
        L3d:
            if (r10 == 0) goto Lb4
            int r1 = r10.getKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto La8
            r1 = 0
            r2 = r10
            r3 = r1
        L49:
            if (r2 == 0) goto La8
            boolean r4 = r2 instanceof b4.h
            r5 = 1
            if (r4 == 0) goto L64
            b4.h r2 = (b4.h) r2
            androidx.compose.ui.d$c r2 = r2.getNode()
            boolean r4 = r2.getIsAttached()
            if (r4 == 0) goto L60
            b4.c1.e(r2)
            goto La3
        L60:
            r2.u2(r5)
            goto La3
        L64:
            int r4 = r2.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto La3
            boolean r4 = r2 instanceof b4.m
            if (r4 == 0) goto La3
            r4 = r2
            b4.m r4 = (b4.m) r4
            androidx.compose.ui.d$c r4 = r4.getDelegate()
            r6 = 0
            r7 = r6
        L78:
            if (r4 == 0) goto La0
            int r8 = r4.getKindSet()
            r8 = r8 & r0
            if (r8 == 0) goto L9b
            int r7 = r7 + 1
            if (r7 != r5) goto L87
            r2 = r4
            goto L9b
        L87:
            if (r3 != 0) goto L92
            t2.b r3 = new t2.b
            r8 = 16
            androidx.compose.ui.d$c[] r8 = new androidx.compose.ui.d.c[r8]
            r3.<init>(r8, r6)
        L92:
            if (r2 == 0) goto L98
            r3.b(r2)
            r2 = r1
        L98:
            r3.b(r4)
        L9b:
            androidx.compose.ui.d$c r4 = r4.getChild()
            goto L78
        La0:
            if (r7 != r5) goto La3
            goto L49
        La3:
            androidx.compose.ui.d$c r2 = b4.k.b(r3)
            goto L49
        La8:
            int r1 = r10.getAggregateChildKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto Lb4
            androidx.compose.ui.d$c r10 = r10.getChild()
            goto L3d
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.g0.h(r2.x):void");
    }

    public List<ModifierInfo> h0() {
        return this.nodes.n();
    }

    public final void h1() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        g0 g0VarN0 = n0();
        if (g0VarN0 != null) {
            g0VarN0.h1();
        }
    }

    @Override // b4.g
    public void i(androidx.compose.ui.d dVar) {
        if (!(!this.isVirtual || get_modifier() == androidx.compose.ui.d.INSTANCE)) {
            y3.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (getIsDeactivated()) {
            y3.a.a("modifier is updated when deactivated");
        }
        if (K0()) {
            r(dVar);
        } else {
            this.pendingModifier = dVar;
        }
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final boolean getNeedsOnPositionedDispatch() {
        return this.needsOnPositionedDispatch;
    }

    public final void i1(int x11, int y11) {
        z3.w0.a placementScope;
        z0 z0VarO;
        if (this.intrinsicsUsageByParent == g.NotUsed) {
            u();
        }
        g0 g0VarN0 = n0();
        if (g0VarN0 == null || (z0VarO = g0VarN0.O()) == null || (placementScope = z0VarO.getPlacementScope()) == null) {
            placementScope = k0.b(this).getPlacementScope();
        }
        z3.w0.a.l(placementScope, b0(), x11, y11, BitmapDescriptorFactory.HUE_RED, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // b4.g
    public void j(e3 e3Var) {
        if (p013kotlin.jvm.internal.s.f(this.viewConfiguration, e3Var)) {
            return;
        }
        this.viewConfiguration = e3Var;
        x0 x0Var = this.nodes;
        int iA = b1.a(16);
        if ((x0Var.i() & iA) != 0) {
            for (androidx.compose.ui.d.c head = x0Var.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) != 0) {
                    androidx.compose.ui.d.c cVarG = head;
                    t2.b bVar = null;
                    while (cVarG != 0) {
                        if (cVarG instanceof p1) {
                            ((p1) cVarG).T1();
                        } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof m)) {
                            androidx.compose.ui.d.c cVarY2 = ((m) cVarG).getDelegate();
                            int i11 = 0;
                            cVarG = cVarG;
                            while (cVarY2 != null) {
                                if ((cVarY2.getKindSet() & iA) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        cVarG = cVarY2;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                        }
                                        if (cVarG != 0) {
                                            bVar.b(cVarG);
                                            cVarG = 0;
                                        }
                                        bVar.b(cVarY2);
                                    }
                                }
                                cVarY2 = cVarY2.getChild();
                                cVarG = cVarG;
                            }
                            if (i11 == 1) {
                            }
                        }
                        cVarG = k.g(bVar);
                    }
                }
                if ((head.getAggregateChildKindSet() & iA) == 0) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final x0 getNodes() {
        return this.nodes;
    }

    @Override // p020r2.k
    public void k() {
        if (!K0()) {
            y3.a.a("onReuse is only expected on attached node");
        }
        androidx.compose.ui.viewinterop.d dVar = this.interopViewFactoryHolder;
        if (dVar != null) {
            dVar.k();
        }
        z3.d0 d0Var = this.subcompositionsState;
        if (d0Var != null) {
            d0Var.k();
        }
        if (getIsDeactivated()) {
            this.isDeactivated = false;
            I0();
        } else {
            y1();
        }
        I1(g4.o.b());
        this.nodes.t();
        this.nodes.z();
        x1(this);
    }

    public final boolean k1(w4.b constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == g.NotUsed) {
            t();
        }
        return b0().c2(constraints.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // b4.j1.b
    public void l() {
        z0 z0VarO = O();
        int iA = b1.a(128);
        boolean zI = c1.i(iA);
        androidx.compose.ui.d.c cVarH2 = z0VarO.H2();
        if (!zI && (cVarH2 = cVarH2.getParent()) == null) {
            return;
        }
        for (androidx.compose.ui.d.c cVarN2 = z0VarO.N2(zI); cVarN2 != null && (cVarN2.getAggregateChildKindSet() & iA) != 0; cVarN2 = cVarN2.getChild()) {
            if ((cVarN2.getKindSet() & iA) != 0) {
                androidx.compose.ui.d.c cVarG = cVarN2;
                t2.b bVar = null;
                while (cVarG != 0) {
                    if (cVarG instanceof a0) {
                        ((a0) cVarG).K(O());
                    } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof m)) {
                        androidx.compose.ui.d.c cVarY2 = ((m) cVarG).getDelegate();
                        int i11 = 0;
                        cVarG = cVarG;
                        while (cVarY2 != null) {
                            if ((cVarY2.getKindSet() & iA) != 0) {
                                i11++;
                                if (i11 == 1) {
                                    cVarG = cVarY2;
                                } else {
                                    if (bVar == null) {
                                        bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                    }
                                    if (cVarG != 0) {
                                        bVar.b(cVarG);
                                        cVarG = 0;
                                    }
                                    bVar.b(cVarY2);
                                }
                            }
                            cVarY2 = cVarY2.getChild();
                            cVarG = cVarG;
                        }
                        if (i11 == 1) {
                        }
                    }
                    cVarG = k.g(bVar);
                }
            }
            if (cVarN2 == cVarH2) {
                return;
            }
        }
    }

    public final z0 l0() {
        return this.nodes.getOuterCoordinator();
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final j1 getOwner() {
        return this.owner;
    }

    public final void m1() {
        int iE = this._foldedChildren.e();
        while (true) {
            iE--;
            if (-1 >= iE) {
                this._foldedChildren.c();
                return;
            }
            f1(this._foldedChildren.d(iE));
        }
    }

    public final g0 n0() {
        g0 g0Var = this._foldedParent;
        while (g0Var != null && g0Var.isVirtual) {
            g0Var = g0Var._foldedParent;
        }
        return g0Var;
    }

    public final void n1(int index, int count) {
        if (!(count >= 0)) {
            y3.a.a("count (" + count + ") must be greater than 0");
        }
        int i11 = (count + index) - 1;
        if (index > i11) {
            return;
        }
        while (true) {
            f1(this._foldedChildren.d(i11));
            this._foldedChildren.g(i11);
            if (i11 == index) {
                return;
            } else {
                i11--;
            }
        }
    }

    public final int o0() {
        return b0().F1();
    }

    public final void o1() {
        if (this.intrinsicsUsageByParent == g.NotUsed) {
            u();
        }
        b0().d2();
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public int getSemanticsId() {
        return this.semanticsId;
    }

    public final void p1(boolean forceRequest) {
        j1 j1Var;
        if (this.isVirtual || (j1Var = this.owner) == null) {
            return;
        }
        j1Var.b(this, true, forceRequest);
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final z3.d0 getSubcompositionsState() {
        return this.subcompositionsState;
    }

    /* JADX INFO: renamed from: r0, reason: from getter */
    public e3 getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final void r1(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        if (!(this.lookaheadRoot != null)) {
            y3.a.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        j1 j1Var = this.owner;
        if (j1Var == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        j1Var.q(this, true, forceRequest, scheduleMeasureAndLayout);
        if (invalidateIntrinsics) {
            l0.a aVarY = Y();
            p013kotlin.jvm.internal.s.h(aVarY);
            aVarY.y1(forceRequest);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    public final void s(j1 owner) {
        boolean z11;
        g0 g0Var;
        int i11 = 0;
        if (!(this.owner == null)) {
            y3.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + w(this, 0, 1, null));
        }
        g0 g0Var2 = this._foldedParent;
        if (g0Var2 == null) {
            z11 = true;
        } else if (p013kotlin.jvm.internal.s.f(g0Var2 != null ? g0Var2.owner : null, owner)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Attaching to a different owner(");
            sb2.append(owner);
            sb2.append(") than the parent's owner(");
            g0 g0VarN0 = n0();
            sb2.append(g0VarN0 != null ? g0VarN0.owner : null);
            sb2.append("). This tree: ");
            sb2.append(w(this, 0, 1, null));
            sb2.append(" Parent tree: ");
            g0 g0Var3 = this._foldedParent;
            sb2.append(g0Var3 != null ? w(g0Var3, 0, 1, null) : null);
            y3.a.b(sb2.toString());
        }
        g0 g0VarN1 = n0();
        if (g0VarN1 == null) {
            b0().g2(true);
            l0.a aVarY = Y();
            if (aVarY != null) {
                aVarY.a2(true);
            }
        }
        l0().o3(g0VarN1 != null ? g0VarN1.O() : null);
        this.owner = owner;
        this.depth = (g0VarN1 != null ? g0VarN1.depth : -1) + 1;
        androidx.compose.ui.d dVar = this.pendingModifier;
        if (dVar != null) {
            r(dVar);
        }
        this.pendingModifier = null;
        if (this.nodes.r(b1.a(8))) {
            I0();
        }
        owner.s(this);
        if (this.isVirtualLookaheadRoot) {
            E1(this);
        } else {
            g0 g0Var4 = this._foldedParent;
            if (g0Var4 == null || (g0Var = g0Var4.lookaheadRoot) == null) {
                g0Var = this.lookaheadRoot;
            }
            E1(g0Var);
            if (this.lookaheadRoot == null && this.nodes.r(b1.a(512))) {
                E1(this);
            }
        }
        if (!getIsDeactivated()) {
            this.nodes.t();
        }
        t2.b<g0> bVarF = this._foldedChildren.f();
        int iN = bVarF.getSize();
        if (iN > 0) {
            g0[] g0VarArrM = bVarF.m();
            do {
                g0VarArrM[i11].s(owner);
                i11++;
            } while (i11 < iN);
        }
        if (!getIsDeactivated()) {
            this.nodes.z();
        }
        F0();
        if (g0VarN1 != null) {
            g0VarN1.F0();
        }
        z0 wrapped = O().getWrapped();
        for (z0 z0VarL0 = l0(); !p013kotlin.jvm.internal.s.f(z0VarL0, wrapped) && z0VarL0 != null; z0VarL0 = z0VarL0.getWrapped()) {
            z0VarL0.Y2();
        }
        wn0.l<? super j1, jn0.h0> lVar = this.onAttach;
        if (lVar != null) {
            lVar.invoke(owner);
        }
        this.layoutDelegate.c0();
        if (getIsDeactivated()) {
            return;
        }
        C0();
    }

    public int s0() {
        return this.layoutDelegate.L();
    }

    public final void t() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = g.NotUsed;
        t2.b<g0> bVarW0 = w0();
        int iN = bVarW0.getSize();
        if (iN > 0) {
            g0[] g0VarArrM = bVarW0.m();
            int i11 = 0;
            do {
                g0 g0Var = g0VarArrM[i11];
                if (g0Var.intrinsicsUsageByParent != g.NotUsed) {
                    g0Var.t();
                }
                i11++;
            } while (i11 < iN);
        }
    }

    public final void t1(boolean forceRequest) {
        j1 j1Var;
        if (this.isVirtual || (j1Var = this.owner) == null) {
            return;
        }
        j1.z(j1Var, this, false, forceRequest, 2, null);
    }

    public String toString() {
        return androidx.compose.ui.platform.t1.a(this, null) + " children: " + G().size() + " measurePolicy: " + getMeasurePolicy();
    }

    @Override // b4.k1
    public boolean u0() {
        return K0();
    }

    public final t2.b<g0> v0() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.h();
            t2.b<g0> bVar = this._zSortedChildren;
            bVar.e(bVar.getSize(), w0());
            this._zSortedChildren.A(Q);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    public final void v1(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        j1 j1Var;
        if (this.ignoreRemeasureRequests || this.isVirtual || (j1Var = this.owner) == null) {
            return;
        }
        j1.c(j1Var, this, false, forceRequest, scheduleMeasureAndLayout, 2, null);
        if (invalidateIntrinsics) {
            b0().J1(forceRequest);
        }
    }

    public final t2.b<g0> w0() {
        K1();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.f();
        }
        t2.b<g0> bVar = this._unfoldedChildren;
        p013kotlin.jvm.internal.s.h(bVar);
        return bVar;
    }

    public final void x() {
        j1 j1Var = this.owner;
        if (j1Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            g0 g0VarN0 = n0();
            sb2.append(g0VarN0 != null ? w(g0VarN0, 0, 1, null) : null);
            y3.a.c(sb2.toString());
            throw new KotlinNothingValueException();
        }
        g0 g0VarN1 = n0();
        if (g0VarN1 != null) {
            g0VarN1.D0();
            g0VarN1.F0();
            l0.b bVarB0 = b0();
            g gVar = g.NotUsed;
            bVarB0.f2(gVar);
            l0.a aVarY = Y();
            if (aVarY != null) {
                aVarY.Y1(gVar);
            }
        }
        this.layoutDelegate.V();
        wn0.l<? super j1, jn0.h0> lVar = this.onDetach;
        if (lVar != null) {
            lVar.invoke(j1Var);
        }
        if (this.nodes.r(b1.a(8))) {
            I0();
        }
        this.nodes.A();
        this.ignoreRemeasureRequests = true;
        t2.b<g0> bVarF = this._foldedChildren.f();
        int iN = bVarF.getSize();
        if (iN > 0) {
            g0[] g0VarArrM = bVarF.m();
            int i11 = 0;
            do {
                g0VarArrM[i11].x();
                i11++;
            } while (i11 < iN);
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.u();
        j1Var.h(this);
        this.owner = null;
        E1(null);
        this.depth = 0;
        b0().Y1();
        l0.a aVarY2 = Y();
        if (aVarY2 != null) {
            aVarY2.R1();
        }
    }

    public final void x0(long pointerPosition, u hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        l0().Q2(z0.INSTANCE.a(), z0.w2(l0(), pointerPosition, false, 2, null), hitTestResult, isTouchEvent, isInLayer);
    }

    public final void x1(g0 it) {
        if (h.f16100a[it.V().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + it.V());
        }
        if (it.X()) {
            s1(it, true, false, false, 6, null);
            return;
        }
        if (it.W()) {
            it.p1(true);
        }
        if (it.c0()) {
            w1(it, true, false, false, 6, null);
        } else if (it.U()) {
            it.t1(true);
        }
    }

    @Override // z3.z
    public boolean y() {
        return b0().y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void z() {
        if (V() != e.Idle || U() || c0() || getIsDeactivated() || !y()) {
            return;
        }
        x0 x0Var = this.nodes;
        int iA = b1.a(256);
        if ((x0Var.i() & iA) != 0) {
            for (androidx.compose.ui.d.c head = x0Var.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) != 0) {
                    androidx.compose.ui.d.c cVarG = head;
                    t2.b bVar = null;
                    while (cVarG != 0) {
                        if (cVarG instanceof t) {
                            t tVar = (t) cVarG;
                            tVar.P(k.h(tVar, b1.a(256)));
                        } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof m)) {
                            androidx.compose.ui.d.c cVarY2 = ((m) cVarG).getDelegate();
                            int i11 = 0;
                            cVarG = cVarG;
                            while (cVarY2 != null) {
                                if ((cVarY2.getKindSet() & iA) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        cVarG = cVarY2;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new t2.b(new androidx.compose.ui.d.c[16], 0);
                                        }
                                        if (cVarG != 0) {
                                            bVar.b(cVarG);
                                            cVarG = 0;
                                        }
                                        bVar.b(cVarY2);
                                    }
                                }
                                cVarY2 = cVarY2.getChild();
                                cVarG = cVarG;
                            }
                            if (i11 == 1) {
                            }
                        }
                        cVarG = k.g(bVar);
                    }
                }
                if ((head.getAggregateChildKindSet() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public final void z0(long pointerPosition, u hitSemanticsEntities, boolean isTouchEvent, boolean isInLayer) {
        l0().Q2(z0.INSTANCE.b(), z0.w2(l0(), pointerPosition, false, 2, null), hitSemanticsEntities, true, isInLayer);
    }

    public final void z1() {
        t2.b<g0> bVarW0 = w0();
        int iN = bVarW0.getSize();
        if (iN > 0) {
            g0[] g0VarArrM = bVarW0.m();
            int i11 = 0;
            do {
                g0 g0Var = g0VarArrM[i11];
                g gVar = g0Var.previousIntrinsicsUsageByParent;
                g0Var.intrinsicsUsageByParent = gVar;
                if (gVar != g.NotUsed) {
                    g0Var.z1();
                }
                i11++;
            } while (i11 < iN);
        }
    }

    public g0(boolean z11, int i11) {
        this.isVirtual = z11;
        this.semanticsId = i11;
        this._foldedChildren = new u0<>(new t2.b(new g0[16], 0), new i());
        this._zSortedChildren = new t2.b<>(new g0[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = N;
        this.density = k0.f16119a;
        this.layoutDirection = w4.t.Ltr;
        this.viewConfiguration = P;
        this.compositionLocalMap = p020r2.x.INSTANCE.a();
        g gVar = g.NotUsed;
        this.intrinsicsUsageByParent = gVar;
        this.previousIntrinsicsUsageByParent = gVar;
        this.nodes = new x0(this);
        this.layoutDelegate = new l0(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = androidx.compose.ui.d.INSTANCE;
    }

    public /* synthetic */ g0(boolean z11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? g4.o.b() : i11);
    }
}
