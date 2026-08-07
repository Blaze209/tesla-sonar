package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import j3.MutableRect;
import java.util.LinkedHashMap;
import java.util.Map;
import k3.n3;
import k3.r3;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000 ª\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u0081\u0002«\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010%J@\u0010.\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/JH\u00101\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u00100\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102JH\u00103\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u00100\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00102J\u0013\u00104\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b4\u00105J\"\u00109\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u000207H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\"\u0010;\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u000207H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010:J*\u0010>\u001a\u00020(2\u0006\u00106\u001a\u00020\u00002\u0006\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b>\u0010?J'\u0010C\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\tH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010F\u001a\u00020\u00182\u0006\u0010E\u001a\u00020@2\u0006\u0010B\u001a\u00020\tH\u0002¢\u0006\u0004\bF\u0010GJ\u001a\u0010H\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u001e\u0010J\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020\t¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0018H\u0010¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0018H&¢\u0006\u0004\bP\u0010OJ\u001f\u0010T\u001a\u00020\u00182\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020QH\u0014¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0018H\u0000¢\u0006\u0004\bV\u0010OJ\r\u0010W\u001a\u00020\u0018¢\u0006\u0004\bW\u0010OJ8\u0010X\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016H\u0014ø\u0001\u0000¢\u0006\u0004\bX\u0010YJ*\u0010[\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020\u001aH\u0014ø\u0001\u0000¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020\u0018¢\u0006\u0004\b]\u0010OJ@\u0010^\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\u0010Z\u001a\u0004\u0018\u00010\u001aø\u0001\u0000¢\u0006\u0004\b^\u0010\u001dJ\u001f\u0010_\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b_\u0010\"J!\u0010`\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b`\u0010\"J\r\u0010a\u001a\u00020\u0018¢\u0006\u0004\ba\u0010OJ-\u0010c\u001a\u00020\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\b\u0002\u0010b\u001a\u00020\t¢\u0006\u0004\bc\u0010dJ8\u0010e\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\be\u0010fJ:\u0010g\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bg\u0010fJ\r\u0010i\u001a\u00020h¢\u0006\u0004\bi\u0010jJ\u001a\u0010l\u001a\u00020(2\u0006\u0010k\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bl\u0010IJ\u001a\u0010n\u001a\u00020(2\u0006\u0010m\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bn\u0010IJ\u001a\u0010p\u001a\u00020(2\u0006\u0010o\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bp\u0010IJ\"\u0010s\u001a\u00020(2\u0006\u0010q\u001a\u00020\u00032\u0006\u0010r\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bs\u0010tJ*\u0010u\u001a\u00020(2\u0006\u0010q\u001a\u00020\u00032\u0006\u0010r\u001a\u00020(2\u0006\u0010=\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bu\u0010vJ\"\u0010w\u001a\u00020\u00182\u0006\u0010q\u001a\u00020\u00032\u0006\u00108\u001a\u000207H\u0016ø\u0001\u0000¢\u0006\u0004\bw\u0010xJ\u001a\u0010y\u001a\u00020\u00182\u0006\u00108\u001a\u000207H\u0016ø\u0001\u0000¢\u0006\u0004\by\u0010zJ\u001f\u0010{\u001a\u00020h2\u0006\u0010q\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\tH\u0016¢\u0006\u0004\b{\u0010|J\u001a\u0010}\u001a\u00020(2\u0006\u0010o\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\b}\u0010IJ$\u0010~\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(2\b\b\u0002\u0010=\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b~\u0010\u007fJ&\u0010\u0080\u0001\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(2\b\b\u0002\u0010=\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0005\b\u0080\u0001\u0010\u007fJ$\u0010\u0083\u0001\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\u0004¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u000f\u0010\u0085\u0001\u001a\u00020\u0018¢\u0006\u0005\b\u0085\u0001\u0010OJ\u000f\u0010\u0086\u0001\u001a\u00020\u0018¢\u0006\u0005\b\u0086\u0001\u0010OJ-\u0010\u0088\u0001\u001a\u00020\u00182\u0006\u0010E\u001a\u00020@2\u0006\u0010B\u001a\u00020\t2\t\b\u0002\u0010\u0087\u0001\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001d\u0010\u008a\u0001\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0004ø\u0001\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u001d\u0010\u008c\u0001\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0004ø\u0001\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008b\u0001J\u0011\u0010\u008d\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u008d\u0001\u0010OJ\u0011\u0010\u008e\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u008e\u0001\u0010OJ\u001b\u0010\u0090\u0001\u001a\u00020\u00002\u0007\u0010\u008f\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u000f\u0010\u0092\u0001\u001a\u00020\t¢\u0006\u0005\b\u0092\u0001\u0010MJ\u001f\u0010\u0095\u0001\u001a\u00030\u0093\u00012\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0004ø\u0001\u0000¢\u0006\u0005\b\u0095\u0001\u0010IJ'\u0010\u0096\u0001\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0004ø\u0001\u0000¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001e\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R'\u0010 \u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010M\"\u0005\b\u009f\u0001\u0010%R'\u0010¤\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b¡\u0001\u0010\u009d\u0001\u001a\u0005\b¢\u0001\u0010M\"\u0005\b£\u0001\u0010%R+\u0010«\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R+\u0010¯\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¬\u0001\u0010¦\u0001\u001a\u0006\b\u00ad\u0001\u0010¨\u0001\"\u0006\b®\u0001\u0010ª\u0001R\u0019\u0010±\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u009d\u0001R\u0019\u0010³\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010\u009d\u0001RE\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\u0015\u0010´\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0004@BX\u0084\u000e¢\u0006\u0010\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001R\u001a\u0010¼\u0001\u001a\u00030¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001a\u0010À\u0001\u001a\u00030½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0018\u0010Â\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÁ\u0001\u0010{R\u001c\u0010Æ\u0001\u001a\u0005\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R)\u0010Ë\u0001\u001a\u0012\u0012\u0005\u0012\u00030È\u0001\u0012\u0004\u0012\u00020Q\u0018\u00010Ç\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R7\u0010\u0013\u001a\u00020\u00122\u0007\u0010´\u0001\u001a\u00020\u00128\u0016@TX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R/\u0010\u0015\u001a\u00020\u00142\u0007\u0010´\u0001\u001a\u00020\u00148\u0006@DX\u0086\u000e¢\u0006\u0016\n\u0004\bs\u0010{\u001a\u0006\bÒ\u0001\u0010Ó\u0001\"\u0006\bÔ\u0001\u0010Õ\u0001R\u001b\u0010Ø\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001R\u001b\u0010Û\u0001\u001a\u0005\u0018\u00010Ù\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b{\u0010Ú\u0001R2\u0010ß\u0001\u001a\u0017\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00180Ü\u00018\u0002X\u0082\u0004¢\u0006\u000e\n\u0005\bw\u0010Ý\u0001\u0012\u0005\bÞ\u0001\u0010OR\u001e\u0010ã\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180à\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R)\u0010æ\u0001\u001a\u00020\t2\u0007\u0010´\u0001\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\bä\u0001\u0010\u009d\u0001\u001a\u0005\bå\u0001\u0010MR/\u0010Z\u001a\u0005\u0018\u00010ç\u00012\n\u0010´\u0001\u001a\u0005\u0018\u00010ç\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bÍ\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bp\u0010ë\u0001R\u0018\u0010ï\u0001\u001a\u00030ì\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010î\u0001R\u0017\u0010ò\u0001\u001a\u00020\u000b8&X¦\u0004¢\u0006\b\u001a\u0006\bð\u0001\u0010ñ\u0001R\u0018\u0010õ\u0001\u001a\u00030½\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bó\u0001\u0010ô\u0001R\u0017\u0010÷\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\bö\u0001\u0010Ó\u0001R\u0017\u0010ù\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\bø\u0001\u0010Ó\u0001R\u0019\u0010ü\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bú\u0001\u0010û\u0001R\u0017\u0010ÿ\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bý\u0001\u0010þ\u0001R\u001b\u0010\u0082\u0002\u001a\u00030\u0080\u00028Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0081\u0002\u0010Ï\u0001R\u0018\u0010\u0086\u0002\u001a\u00030\u0083\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002R\u0019\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0002\u0010û\u0001R\u0016\u0010\u008a\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0002\u0010MR\u0016\u0010\u008c\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0002\u0010MR,\u0010\u0092\u0002\u001a\u00030Ã\u00012\b\u0010\u008d\u0002\u001a\u00030Ã\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002\"\u0006\b\u0090\u0002\u0010\u0091\u0002R0\u0010\u0098\u0002\u001a\u0005\u0018\u00010\u0093\u00022\n\u0010´\u0001\u001a\u0005\u0018\u00010\u0093\u00028&@dX¦\u000e¢\u0006\u0010\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002\"\u0006\b\u0096\u0002\u0010\u0097\u0002R\u001a\u0010\u009c\u0002\u001a\u0005\u0018\u00010\u0099\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R\u0016\u0010\u009e\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b\u009d\u0002\u0010þ\u0001R\u0016\u0010 \u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b\u009f\u0002\u0010þ\u0001R\u0017\u0010£\u0002\u001a\u00020@8DX\u0084\u0004¢\u0006\b\u001a\u0006\b¡\u0002\u0010¢\u0002R\u001e\u0010¦\u0002\u001a\u00030¤\u00028@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b¥\u0002\u0010Ï\u0001R\u0016\u0010¨\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b§\u0002\u0010MR\u001b\u0010\u0094\u0001\u001a\u00030\u0093\u00018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b©\u0002\u0010Ï\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¬\u0002"}, d2 = {"Lb4/z0;", "Lb4/p0;", "Lz3/h0;", "Lz3/v;", "Lb4/k1;", "Lb4/g0;", "layoutNode", "<init>", "(Lb4/g0;)V", "", "includeTail", "Landroidx/compose/ui/d$c;", "N2", "(Z)Landroidx/compose/ui/d$c;", "Lb4/b1;", "type", "L2", "(I)Z", "Lw4/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Ljn0/h0;", "layerBlock", "Ln3/c;", "explicitLayer", "e3", "(JFLwn0/l;Ln3/c;)V", "Lk3/j1;", "canvas", "graphicsLayer", "s2", "(Lk3/j1;Ln3/c;)V", "invokeOnLayoutChange", "z3", "(Z)V", "Lb4/z0$f;", "hitTestSource", "Lj3/g;", "pointerPosition", "Lb4/u;", "hitTestResult", "isTouchEvent", "isInLayer", "O2", "(Landroidx/compose/ui/d$c;Lb4/z0$f;JLb4/u;ZZ)V", "distanceFromEdge", "P2", "(Landroidx/compose/ui/d$c;Lb4/z0$f;JLb4/u;ZZF)V", "q3", "r3", "(Lz3/v;)Lb4/z0;", "ancestor", "Lk3/n3;", "matrix", "w3", "(Lb4/z0;[F)V", "v3", "offset", "includeMotionFrameOfReference", "n2", "(Lb4/z0;JZ)J", "Lj3/e;", "rect", "clipBounds", "m2", "(Lb4/z0;Lj3/e;Z)V", "bounds", "x2", "(Lj3/e;Z)V", "V2", "(J)J", "M2", "(I)Landroidx/compose/ui/d$c;", "U2", "()Z", "V1", "()V", "t2", "", Snapshot.WIDTH, Snapshot.HEIGHT, "Z2", "(II)V", "W2", "a3", "Y0", "(JFLwn0/l;)V", "layer", "X0", "(JFLn3/c;)V", "i3", "f3", "q2", "d3", "b3", "forceUpdateLayerParameters", "x3", "(Lwn0/l;Z)V", "Q2", "(Lb4/z0$f;JLb4/u;ZZ)V", "R2", "Lj3/i;", "u3", "()Lj3/i;", "relativeToScreen", "n", "relativeToWindow", "d0", "relativeToLocal", "K", "sourceCoordinates", "relativeToSource", "D", "(Lz3/v;J)J", "f0", "(Lz3/v;JZ)J", "G", "(Lz3/v;[F)V", "q0", "([F)V", Gender.FEMALE, "(Lz3/v;Z)Lj3/i;", "P", "s3", "(JZ)J", "v2", "Lk3/r3;", "paint", "r2", "(Lk3/j1;Lk3/r3;)V", "Y2", "c3", "clipToMinimumTouchTargetSize", "g3", "(Lj3/e;ZZ)V", "B3", "(J)Z", "T2", "S2", "X2", "other", "u2", "(Lb4/z0;)Lb4/z0;", "p3", "Lj3/m;", "minimumTouchTargetSize", "o2", "p2", "(JJ)F", "p", "Lb4/g0;", "v1", "()Lb4/g0;", "q", "Z", "getForcePlaceWithLookaheadOffset$ui_release", "k3", "forcePlaceWithLookaheadOffset", "r", "z2", "j3", "forceMeasureWithLookaheadConstraints", "s", "Lb4/z0;", "I2", "()Lb4/z0;", "n3", "(Lb4/z0;)V", "wrapped", "t", "J2", "o3", "wrappedBy", "u", "released", "v", "isClipping", "<set-?>", "w", "Lwn0/l;", "getLayerBlock", "()Lwn0/l;", "Lw4/d;", "x", "Lw4/d;", "layerDensity", "Lw4/t;", "y", "Lw4/t;", "layerLayoutDirection", "z", "lastLayerAlpha", "Lz3/j0;", "A", "Lz3/j0;", "_measureResult", "", "Lz3/a;", "B", "Ljava/util/Map;", "oldAlignmentLines", "C", "J", "F1", "()J", "m3", "(J)V", "K2", "()F", "setZIndex", "(F)V", "E", "Lj3/e;", "_rectCache", "Lb4/z;", "Lb4/z;", "layerPositionalProperties", "Lkotlin/Function2;", "Lwn0/p;", "getDrawBlock$annotations", "drawBlock", "Lkotlin/Function0;", "H", "Lwn0/a;", "invalidateParentLayer", "I", "A2", "lastLayerDrawingWasSkipped", "Lb4/i1;", "Lb4/i1;", "C2", "()Lb4/i1;", "Ln3/c;", "Lb4/l1;", "G2", "()Lb4/l1;", "snapshotObserver", "H2", "()Landroidx/compose/ui/d$c;", "tail", "getLayoutDirection", "()Lw4/t;", "layoutDirection", "getDensity", "density", "M1", "fontScale", "y1", "()Lb4/p0;", "parent", "t1", "()Lz3/v;", "coordinates", "Lw4/r;", "e", "size", "Lb4/b;", "y2", "()Lb4/b;", "alignmentLinesOwner", "q1", "child", "u1", "hasMeasureResult", "b0", "isAttached", "value", "x1", "()Lz3/j0;", "l3", "(Lz3/j0;)V", "measureResult", "Lb4/q0;", "D2", "()Lb4/q0;", "setLookaheadDelegate", "(Lb4/q0;)V", "lookaheadDelegate", "", "c", "()Ljava/lang/Object;", "parentData", Gender.MALE, "parentLayoutCoordinates", "X", "parentCoordinates", "F2", "()Lj3/e;", "rectCache", "Lw4/b;", "B2", "lastMeasurementConstraints", "u0", "isValidOwnerScope", "E2", "L", "f", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class z0 extends p0 implements z3.h0, z3.v, k1 {

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final wn0.l<z0, jn0.h0> M = d.f16337c;
    private static final wn0.l<z0, jn0.h0> N = c.f16336c;
    private static final androidx.compose.ui.graphics.d O = new androidx.compose.ui.graphics.d();
    private static final z P = new z();
    private static final float[] Q = n3.c(null, 1, null);
    private static final f R = new a();
    private static final f S = new b();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private z3.j0 _measureResult;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private Map<z3.a, Integer> oldAlignmentLines;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private float zIndex;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private MutableRect _rectCache;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private z layerPositionalProperties;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean lastLayerDrawingWasSkipped;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private i1 layer;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private n3.c explicitLayer;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final g0 layoutNode;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean forcePlaceWithLookaheadOffset;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean forceMeasureWithLookaheadConstraints;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private z0 wrapped;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private z0 wrappedBy;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean released;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean isClipping;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> layerBlock;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private w4.d layerDensity = getLayoutNode().getDensity();

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private w4.t layerLayoutDirection = getLayoutNode().getLayoutDirection();

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float lastLayerAlpha = 0.8f;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private long position = w4.n.INSTANCE.a();

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final wn0.p<k3.j1, n3.c, jn0.h0> drawBlock = new g();

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final wn0.a<jn0.h0> invalidateParentLayer = new j();

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"b4/z0$a", "Lb4/z0$f;", "Lb4/b1;", "Lb4/p1;", "a", "()I", "Landroidx/compose/ui/d$c;", "node", "", "b", "(Landroidx/compose/ui/d$c;)Z", "Lb4/g0;", "parentLayoutNode", DateTokenConverter.CONVERTER_KEY, "(Lb4/g0;)Z", "layoutNode", "Lj3/g;", "pointerPosition", "Lb4/u;", "hitTestResult", "isTouchEvent", "isInLayer", "Ljn0/h0;", "c", "(Lb4/g0;JLb4/u;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements f {
        a() {
        }

        @Override // b4.z0.f
        public int a() {
            return b1.a(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v7 */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException
            */
        @Override // b4.z0.f
        public boolean b(androidx.compose.ui.d.c r10) {
            /*
                r9 = this;
                r0 = 16
                int r1 = b4.b1.a(r0)
                r2 = 0
                r3 = r2
            L8:
                r4 = 0
                if (r10 == 0) goto L5a
                boolean r5 = r10 instanceof b4.p1
                r6 = 1
                if (r5 == 0) goto L19
                b4.p1 r10 = (b4.p1) r10
                boolean r10 = r10.b0()
                if (r10 == 0) goto L55
                return r6
            L19:
                int r5 = r10.getKindSet()
                r5 = r5 & r1
                if (r5 == 0) goto L55
                boolean r5 = r10 instanceof b4.m
                if (r5 == 0) goto L55
                r5 = r10
                b4.m r5 = (b4.m) r5
                androidx.compose.ui.d$c r5 = r5.getDelegate()
                r7 = r4
            L2c:
                if (r5 == 0) goto L52
                int r8 = r5.getKindSet()
                r8 = r8 & r1
                if (r8 == 0) goto L4d
                int r7 = r7 + 1
                if (r7 != r6) goto L3b
                r10 = r5
                goto L4d
            L3b:
                if (r3 != 0) goto L44
                t2.b r3 = new t2.b
                androidx.compose.ui.d$c[] r8 = new androidx.compose.ui.d.c[r0]
                r3.<init>(r8, r4)
            L44:
                if (r10 == 0) goto L4a
                r3.b(r10)
                r10 = r2
            L4a:
                r3.b(r5)
            L4d:
                androidx.compose.ui.d$c r5 = r5.getChild()
                goto L2c
            L52:
                if (r7 != r6) goto L55
                goto L8
            L55:
                androidx.compose.ui.d$c r10 = b4.k.b(r3)
                goto L8
            L5a:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: b4.z0.a.b(androidx.compose.ui.d$c):boolean");
        }

        @Override // b4.z0.f
        public void c(g0 layoutNode, long pointerPosition, u hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            layoutNode.x0(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // b4.z0.f
        public boolean d(g0 parentLayoutNode) {
            return true;
        }
    }

    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"b4/z0$b", "Lb4/z0$f;", "Lb4/b1;", "Lb4/s1;", "a", "()I", "Landroidx/compose/ui/d$c;", "node", "", "b", "(Landroidx/compose/ui/d$c;)Z", "Lb4/g0;", "parentLayoutNode", DateTokenConverter.CONVERTER_KEY, "(Lb4/g0;)Z", "layoutNode", "Lj3/g;", "pointerPosition", "Lb4/u;", "hitTestResult", "isTouchEvent", "isInLayer", "Ljn0/h0;", "c", "(Lb4/g0;JLb4/u;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements f {
        b() {
        }

        @Override // b4.z0.f
        public int a() {
            return b1.a(8);
        }

        @Override // b4.z0.f
        public boolean b(androidx.compose.ui.d.c node) {
            return false;
        }

        @Override // b4.z0.f
        public void c(g0 layoutNode, long pointerPosition, u hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            layoutNode.z0(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // b4.z0.f
        public boolean d(g0 parentLayoutNode) {
            g4.l lVarH = parentLayoutNode.H();
            boolean z11 = false;
            if (lVarH != null && lVarH.getIsClearingSemantics()) {
                z11 = true;
            }
            return !z11;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/z0;", "coordinator", "Ljn0/h0;", "a", "(Lb4/z0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<z0, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f16336c = new c();

        c() {
            super(1);
        }

        public final void a(z0 z0Var) {
            i1 layer = z0Var.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(z0 z0Var) {
            a(z0Var);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb4/z0;", "coordinator", "Ljn0/h0;", "a", "(Lb4/z0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.l<z0, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f16337c = new d();

        d() {
            super(1);
        }

        public final void a(z0 z0Var) {
            if (z0Var.u0()) {
                z zVar = z0Var.layerPositionalProperties;
                if (zVar == null) {
                    z0.A3(z0Var, false, 1, null);
                    return;
                }
                z0.P.b(zVar);
                z0.A3(z0Var, false, 1, null);
                if (z0.P.c(zVar)) {
                    return;
                }
                g0 layoutNode = z0Var.getLayoutNode();
                l0 layoutDelegate = layoutNode.getLayoutDelegate();
                if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                        g0.u1(layoutNode, false, 1, null);
                    }
                    layoutDelegate.getMeasurePassDelegate().V1();
                }
                j1 owner = layoutNode.getOwner();
                if (owner != null) {
                    owner.d(layoutNode);
                }
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(z0 z0Var) {
            a(z0Var);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: b4.z0$e, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lb4/z0$e;", "", "<init>", "()V", "Lb4/z0$f;", "PointerInputSource", "Lb4/z0$f;", "a", "()Lb4/z0$f;", "SemanticsSource", "b", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Landroidx/compose/ui/graphics/d;", "graphicsLayerScope", "Landroidx/compose/ui/graphics/d;", "Lkotlin/Function1;", "Lb4/z0;", "Ljn0/h0;", "onCommitAffectingLayer", "Lwn0/l;", "onCommitAffectingLayerParams", "Lb4/z;", "tmpLayerPositionalProperties", "Lb4/z;", "Lk3/n3;", "tmpMatrix", "[F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return z0.R;
        }

        public final f b() {
            return z0.S;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H&ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lb4/z0$f;", "", "Lb4/b1;", "a", "()I", "Landroidx/compose/ui/d$c;", "node", "", "b", "(Landroidx/compose/ui/d$c;)Z", "Lb4/g0;", "parentLayoutNode", DateTokenConverter.CONVERTER_KEY, "(Lb4/g0;)Z", "layoutNode", "Lj3/g;", "pointerPosition", "Lb4/u;", "hitTestResult", "isTouchEvent", "isInLayer", "Ljn0/h0;", "c", "(Lb4/g0;JLb4/u;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface f {
        int a();

        boolean b(androidx.compose.ui.d.c node);

        void c(g0 layoutNode, long pointerPosition, u hitTestResult, boolean isTouchEvent, boolean isInLayer);

        boolean d(g0 parentLayoutNode);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk3/j1;", "canvas", "Ln3/c;", "parentLayer", "Ljn0/h0;", "a", "(Lk3/j1;Ln3/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.p<k3.j1, n3.c, jn0.h0> {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ z0 f16339c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ k3.j1 f16340d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ n3.c f16341e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z0 z0Var, k3.j1 j1Var, n3.c cVar) {
                super(0);
                this.f16339c = z0Var;
                this.f16340d = j1Var;
                this.f16341e = cVar;
            }

            public final void b() {
                this.f16339c.s2(this.f16340d, this.f16341e);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ jn0.h0 invoke() {
                b();
                return jn0.h0.f84049a;
            }
        }

        g() {
            super(2);
        }

        public final void a(k3.j1 j1Var, n3.c cVar) {
            if (!z0.this.getLayoutNode().y()) {
                z0.this.lastLayerDrawingWasSkipped = true;
            } else {
                z0.this.G2().i(z0.this, z0.N, new a(z0.this, j1Var, cVar));
                z0.this.lastLayerDrawingWasSkipped = false;
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(k3.j1 j1Var, n3.c cVar) {
            a(j1Var, cVar);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d.c f16343d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f16344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f16345f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ u f16346g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f16347h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f16348i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(androidx.compose.ui.d.c cVar, f fVar, long j11, u uVar, boolean z11, boolean z12) {
            super(0);
            this.f16343d = cVar;
            this.f16344e = fVar;
            this.f16345f = j11;
            this.f16346g = uVar;
            this.f16347h = z11;
            this.f16348i = z12;
        }

        public final void b() {
            z0.this.O2(a1.b(this.f16343d, this.f16344e.a(), b1.a(2)), this.f16344e, this.f16345f, this.f16346g, this.f16347h, this.f16348i);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d.c f16350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f16351e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f16352f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ u f16353g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f16354h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f16355i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f16356j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.ui.d.c cVar, f fVar, long j11, u uVar, boolean z11, boolean z12, float f11) {
            super(0);
            this.f16350d = cVar;
            this.f16351e = fVar;
            this.f16352f = j11;
            this.f16353g = uVar;
            this.f16354h = z11;
            this.f16355i = z12;
            this.f16356j = f11;
        }

        public final void b() {
            z0.this.P2(a1.b(this.f16350d, this.f16351e.a(), b1.a(2)), this.f16351e, this.f16352f, this.f16353g, this.f16354h, this.f16355i, this.f16356j);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class j extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {
        j() {
            super(0);
        }

        public final void b() {
            z0 wrappedBy = z0.this.getWrappedBy();
            if (wrappedBy != null) {
                wrappedBy.S2();
            }
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d.c f16359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f16360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f16361f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ u f16362g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f16363h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f16364i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f16365j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(androidx.compose.ui.d.c cVar, f fVar, long j11, u uVar, boolean z11, boolean z12, float f11) {
            super(0);
            this.f16359d = cVar;
            this.f16360e = fVar;
            this.f16361f = j11;
            this.f16362g = uVar;
            this.f16363h = z11;
            this.f16364i = z12;
            this.f16365j = f11;
        }

        public final void b() {
            z0.this.q3(a1.b(this.f16359d, this.f16360e.a(), b1.a(2)), this.f16360e, this.f16361f, this.f16362g, this.f16363h, this.f16364i, this.f16365j);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
    static final class l extends p013kotlin.jvm.internal.u implements wn0.a<jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<androidx.compose.ui.graphics.c, jn0.h0> f16366c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> lVar) {
            super(0);
            this.f16366c = lVar;
        }

        public final void b() {
            this.f16366c.invoke(z0.O);
            z0.O.b0();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ jn0.h0 invoke() {
            b();
            return jn0.h0.f84049a;
        }
    }

    public z0(g0 g0Var) {
        this.layoutNode = g0Var;
    }

    static /* synthetic */ void A3(z0 z0Var, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        z0Var.z3(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l1 G2() {
        return k0.b(getLayoutNode()).getSnapshotObserver();
    }

    private final boolean L2(int type) {
        androidx.compose.ui.d.c cVarN2 = N2(c1.i(type));
        return cVarN2 != null && b4.k.e(cVarN2, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.d.c N2(boolean includeTail) {
        androidx.compose.ui.d.c cVarH2;
        if (getLayoutNode().l0() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (!includeTail) {
            z0 z0Var = this.wrappedBy;
            if (z0Var != null) {
                return z0Var.H2();
            }
            return null;
        }
        z0 z0Var2 = this.wrappedBy;
        if (z0Var2 == null || (cVarH2 = z0Var2.H2()) == null) {
            return null;
        }
        return cVarH2.getChild();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O2(androidx.compose.ui.d.c cVar, f fVar, long j11, u uVar, boolean z11, boolean z12) {
        if (cVar == null) {
            R2(fVar, j11, uVar, z11, z12);
        } else {
            uVar.p(cVar, z12, new h(cVar, fVar, j11, uVar, z11, z12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P2(androidx.compose.ui.d.c cVar, f fVar, long j11, u uVar, boolean z11, boolean z12, float f11) {
        if (cVar == null) {
            R2(fVar, j11, uVar, z11, z12);
        } else {
            uVar.q(cVar, f11, z12, new i(cVar, fVar, j11, uVar, z11, z12, f11));
        }
    }

    private final long V2(long pointerPosition) {
        float fM = j3.g.m(pointerPosition);
        float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, fM < BitmapDescriptorFactory.HUE_RED ? -fM : fM - P0());
        float fN = j3.g.n(pointerPosition);
        return j3.h.a(fMax, Math.max(BitmapDescriptorFactory.HUE_RED, fN < BitmapDescriptorFactory.HUE_RED ? -fN : fN - N0()));
    }

    private final void e3(long position, float zIndex, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> layerBlock, n3.c explicitLayer) {
        if (explicitLayer != null) {
            if (!(layerBlock == null)) {
                y3.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != explicitLayer) {
                this.explicitLayer = null;
                y3(this, null, false, 2, null);
                this.explicitLayer = explicitLayer;
            }
            if (this.layer == null) {
                i1 i1VarF = k0.b(getLayoutNode()).f(this.drawBlock, this.invalidateParentLayer, explicitLayer);
                i1VarF.i(getMeasuredSize());
                i1VarF.m(position);
                this.layer = i1VarF;
                getLayoutNode().B1(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                y3(this, null, false, 2, null);
            }
            y3(this, layerBlock, false, 2, null);
        }
        if (!w4.n.g(getPosition(), position)) {
            m3(position);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().V1();
            i1 i1Var = this.layer;
            if (i1Var != null) {
                i1Var.m(position);
            } else {
                z0 z0Var = this.wrappedBy;
                if (z0Var != null) {
                    z0Var.S2();
                }
            }
            J1(this);
            j1 owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.r(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
        if (getIsPlacingForAlignment()) {
            return;
        }
        n1(x1());
    }

    public static /* synthetic */ void h3(z0 z0Var, MutableRect mutableRect, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        z0Var.g3(mutableRect, z11, z12);
    }

    private final void m2(z0 ancestor, MutableRect rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        z0 z0Var = this.wrappedBy;
        if (z0Var != null) {
            z0Var.m2(ancestor, rect, clipBounds);
        }
        x2(rect, clipBounds);
    }

    private final long n2(z0 ancestor, long offset, boolean includeMotionFrameOfReference) {
        if (ancestor == this) {
            return offset;
        }
        z0 z0Var = this.wrappedBy;
        return (z0Var == null || p013kotlin.jvm.internal.s.f(ancestor, z0Var)) ? v2(offset, includeMotionFrameOfReference) : v2(z0Var.n2(ancestor, offset, includeMotionFrameOfReference), includeMotionFrameOfReference);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q3(androidx.compose.ui.d.c cVar, f fVar, long j11, u uVar, boolean z11, boolean z12, float f11) {
        if (cVar == null) {
            R2(fVar, j11, uVar, z11, z12);
        } else if (fVar.b(cVar)) {
            uVar.v(cVar, f11, z12, new k(cVar, fVar, j11, uVar, z11, z12, f11));
        } else {
            q3(a1.b(cVar, fVar.a(), b1.a(2)), fVar, j11, uVar, z11, z12, f11);
        }
    }

    private final z0 r3(z3.v vVar) {
        z0 z0VarA;
        z3.f0 f0Var = vVar instanceof z3.f0 ? (z3.f0) vVar : null;
        if (f0Var != null && (z0VarA = f0Var.a()) != null) {
            return z0VarA;
        }
        p013kotlin.jvm.internal.s.i(vVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (z0) vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s2(k3.j1 canvas, n3.c graphicsLayer) {
        androidx.compose.ui.d.c cVarM2 = M2(b1.a(4));
        if (cVarM2 == null) {
            d3(canvas, graphicsLayer);
        } else {
            getLayoutNode().a0().c(canvas, w4.s.d(e()), this, cVarM2, graphicsLayer);
        }
    }

    public static /* synthetic */ long t3(z0 z0Var, long j11, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return z0Var.s3(j11, z11);
    }

    private final void v3(z0 ancestor, float[] matrix) {
        if (p013kotlin.jvm.internal.s.f(ancestor, this)) {
            return;
        }
        z0 z0Var = this.wrappedBy;
        p013kotlin.jvm.internal.s.h(z0Var);
        z0Var.v3(ancestor, matrix);
        if (!w4.n.g(getPosition(), w4.n.INSTANCE.a())) {
            float[] fArr = Q;
            n3.j(fArr);
            n3.s(fArr, -w4.n.h(getPosition()), -w4.n.i(getPosition()), BitmapDescriptorFactory.HUE_RED, 4, null);
            n3.p(matrix, fArr);
        }
        i1 i1Var = this.layer;
        if (i1Var != null) {
            i1Var.l(matrix);
        }
    }

    public static /* synthetic */ long w2(z0 z0Var, long j11, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return z0Var.v2(j11, z11);
    }

    private final void w3(z0 ancestor, float[] matrix) {
        z0 z0Var = this;
        while (!p013kotlin.jvm.internal.s.f(z0Var, ancestor)) {
            i1 i1Var = z0Var.layer;
            if (i1Var != null) {
                i1Var.e(matrix);
            }
            long position = z0Var.getPosition();
            if (!w4.n.g(position, w4.n.INSTANCE.a())) {
                float[] fArr = Q;
                n3.j(fArr);
                n3.s(fArr, w4.n.h(position), w4.n.i(position), BitmapDescriptorFactory.HUE_RED, 4, null);
                n3.p(matrix, fArr);
            }
            z0Var = z0Var.wrappedBy;
            p013kotlin.jvm.internal.s.h(z0Var);
        }
    }

    private final void x2(MutableRect bounds, boolean clipBounds) {
        float fH = w4.n.h(getPosition());
        bounds.i(bounds.getLeft() - fH);
        bounds.j(bounds.getRight() - fH);
        float fI = w4.n.i(getPosition());
        bounds.k(bounds.getTop() - fI);
        bounds.h(bounds.getBottom() - fI);
        i1 i1Var = this.layer;
        if (i1Var != null) {
            i1Var.h(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.e(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.r.g(e()), w4.r.f(e()));
                bounds.f();
            }
        }
    }

    public static /* synthetic */ void y3(z0 z0Var, wn0.l lVar, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        z0Var.x3(lVar, z11);
    }

    private final void z3(boolean invokeOnLayoutChange) {
        j1 owner;
        if (this.explicitLayer != null) {
            return;
        }
        i1 i1Var = this.layer;
        if (i1Var == null) {
            if (this.layerBlock == null) {
                return;
            }
            y3.a.b("null layer with a non-null layerBlock");
            return;
        }
        wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> lVar = this.layerBlock;
        if (lVar == null) {
            y3.a.c("updateLayerParameters requires a non-null layerBlock");
            throw new KotlinNothingValueException();
        }
        androidx.compose.ui.graphics.d dVar = O;
        dVar.U();
        dVar.V(getLayoutNode().getDensity());
        dVar.X(getLayoutNode().getLayoutDirection());
        dVar.a0(w4.s.d(e()));
        G2().i(this, M, new l(lVar));
        z zVar = this.layerPositionalProperties;
        if (zVar == null) {
            zVar = new z();
            this.layerPositionalProperties = zVar;
        }
        zVar.a(dVar);
        i1Var.k(dVar);
        this.isClipping = dVar.getClip();
        this.lastLayerAlpha = dVar.getAlpha();
        if (!invokeOnLayoutChange || (owner = getLayoutNode().getOwner()) == null) {
            return;
        }
        owner.r(getLayoutNode());
    }

    /* JADX INFO: renamed from: A2, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    public final long B2() {
        return getMeasurementConstraints();
    }

    protected final boolean B3(long pointerPosition) {
        if (!j3.h.b(pointerPosition)) {
            return false;
        }
        i1 i1Var = this.layer;
        return i1Var == null || !this.isClipping || i1Var.j(pointerPosition);
    }

    /* JADX INFO: renamed from: C2, reason: from getter */
    public final i1 getLayer() {
        return this.layer;
    }

    @Override // z3.v
    public long D(z3.v sourceCoordinates, long relativeToSource) {
        return f0(sourceCoordinates, relativeToSource, true);
    }

    /* JADX INFO: renamed from: D2 */
    public abstract q0 getLookaheadDelegate();

    public final long E2() {
        return this.layerDensity.C(getLayoutNode().getViewConfiguration().g());
    }

    @Override // z3.v
    public j3.i F(z3.v sourceCoordinates, boolean clipBounds) {
        if (!b0()) {
            y3.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!sourceCoordinates.b0()) {
            y3.a.b("LayoutCoordinates " + sourceCoordinates + " is not attached!");
        }
        z0 z0VarR3 = r3(sourceCoordinates);
        z0VarR3.W2();
        z0 z0VarU2 = u2(z0VarR3);
        MutableRect mutableRectF2 = F2();
        mutableRectF2.i(BitmapDescriptorFactory.HUE_RED);
        mutableRectF2.k(BitmapDescriptorFactory.HUE_RED);
        mutableRectF2.j(w4.r.g(sourceCoordinates.e()));
        mutableRectF2.h(w4.r.f(sourceCoordinates.e()));
        z0 z0Var = z0VarR3;
        while (z0Var != z0VarU2) {
            boolean z11 = clipBounds;
            h3(z0Var, mutableRectF2, z11, false, 4, null);
            if (mutableRectF2.f()) {
                return j3.i.INSTANCE.a();
            }
            z0Var = z0Var.wrappedBy;
            p013kotlin.jvm.internal.s.h(z0Var);
            clipBounds = z11;
        }
        m2(z0VarU2, mutableRectF2, clipBounds);
        return j3.f.a(mutableRectF2);
    }

    @Override // b4.p0
    /* JADX INFO: renamed from: F1, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    protected final MutableRect F2() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    @Override // z3.v
    public void G(z3.v sourceCoordinates, float[] matrix) {
        z0 z0VarR3 = r3(sourceCoordinates);
        z0VarR3.W2();
        z0 z0VarU2 = u2(z0VarR3);
        n3.j(matrix);
        z0VarR3.w3(z0VarU2, matrix);
        v3(z0VarU2, matrix);
    }

    public abstract androidx.compose.ui.d.c H2();

    /* JADX INFO: renamed from: I2, reason: from getter */
    public final z0 getWrapped() {
        return this.wrapped;
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final z0 getWrappedBy() {
        return this.wrappedBy;
    }

    @Override // z3.v
    public long K(long relativeToLocal) {
        return k0.b(getLayoutNode()).m(P(relativeToLocal));
    }

    /* JADX INFO: renamed from: K2, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    @Override // z3.v
    public final z3.v M() {
        if (!b0()) {
            y3.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        W2();
        return getLayoutNode().l0().wrappedBy;
    }

    @Override // w4.l
    /* JADX INFO: renamed from: M1 */
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    public final androidx.compose.ui.d.c M2(int type) {
        boolean zI = c1.i(type);
        androidx.compose.ui.d.c cVarH2 = H2();
        if (!zI && (cVarH2 = cVarH2.getParent()) == null) {
            return null;
        }
        for (androidx.compose.ui.d.c cVarN2 = N2(zI); cVarN2 != null && (cVarN2.getAggregateChildKindSet() & type) != 0; cVarN2 = cVarN2.getChild()) {
            if ((cVarN2.getKindSet() & type) != 0) {
                return cVarN2;
            }
            if (cVarN2 == cVarH2) {
                return null;
            }
        }
        return null;
    }

    @Override // z3.v
    public long P(long relativeToLocal) {
        if (!b0()) {
            y3.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        W2();
        long jT3 = relativeToLocal;
        for (z0 z0Var = this; z0Var != null; z0Var = z0Var.wrappedBy) {
            jT3 = t3(z0Var, jT3, false, 2, null);
        }
        return jT3;
    }

    public final void Q2(f hitTestSource, long pointerPosition, u hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        androidx.compose.ui.d.c cVarM2 = M2(hitTestSource.a());
        if (!B3(pointerPosition)) {
            if (isTouchEvent) {
                float fP2 = p2(pointerPosition, E2());
                if (Float.isInfinite(fP2) || Float.isNaN(fP2) || !hitTestResult.s(fP2, false)) {
                    return;
                }
                P2(cVarM2, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, false, fP2);
                return;
            }
            return;
        }
        if (cVarM2 == null) {
            R2(hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        if (T2(pointerPosition)) {
            O2(cVarM2, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        float fP3 = !isTouchEvent ? Float.POSITIVE_INFINITY : p2(pointerPosition, E2());
        if (Float.isInfinite(fP3) || Float.isNaN(fP3) || !hitTestResult.s(fP3, isInLayer)) {
            q3(cVarM2, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fP3);
        } else {
            P2(cVarM2, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fP3);
        }
    }

    public void R2(f hitTestSource, long pointerPosition, u hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        z0 z0Var = this.wrapped;
        if (z0Var != null) {
            z0Var.Q2(hitTestSource, w2(z0Var, pointerPosition, false, 2, null), hitTestResult, isTouchEvent, isInLayer);
        }
    }

    public void S2() {
        i1 i1Var = this.layer;
        if (i1Var != null) {
            i1Var.invalidate();
            return;
        }
        z0 z0Var = this.wrappedBy;
        if (z0Var != null) {
            z0Var.S2();
        }
    }

    protected final boolean T2(long pointerPosition) {
        float fM = j3.g.m(pointerPosition);
        float fN = j3.g.n(pointerPosition);
        return fM >= BitmapDescriptorFactory.HUE_RED && fN >= BitmapDescriptorFactory.HUE_RED && fM < ((float) P0()) && fN < ((float) N0());
    }

    public final boolean U2() {
        if (this.layer != null && this.lastLayerAlpha <= BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        z0 z0Var = this.wrappedBy;
        if (z0Var != null) {
            return z0Var.U2();
        }
        return false;
    }

    @Override // b4.p0
    public void V1() {
        n3.c cVar = this.explicitLayer;
        if (cVar != null) {
            X0(getPosition(), this.zIndex, cVar);
        } else {
            Y0(getPosition(), this.zIndex, this.layerBlock);
        }
    }

    public final void W2() {
        getLayoutNode().getLayoutDelegate().S();
    }

    @Override // z3.v
    public final z3.v X() {
        if (!b0()) {
            y3.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        W2();
        return this.wrappedBy;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.w0
    public void X0(long position, float zIndex, n3.c layer) {
        if (!this.forcePlaceWithLookaheadOffset) {
            e3(position, zIndex, null, layer);
            return;
        }
        q0 q0VarD2 = getLookaheadDelegate();
        p013kotlin.jvm.internal.s.h(q0VarD2);
        e3(q0VarD2.getPosition(), zIndex, null, layer);
    }

    public void X2() {
        i1 i1Var = this.layer;
        if (i1Var != null) {
            i1Var.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z3.w0
    public void Y0(long position, float zIndex, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> layerBlock) {
        if (!this.forcePlaceWithLookaheadOffset) {
            e3(position, zIndex, layerBlock, null);
            return;
        }
        q0 q0VarD2 = getLookaheadDelegate();
        p013kotlin.jvm.internal.s.h(q0VarD2);
        e3(q0VarD2.getPosition(), zIndex, layerBlock, null);
    }

    public final void Y2() {
        x3(this.layerBlock, true);
        i1 i1Var = this.layer;
        if (i1Var != null) {
            i1Var.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    protected void Z2(int width, int height) {
        z0 z0Var;
        i1 i1Var = this.layer;
        if (i1Var != null) {
            i1Var.i(w4.s.a(width, height));
        } else if (getLayoutNode().y() && (z0Var = this.wrappedBy) != null) {
            z0Var.S2();
        }
        a1(w4.s.a(width, height));
        if (this.layerBlock != null) {
            z3(false);
        }
        int iA = b1.a(4);
        boolean zI = c1.i(iA);
        androidx.compose.ui.d.c cVarH2 = H2();
        if (zI || (cVarH2 = cVarH2.getParent()) != null) {
            for (androidx.compose.ui.d.c cVarN2 = N2(zI); cVarN2 != null && (cVarN2.getAggregateChildKindSet() & iA) != 0; cVarN2 = cVarN2.getChild()) {
                if ((cVarN2.getKindSet() & iA) != 0) {
                    androidx.compose.ui.d.c cVarG = cVarN2;
                    t2.b bVar = null;
                    while (cVarG != 0) {
                        if (cVarG instanceof r) {
                            ((r) cVarG).A0();
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
                        cVarG = b4.k.g(bVar);
                    }
                }
                if (cVarN2 == cVarH2) {
                    break;
                }
            }
        }
        j1 owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.r(getLayoutNode());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final void a3() {
        androidx.compose.ui.d.c parent;
        if (L2(b1.a(128))) {
            androidx.compose.runtime.snapshots.g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            wn0.l<Object, jn0.h0> lVarH = gVarD != null ? gVarD.h() : null;
            androidx.compose.runtime.snapshots.g gVarF = companion.f(gVarD);
            try {
                int iA = b1.a(128);
                boolean zI = c1.i(iA);
                if (!zI) {
                    parent = H2().getParent();
                    if (parent == null) {
                    }
                    jn0.h0 h0Var = jn0.h0.f84049a;
                }
                parent = H2();
                for (androidx.compose.ui.d.c cVarN2 = N2(zI); cVarN2 != null && (cVarN2.getAggregateChildKindSet() & iA) != 0; cVarN2 = cVarN2.getChild()) {
                    if ((cVarN2.getKindSet() & iA) != 0) {
                        t2.b bVar = null;
                        androidx.compose.ui.d.c cVarG = cVarN2;
                        while (cVarG != 0) {
                            if (cVarG instanceof a0) {
                                ((a0) cVarG).D(getMeasuredSize());
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
                            cVarG = b4.k.g(bVar);
                        }
                    }
                    if (cVarN2 == parent) {
                        break;
                    }
                }
                jn0.h0 h0Var2 = jn0.h0.f84049a;
            } finally {
                companion.m(gVarD, gVarF, lVarH);
            }
        }
    }

    @Override // z3.v
    public boolean b0() {
        return H2().getIsAttached();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void b3() {
        int iA = b1.a(128);
        boolean zI = c1.i(iA);
        androidx.compose.ui.d.c cVarH2 = H2();
        if (!zI && (cVarH2 = cVarH2.getParent()) == null) {
            return;
        }
        for (androidx.compose.ui.d.c cVarN2 = N2(zI); cVarN2 != null && (cVarN2.getAggregateChildKindSet() & iA) != 0; cVarN2 = cVarN2.getChild()) {
            if ((cVarN2.getKindSet() & iA) != 0) {
                androidx.compose.ui.d.c cVarG = cVarN2;
                t2.b bVar = null;
                while (cVarG != 0) {
                    if (cVarG instanceof a0) {
                        ((a0) cVarG).K(this);
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
                    cVarG = b4.k.g(bVar);
                }
            }
            if (cVarN2 == cVarH2) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // z3.l0, z3.q
    /* JADX INFO: renamed from: c */
    public Object getParentData() {
        if (!getLayoutNode().getNodes().r(b1.a(64))) {
            return null;
        }
        H2();
        p013kotlin.jvm.internal.n0 n0Var = new p013kotlin.jvm.internal.n0();
        for (androidx.compose.ui.d.c tail = getLayoutNode().getNodes().getTail(); tail != null; tail = tail.getParent()) {
            if ((b1.a(64) & tail.getKindSet()) != 0) {
                int iA = b1.a(64);
                t2.b bVar = null;
                androidx.compose.ui.d.c cVarG = tail;
                while (cVarG != 0) {
                    if (cVarG instanceof m1) {
                        n0Var.f86529a = ((m1) cVarG).G(getLayoutNode().getDensity(), n0Var.f86529a);
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
                    cVarG = b4.k.g(bVar);
                }
            }
        }
        return n0Var.f86529a;
    }

    public final void c3() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        i3();
    }

    @Override // z3.v
    public long d0(long relativeToWindow) {
        if (!b0()) {
            y3.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        z3.v vVarD = z3.w.d(this);
        return D(vVarD, j3.g.q(k0.b(getLayoutNode()).j(relativeToWindow), z3.w.f(vVarD)));
    }

    public void d3(k3.j1 canvas, n3.c graphicsLayer) {
        z0 z0Var = this.wrapped;
        if (z0Var != null) {
            z0Var.q2(canvas, graphicsLayer);
        }
    }

    @Override // z3.v
    public final long e() {
        return getMeasuredSize();
    }

    @Override // z3.v
    public long f0(z3.v sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (sourceCoordinates instanceof z3.f0) {
            ((z3.f0) sourceCoordinates).a().W2();
            return j3.g.u(sourceCoordinates.f0(this, j3.g.u(relativeToSource), includeMotionFrameOfReference));
        }
        z0 z0VarR3 = r3(sourceCoordinates);
        z0VarR3.W2();
        z0 z0VarU2 = u2(z0VarR3);
        while (z0VarR3 != z0VarU2) {
            relativeToSource = z0VarR3.s3(relativeToSource, includeMotionFrameOfReference);
            z0VarR3 = z0VarR3.wrappedBy;
            p013kotlin.jvm.internal.s.h(z0VarR3);
        }
        return n2(z0VarU2, relativeToSource, includeMotionFrameOfReference);
    }

    public final void f3(long position, float zIndex, wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> layerBlock, n3.c layer) {
        e3(w4.n.l(position, getApparentToRealOffset()), zIndex, layerBlock, layer);
    }

    public final void g3(MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        i1 i1Var = this.layer;
        if (i1Var != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long jE2 = E2();
                    float fK = j3.m.k(jE2) / 2.0f;
                    float fI = j3.m.i(jE2) / 2.0f;
                    bounds.e(-fK, -fI, w4.r.g(e()) + fK, w4.r.f(e()) + fI);
                } else if (clipBounds) {
                    bounds.e(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.r.g(e()), w4.r.f(e()));
                }
                if (bounds.f()) {
                    return;
                }
            }
            i1Var.h(bounds, false);
        }
        float fH = w4.n.h(getPosition());
        bounds.i(bounds.getLeft() + fH);
        bounds.j(bounds.getRight() + fH);
        float fI2 = w4.n.i(getPosition());
        bounds.k(bounds.getTop() + fI2);
        bounds.h(bounds.getBottom() + fI2);
    }

    @Override // w4.d
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // z3.r
    public w4.t getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    public final void i3() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            y3(this, null, false, 2, null);
            g0.u1(getLayoutNode(), false, 1, null);
        }
    }

    public final void j3(boolean z11) {
        this.forceMeasureWithLookaheadConstraints = z11;
    }

    public final void k3(boolean z11) {
        this.forcePlaceWithLookaheadOffset = z11;
    }

    public void l3(z3.j0 j0Var) {
        z3.j0 j0Var2 = this._measureResult;
        if (j0Var != j0Var2) {
            this._measureResult = j0Var;
            if (j0Var2 == null || j0Var.getF126652a() != j0Var2.getF126652a() || j0Var.getF126653b() != j0Var2.getF126653b()) {
                Z2(j0Var.getF126652a(), j0Var.getF126653b());
            }
            Map<z3.a, Integer> map = this.oldAlignmentLines;
            if (((map == null || map.isEmpty()) && j0Var.q().isEmpty()) || p013kotlin.jvm.internal.s.f(j0Var.q(), this.oldAlignmentLines)) {
                return;
            }
            y2().getAlignmentLines().m();
            Map linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(j0Var.q());
        }
    }

    protected void m3(long j11) {
        this.position = j11;
    }

    @Override // z3.v
    public long n(long relativeToScreen) {
        if (!b0()) {
            y3.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return D(z3.w.d(this), k0.b(getLayoutNode()).n(relativeToScreen));
    }

    public final void n3(z0 z0Var) {
        this.wrapped = z0Var;
    }

    protected final long o2(long minimumTouchTargetSize) {
        return j3.n.a(Math.max(BitmapDescriptorFactory.HUE_RED, (j3.m.k(minimumTouchTargetSize) - P0()) / 2.0f), Math.max(BitmapDescriptorFactory.HUE_RED, (j3.m.i(minimumTouchTargetSize) - N0()) / 2.0f));
    }

    public final void o3(z0 z0Var) {
        this.wrappedBy = z0Var;
    }

    protected final float p2(long pointerPosition, long minimumTouchTargetSize) {
        if (P0() >= j3.m.k(minimumTouchTargetSize) && N0() >= j3.m.i(minimumTouchTargetSize)) {
            return Float.POSITIVE_INFINITY;
        }
        long jO2 = o2(minimumTouchTargetSize);
        float fK = j3.m.k(jO2);
        float fI = j3.m.i(jO2);
        long jV2 = V2(pointerPosition);
        if ((fK > BitmapDescriptorFactory.HUE_RED || fI > BitmapDescriptorFactory.HUE_RED) && j3.g.m(jV2) <= fK && j3.g.n(jV2) <= fI) {
            return j3.g.l(jV2);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public final boolean p3() {
        /*
            r11 = this;
            r0 = 16
            int r1 = b4.b1.a(r0)
            boolean r1 = b4.c1.i(r1)
            androidx.compose.ui.d$c r1 = r11.N2(r1)
            r2 = 0
            if (r1 != 0) goto L12
            return r2
        L12:
            boolean r3 = r1.getIsAttached()
            if (r3 == 0) goto L98
            int r3 = b4.b1.a(r0)
            androidx.compose.ui.d$c r4 = r1.getNode()
            boolean r4 = r4.getIsAttached()
            if (r4 != 0) goto L2b
            java.lang.String r4 = "visitLocalDescendants called on an unattached node"
            y3.a.b(r4)
        L2b:
            androidx.compose.ui.d$c r1 = r1.getNode()
            int r4 = r1.getAggregateChildKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto L98
        L36:
            if (r1 == 0) goto L98
            int r4 = r1.getKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto L93
            r4 = 0
            r5 = r1
            r6 = r4
        L42:
            if (r5 == 0) goto L93
            boolean r7 = r5 instanceof b4.p1
            r8 = 1
            if (r7 == 0) goto L52
            b4.p1 r5 = (b4.p1) r5
            boolean r5 = r5.R1()
            if (r5 == 0) goto L8e
            return r8
        L52:
            int r7 = r5.getKindSet()
            r7 = r7 & r3
            if (r7 == 0) goto L8e
            boolean r7 = r5 instanceof b4.m
            if (r7 == 0) goto L8e
            r7 = r5
            b4.m r7 = (b4.m) r7
            androidx.compose.ui.d$c r7 = r7.getDelegate()
            r9 = r2
        L65:
            if (r7 == 0) goto L8b
            int r10 = r7.getKindSet()
            r10 = r10 & r3
            if (r10 == 0) goto L86
            int r9 = r9 + 1
            if (r9 != r8) goto L74
            r5 = r7
            goto L86
        L74:
            if (r6 != 0) goto L7d
            t2.b r6 = new t2.b
            androidx.compose.ui.d$c[] r10 = new androidx.compose.ui.d.c[r0]
            r6.<init>(r10, r2)
        L7d:
            if (r5 == 0) goto L83
            r6.b(r5)
            r5 = r4
        L83:
            r6.b(r7)
        L86:
            androidx.compose.ui.d$c r7 = r7.getChild()
            goto L65
        L8b:
            if (r9 != r8) goto L8e
            goto L42
        L8e:
            androidx.compose.ui.d$c r5 = b4.k.b(r6)
            goto L42
        L93:
            androidx.compose.ui.d$c r1 = r1.getChild()
            goto L36
        L98:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.z0.p3():boolean");
    }

    @Override // z3.v
    public void q0(float[] matrix) {
        j1 j1VarB = k0.b(getLayoutNode());
        w3(r3(z3.w.d(this)), matrix);
        j1VarB.o(matrix);
    }

    @Override // b4.p0
    public p0 q1() {
        return this.wrapped;
    }

    public final void q2(k3.j1 canvas, n3.c graphicsLayer) {
        i1 i1Var = this.layer;
        if (i1Var != null) {
            i1Var.f(canvas, graphicsLayer);
            return;
        }
        float fH = w4.n.h(getPosition());
        float fI = w4.n.i(getPosition());
        canvas.c(fH, fI);
        s2(canvas, graphicsLayer);
        canvas.c(-fH, -fI);
    }

    protected final void r2(k3.j1 canvas, r3 paint) {
        canvas.y(new j3.i(0.5f, 0.5f, w4.r.g(getMeasuredSize()) - 0.5f, w4.r.f(getMeasuredSize()) - 0.5f), paint);
    }

    public long s3(long position, boolean includeMotionFrameOfReference) {
        i1 i1Var = this.layer;
        if (i1Var != null) {
            position = i1Var.g(position, false);
        }
        return (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) ? w4.o.c(position, getPosition()) : position;
    }

    public abstract void t2();

    @Override // b4.k1
    public boolean u0() {
        return (this.layer == null || this.released || !getLayoutNode().K0()) ? false : true;
    }

    @Override // b4.p0
    public boolean u1() {
        return this._measureResult != null;
    }

    public final z0 u2(z0 other) {
        g0 layoutNode = other.getLayoutNode();
        g0 layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            androidx.compose.ui.d.c cVarH2 = other.H2();
            androidx.compose.ui.d.c cVarH3 = H2();
            int iA = b1.a(2);
            if (!cVarH3.getNode().getIsAttached()) {
                y3.a.b("visitLocalAncestors called on an unattached node");
            }
            for (androidx.compose.ui.d.c parent = cVarH3.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & iA) != 0 && parent == cVarH2) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.n0();
            p013kotlin.jvm.internal.s.h(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.n0();
            p013kotlin.jvm.internal.s.h(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.n0();
            layoutNode2 = layoutNode2.n0();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 != getLayoutNode()) {
            if (layoutNode != other.getLayoutNode()) {
                return layoutNode.O();
            }
            return other;
        }
        return this;
    }

    public final j3.i u3() {
        if (!b0()) {
            return j3.i.INSTANCE.a();
        }
        z3.v vVarD = z3.w.d(this);
        MutableRect mutableRectF2 = F2();
        long jO2 = o2(E2());
        mutableRectF2.i(-j3.m.k(jO2));
        mutableRectF2.k(-j3.m.i(jO2));
        mutableRectF2.j(P0() + j3.m.k(jO2));
        mutableRectF2.h(N0() + j3.m.i(jO2));
        z0 z0Var = this;
        while (z0Var != vVarD) {
            z0Var.g3(mutableRectF2, false, true);
            if (mutableRectF2.f()) {
                return j3.i.INSTANCE.a();
            }
            z0Var = z0Var.wrappedBy;
            p013kotlin.jvm.internal.s.h(z0Var);
        }
        return j3.f.a(mutableRectF2);
    }

    @Override // b4.p0
    /* JADX INFO: renamed from: v1, reason: from getter */
    public g0 getLayoutNode() {
        return this.layoutNode;
    }

    public long v2(long position, boolean includeMotionFrameOfReference) {
        if (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) {
            position = w4.o.b(position, getPosition());
        }
        i1 i1Var = this.layer;
        return i1Var != null ? i1Var.g(position, true) : position;
    }

    @Override // b4.p0
    public z3.j0 x1() {
        z3.j0 j0Var = this._measureResult;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public final void x3(wn0.l<? super androidx.compose.ui.graphics.c, jn0.h0> layerBlock, boolean forceUpdateLayerParameters) {
        j1 owner;
        if (!(layerBlock == null || this.explicitLayer == null)) {
            y3.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        g0 layoutNode = getLayoutNode();
        boolean z11 = (!forceUpdateLayerParameters && this.layerBlock == layerBlock && p013kotlin.jvm.internal.s.f(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (!layoutNode.K0() || layerBlock == null) {
            this.layerBlock = null;
            i1 i1Var = this.layer;
            if (i1Var != null) {
                i1Var.destroy();
                layoutNode.B1(true);
                this.invalidateParentLayer.invoke();
                if (b0() && (owner = layoutNode.getOwner()) != null) {
                    owner.r(layoutNode);
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        this.layerBlock = layerBlock;
        if (this.layer != null) {
            if (z11) {
                A3(this, false, 1, null);
                return;
            }
            return;
        }
        i1 i1VarI = j1.i(k0.b(layoutNode), this.drawBlock, this.invalidateParentLayer, null, 4, null);
        i1VarI.i(getMeasuredSize());
        i1VarI.m(getPosition());
        this.layer = i1VarI;
        A3(this, false, 1, null);
        layoutNode.B1(true);
        this.invalidateParentLayer.invoke();
    }

    @Override // b4.p0
    public p0 y1() {
        return this.wrappedBy;
    }

    public b4.b y2() {
        return getLayoutNode().getLayoutDelegate().r();
    }

    /* JADX INFO: renamed from: z2, reason: from getter */
    public final boolean getForceMeasureWithLookaheadConstraints() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    @Override // b4.p0
    public z3.v t1() {
        return this;
    }
}
