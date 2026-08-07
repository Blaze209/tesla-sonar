package v2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.a2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u0012\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b \u0010!JA\u0010&\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b&\u0010'JA\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010+J?\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010,\u001a\u00020\n2\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070-H\u0002¢\u0006\u0004\b/\u00100JG\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0014\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0006H\u0002¢\u0006\u0004\b3\u00104JO\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0014\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060-H\u0002¢\u0006\u0004\b6\u00107J1\u00109\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b9\u0010:JI\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J]\u0010D\u001a\u00020%2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?2\u0006\u00108\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bD\u0010EJW\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010F\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bG\u0010HJm\u0010K\u001a\u00020%2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?2\u0006\u00108\u001a\u00020\n2\u000e\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010J\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bM\u0010NJ;\u0010O\u001a\u0004\u0018\u00010\u00072\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bO\u0010PJ?\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010Q\u001a\u00020;H\u0002¢\u0006\u0004\bR\u0010SJ1\u0010T\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\bT\u0010UJA\u0010V\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u0010Q\u001a\u00020;H\u0002¢\u0006\u0004\bV\u0010SJ#\u0010\u0001\u001a\u00020\u00152\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150WH\u0002¢\u0006\u0004\b\u0001\u0010YJ1\u0010Z\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\bZ\u0010\u001cJ7\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00108\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b[\u0010\\J3\u0010_\u001a\u00020\n2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W2\u0006\u0010]\u001a\u00020\n2\u0006\u0010^\u001a\u00020;H\u0002¢\u0006\u0004\b_\u0010`JC\u0010b\u001a\u00020\n2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010a\u001a\u00020\n2\u0006\u0010^\u001a\u00020;H\u0002¢\u0006\u0004\bb\u0010cJw\u0010g\u001a\u00020\n2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010a\u001a\u00020\n2\u0006\u0010d\u001a\u00020\n2\u0006\u0010^\u001a\u00020;2\u0014\u0010f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060e2\u0014\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060eH\u0002¢\u0006\u0004\bg\u0010hJG\u0010j\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010M\u001a\u00028\u00002\u0006\u0010i\u001a\u00020;H\u0002¢\u0006\u0004\bj\u0010>J%\u0010l\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060k2\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\nH\u0000¢\u0006\u0004\bn\u0010\u000fJ\u0015\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\bq\u0010rJ\u001d\u0010s\u001a\u00020\u00152\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\bs\u0010tJ\u001f\u0010q\u001a\u00020%2\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\bq\u0010uJ%\u0010s\u001a\u00020\u00152\u0006\u00108\u001a\u00020\n2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\bs\u0010vJ\u0018\u0010w\u001a\u00028\u00002\u0006\u00108\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00028\u00002\u0006\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\by\u0010xJ\u001d\u0010z\u001a\u00020\u00152\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\bz\u0010tJ!\u0010{\u001a\u00020\u00152\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W¢\u0006\u0004\b{\u0010YJ \u0010|\u001a\u00028\u00002\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b|\u0010}J\u0017\u0010\u007f\u001a\b\u0012\u0004\u0012\u00028\u00000~H\u0096\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0081\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J \u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0081\u00012\u0006\u00108\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0082\u0001\u0010mR\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\"\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R \u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0087\u0001R%\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\by\u0010O\u001a\u0005\b\u0089\u0001\u0010\u000f\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008e\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bM\u0010\u008d\u0001R<\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0011\u0010\u008f\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0090\u0001\u0010\u0087\u0001\u001a\u0005\b\u0091\u0001\u0010!R8\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000f\u0010\u008f\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b\u0092\u0001\u0010\u0087\u0001\u001a\u0005\b\u0093\u0001\u0010!R&\u0010\u0010\u001a\u00020\n2\u0007\u0010\u008f\u0001\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\r\n\u0004\b/\u0010O\u001a\u0005\b\u0086\u0001\u0010\u000f¨\u0006\u0094\u0001"}, d2 = {"Lv2/f;", "E", "Lkotlin/collections/h;", "Lu2/e$a;", "Lu2/e;", "vector", "", "", "vectorRoot", "vectorTail", "", "rootShift", "<init>", "(Lu2/e;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "K", "()I", "size", "P", "(I)I", Gender.OTHER, "buffer", "", "p", "([Ljava/lang/Object;)Z", "r", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", "s", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", "u", "(Ljava/lang/Object;)[Ljava/lang/Object;", "t", "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "Ljn0/h0;", "A", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", "shift", "B", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", "h", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "rootSize", "buffers", "z", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "y", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "index", "o", "([Ljava/lang/Object;ILjava/lang/Object;)V", "Lv2/d;", "elementCarry", "n", "([Ljava/lang/Object;IILjava/lang/Object;Lv2/d;)[Ljava/lang/Object;", "", "elements", "rightShift", "nullBuffers", "nextBuffer", "m", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", Gender.MALE, "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", Gender.NONE, "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "e", "(I)[Ljava/lang/Object;", "I", "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "H", "([Ljava/lang/Object;IILv2/d;)[Ljava/lang/Object;", "x", "([Ljava/lang/Object;II)V", "w", "Lkotlin/Function1;", "predicate", "(Lwn0/l;)Z", "J", "v", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "tailSize", "bufferRef", Gender.FEMALE, "(Lwn0/l;ILv2/d;)I", "bufferSize", "D", "(Lwn0/l;[Ljava/lang/Object;ILv2/d;)I", "toBufferSize", "", "recyclableBuffers", "C", "(Lwn0/l;[Ljava/lang/Object;IILv2/d;Ljava/util/List;Ljava/util/List;)I", "oldElementCarry", "L", "", "q", "(I)Ljava/util/ListIterator;", IntegerTokenConverter.CONVERTER_KEY, "build", "()Lu2/e;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/lang/Object;)V", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "removeAll", "G", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "a", "Lu2/e;", "b", "[Ljava/lang/Object;", "c", "k", "setRootShift$runtime_release", "(I)V", "Ly2/e;", "Ly2/e;", "ownership", "<set-?>", "f", "j", "g", "l", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f<E> extends p013kotlin.collections.h<E> implements u2.e.a<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private u2.e<? extends E> vector;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Object[] vectorRoot;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object[] vectorTail;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int rootShift;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private y2.e ownership = new y2.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Object[] root;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Object[] tail;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int size;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements wn0.l<E, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Collection<E> f117624c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Collection<? extends E> collection) {
            super(1);
            this.f117624c = collection;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // wn0.l
        public final Boolean invoke(E e11) {
            return Boolean.valueOf(this.f117624c.contains(e11));
        }
    }

    public f(u2.e<? extends E> eVar, Object[] objArr, Object[] objArr2, int i11) {
        this.vector = eVar;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i11;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final void A(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i11 = this.rootShift;
        if (size > (1 << i11)) {
            this.root = B(u(root), filledTail, this.rootShift + 5);
            this.tail = newTail;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (root == null) {
            this.root = filledTail;
            this.tail = newTail;
            this.size = size() + 1;
        } else {
            this.root = B(root, filledTail, i11);
            this.tail = newTail;
            this.size = size() + 1;
        }
    }

    private final Object[] B(Object[] root, Object[] tail, int shift) {
        int iA = l.a(size() - 1, shift);
        Object[] objArrR = r(root);
        if (shift == 5) {
            objArrR[iA] = tail;
            return objArrR;
        }
        objArrR[iA] = B((Object[]) objArrR[iA], tail, shift - 5);
        return objArrR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int C(wn0.l<? super E, Boolean> predicate, Object[] buffer, int bufferSize, int toBufferSize, d bufferRef, List<Object[]> recyclableBuffers, List<Object[]> buffers) {
        if (p(buffer)) {
            recyclableBuffers.add(buffer);
        }
        Object value = bufferRef.getValue();
        s.i(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        Object[] objArrRemove = objArr;
        for (int i11 = 0; i11 < bufferSize; i11++) {
            Object obj = buffer[i11];
            if (!predicate.invoke(obj).booleanValue()) {
                if (toBufferSize == 32) {
                    objArrRemove = !recyclableBuffers.isEmpty() ? recyclableBuffers.remove(recyclableBuffers.size() - 1) : t();
                    toBufferSize = 0;
                }
                objArrRemove[toBufferSize] = obj;
                toBufferSize++;
            }
        }
        bufferRef.b(objArrRemove);
        if (objArr != bufferRef.getValue()) {
            buffers.add(objArr);
        }
        return toBufferSize;
    }

    private final int D(wn0.l<? super E, Boolean> predicate, Object[] buffer, int bufferSize, d bufferRef) {
        Object[] objArrR = buffer;
        int i11 = bufferSize;
        boolean z11 = false;
        for (int i12 = 0; i12 < bufferSize; i12++) {
            Object obj = buffer[i12];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z11) {
                    objArrR = r(buffer);
                    z11 = true;
                    i11 = i12;
                }
            } else if (z11) {
                objArrR[i11] = obj;
                i11++;
            }
        }
        bufferRef.b(objArrR);
        return i11;
    }

    private final boolean E(wn0.l<? super E, Boolean> predicate) {
        Object[] objArrY;
        int iO = O();
        d dVar = new d(null);
        if (this.root == null) {
            return F(predicate, iO, dVar) != iO;
        }
        ListIterator<Object[]> listIteratorQ = q(0);
        int iD = 32;
        while (iD == 32 && listIteratorQ.hasNext()) {
            iD = D(predicate, listIteratorQ.next(), 32, dVar);
        }
        if (iD == 32) {
            y2.a.a(!listIteratorQ.hasNext());
            int iF = F(predicate, iO, dVar);
            if (iF == 0) {
                x(this.root, size(), this.rootShift);
            }
            return iF != iO;
        }
        int iPreviousIndex = listIteratorQ.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iC = iD;
        while (listIteratorQ.hasNext()) {
            iC = C(predicate, listIteratorQ.next(), 32, iC, dVar, arrayList2, arrayList);
        }
        int iC2 = C(predicate, this.tail, iO, iC, dVar, arrayList2, arrayList);
        Object value = dVar.getValue();
        s.i(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        n.z(objArr, null, iC2, 32);
        if (arrayList.isEmpty()) {
            objArrY = this.root;
            s.h(objArrY);
        } else {
            objArrY = y(this.root, iPreviousIndex, this.rootShift, arrayList.iterator());
        }
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.root = J(objArrY, size);
        this.tail = objArr;
        this.size = size + iC2;
        return true;
    }

    private final int F(wn0.l<? super E, Boolean> predicate, int tailSize, d bufferRef) {
        int iD = D(predicate, this.tail, tailSize, bufferRef);
        if (iD == tailSize) {
            y2.a.a(bufferRef.getValue() == this.tail);
            return tailSize;
        }
        Object value = bufferRef.getValue();
        s.i(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        n.z(objArr, null, iD, tailSize);
        this.tail = objArr;
        this.size = size() - (tailSize - iD);
        return iD;
    }

    private final Object[] H(Object[] root, int shift, int index, d tailCarry) {
        int iA = l.a(index, shift);
        if (shift == 0) {
            Object obj = root[iA];
            Object[] objArrP = n.p(root, r(root), iA, iA + 1, 32);
            objArrP[31] = tailCarry.getValue();
            tailCarry.b(obj);
            return objArrP;
        }
        int iA2 = root[31] == null ? l.a(K() - 1, shift) : 31;
        Object[] objArrR = r(root);
        int i11 = shift - 5;
        int i12 = iA + 1;
        if (i12 <= iA2) {
            while (true) {
                Object obj2 = objArrR[iA2];
                s.i(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrR[iA2] = H((Object[]) obj2, i11, 0, tailCarry);
                if (iA2 == i12) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrR[iA];
        s.i(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrR[iA] = H((Object[]) obj3, i11, index, tailCarry);
        return objArrR;
    }

    private final Object I(Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        y2.a.a(index < size);
        if (size == 1) {
            Object obj = this.tail[0];
            x(root, rootSize, shift);
            return obj;
        }
        Object[] objArr = this.tail;
        Object obj2 = objArr[index];
        Object[] objArrP = n.p(objArr, r(objArr), index, index + 1, size);
        objArrP[size - 1] = null;
        this.root = root;
        this.tail = objArrP;
        this.size = (rootSize + size) - 1;
        this.rootShift = shift;
        return obj2;
    }

    private final Object[] J(Object[] root, int size) {
        if (!((size & 31) == 0)) {
            a2.a("invalid size");
        }
        if (size == 0) {
            this.rootShift = 0;
            return null;
        }
        int i11 = size - 1;
        while (true) {
            int i12 = this.rootShift;
            if ((i11 >> i12) != 0) {
                return v(root, i11, i12);
            }
            this.rootShift = i12 - 5;
            Object[] objArr = root[0];
            s.i(objArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            root = objArr;
        }
    }

    private final int K() {
        if (size() <= 32) {
            return 0;
        }
        return l.d(size());
    }

    private final Object[] L(Object[] root, int shift, int index, E e11, d oldElementCarry) {
        int iA = l.a(index, shift);
        Object[] objArrR = r(root);
        if (shift != 0) {
            Object obj = objArrR[iA];
            s.i(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrR[iA] = L((Object[]) obj, shift - 5, index, e11, oldElementCarry);
            return objArrR;
        }
        if (objArrR != root) {
            ((AbstractList) this).modCount++;
        }
        oldElementCarry.b(objArrR[iA]);
        objArrR[iA] = e11;
        return objArrR;
    }

    private final Object[] M(int startLeafIndex, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator<Object[]> listIteratorQ = q(K() >> 5);
        while (listIteratorQ.previousIndex() != startLeafIndex) {
            Object[] objArrPrevious = listIteratorQ.previous();
            n.p(objArrPrevious, nextBuffer, 0, 32 - rightShift, 32);
            nextBuffer = s(objArrPrevious, rightShift);
            nullBuffers--;
            buffers[nullBuffers] = nextBuffer;
        }
        return listIteratorQ.previous();
    }

    private final void N(Collection<? extends E> elements, int index, Object[] startBuffer, int startBufferSize, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] objArrT;
        if (!(nullBuffers >= 1)) {
            a2.a("requires at least one nullBuffer");
        }
        Object[] objArrR = r(startBuffer);
        buffers[0] = objArrR;
        int i11 = index & 31;
        int size = ((index + elements.size()) - 1) & 31;
        int i12 = (startBufferSize - i11) + size;
        if (i12 < 32) {
            n.p(objArrR, nextBuffer, size + 1, i11, startBufferSize);
        } else {
            int i13 = i12 - 31;
            if (nullBuffers == 1) {
                objArrT = objArrR;
            } else {
                objArrT = t();
                nullBuffers--;
                buffers[nullBuffers] = objArrT;
            }
            int i14 = startBufferSize - i13;
            n.p(objArrR, nextBuffer, 0, i14, startBufferSize);
            n.p(objArrR, objArrT, size + 1, i11, i14);
            nextBuffer = objArrT;
        }
        Iterator<? extends E> it = elements.iterator();
        h(objArrR, i11, it);
        for (int i15 = 1; i15 < nullBuffers; i15++) {
            buffers[i15] = h(t(), 0, it);
        }
        h(nextBuffer, 0, it);
    }

    private final int O() {
        return P(size());
    }

    private final int P(int size) {
        return size <= 32 ? size : size - l.d(size);
    }

    private final Object[] e(int index) {
        if (K() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        s.h(objArr);
        for (int i11 = this.rootShift; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[l.a(index, i11)];
            s.i(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] h(Object[] buffer, int bufferIndex, Iterator<? extends Object> sourceIterator) {
        while (bufferIndex < 32 && sourceIterator.hasNext()) {
            buffer[bufferIndex] = sourceIterator.next();
            bufferIndex++;
        }
        return buffer;
    }

    private final void m(Collection<? extends E> elements, int index, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] objArr;
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        int i11 = index >> 5;
        Object[] objArrM = M(i11, rightShift, buffers, nullBuffers, nextBuffer);
        int iK = nullBuffers - (((K() >> 5) - 1) - i11);
        if (iK < nullBuffers) {
            Object[] objArr2 = buffers[iK];
            s.h(objArr2);
            objArr = objArr2;
        } else {
            objArr = nextBuffer;
        }
        N(elements, index, objArrM, 32, buffers, iK, objArr);
    }

    private final Object[] n(Object[] root, int shift, int index, Object element, d elementCarry) {
        Object obj;
        int iA = l.a(index, shift);
        if (shift == 0) {
            elementCarry.b(root[31]);
            Object[] objArrP = n.p(root, r(root), iA + 1, iA, 31);
            objArrP[iA] = element;
            return objArrP;
        }
        Object[] objArrR = r(root);
        int i11 = shift - 5;
        Object obj2 = objArrR[iA];
        s.i(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrR[iA] = n((Object[]) obj2, i11, index, element, elementCarry);
        while (true) {
            iA++;
            if (iA >= 32 || (obj = objArrR[iA]) == null) {
                break;
            }
            s.i(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrR[iA] = n((Object[]) obj, i11, 0, elementCarry.getValue(), elementCarry);
        }
        return objArrR;
    }

    private final void o(Object[] root, int index, E element) {
        int iO = O();
        Object[] objArrR = r(this.tail);
        if (iO < 32) {
            n.p(this.tail, objArrR, index + 1, index, iO);
            objArrR[index] = element;
            this.root = root;
            this.tail = objArrR;
            this.size = size() + 1;
            return;
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        n.p(objArr, objArrR, index + 1, index, 31);
        objArrR[index] = element;
        A(root, objArrR, u(obj));
    }

    private final boolean p(Object[] buffer) {
        return buffer.length == 33 && buffer[32] == this.ownership;
    }

    private final ListIterator<Object[]> q(int index) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iK = K() >> 5;
        y2.d.b(index, iK);
        int i11 = this.rootShift;
        return i11 == 0 ? new i(objArr, index) : new k(objArr, index, iK, i11 / 5);
    }

    private final Object[] r(Object[] buffer) {
        if (buffer == null) {
            return t();
        }
        return p(buffer) ? buffer : n.t(buffer, t(), 0, 0, bo0.n.j(buffer.length, 32), 6, null);
    }

    private final Object[] s(Object[] buffer, int distance) {
        return p(buffer) ? n.p(buffer, buffer, distance, 0, 32 - distance) : n.p(buffer, t(), distance, 0, 32 - distance);
    }

    private final Object[] t() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] u(Object element) {
        Object[] objArr = new Object[33];
        objArr[0] = element;
        objArr[32] = this.ownership;
        return objArr;
    }

    private final Object[] v(Object[] root, int index, int shift) {
        if (!(shift >= 0)) {
            a2.a("shift should be positive");
        }
        if (shift == 0) {
            return root;
        }
        int iA = l.a(index, shift);
        Object obj = root[iA];
        s.i(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objV = v((Object[]) obj, index, shift - 5);
        if (iA < 31) {
            int i11 = iA + 1;
            if (root[i11] != null) {
                if (p(root)) {
                    n.z(root, null, i11, 32);
                }
                root = n.p(root, t(), 0, 0, i11);
            }
        }
        if (objV == root[iA]) {
            return root;
        }
        Object[] objArrR = r(root);
        objArrR[iA] = objV;
        return objArrR;
    }

    private final Object[] w(Object[] root, int shift, int rootSize, d tailCarry) {
        Object[] objArrW;
        int iA = l.a(rootSize - 1, shift);
        if (shift == 5) {
            tailCarry.b(root[iA]);
            objArrW = null;
        } else {
            Object obj = root[iA];
            s.i(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrW = w((Object[]) obj, shift - 5, rootSize, tailCarry);
        }
        if (objArrW == null && iA == 0) {
            return null;
        }
        Object[] objArrR = r(root);
        objArrR[iA] = objArrW;
        return objArrR;
    }

    private final void x(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            this.root = null;
            if (root == null) {
                root = new Object[0];
            }
            this.tail = root;
            this.size = rootSize;
            this.rootShift = shift;
            return;
        }
        d dVar = new d(null);
        s.h(root);
        Object[] objArrW = w(root, shift, rootSize, dVar);
        s.h(objArrW);
        Object value = dVar.getValue();
        s.i(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = rootSize;
        if (objArrW[1] == null) {
            this.root = (Object[]) objArrW[0];
            this.rootShift = shift - 5;
        } else {
            this.root = objArrW;
            this.rootShift = shift;
        }
    }

    private final Object[] y(Object[] root, int rootSize, int shift, Iterator<Object[]> buffersIterator) {
        if (!buffersIterator.hasNext()) {
            a2.a("invalid buffersIterator");
        }
        if (!(shift >= 0)) {
            a2.a("negative shift");
        }
        if (shift == 0) {
            return buffersIterator.next();
        }
        Object[] objArrR = r(root);
        int iA = l.a(rootSize, shift);
        int i11 = shift - 5;
        objArrR[iA] = y((Object[]) objArrR[iA], rootSize, i11, buffersIterator);
        while (true) {
            iA++;
            if (iA >= 32 || !buffersIterator.hasNext()) {
                break;
            }
            objArrR[iA] = y((Object[]) objArrR[iA], 0, i11, buffersIterator);
        }
        return objArrR;
    }

    private final Object[] z(Object[] root, int rootSize, Object[][] buffers) {
        Iterator<Object[]> itA = p013kotlin.jvm.internal.c.a(buffers);
        int i11 = rootSize >> 5;
        int i12 = this.rootShift;
        Object[] objArrY = i11 < (1 << i12) ? y(root, rootSize, i12, itA) : r(root);
        while (itA.hasNext()) {
            this.rootShift += 5;
            objArrY = u(objArrY);
            int i13 = this.rootShift;
            y(objArrY, 1 << i13, i13, itA);
        }
        return objArrY;
    }

    public final boolean G(wn0.l<? super E, Boolean> predicate) {
        boolean zE = E(predicate);
        if (zE) {
            ((AbstractList) this).modCount++;
        }
        return zE;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        ((AbstractList) this).modCount++;
        int iO = O();
        if (iO < 32) {
            Object[] objArrR = r(this.tail);
            objArrR[iO] = element;
            this.tail = objArrR;
            this.size = size() + 1;
        } else {
            A(this.root, this.tail, u(element));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iO = O();
        Iterator<? extends E> it = elements.iterator();
        if (32 - iO >= elements.size()) {
            this.tail = h(r(this.tail), iO, it);
            this.size = size() + elements.size();
        } else {
            int size = ((elements.size() + iO) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = h(r(this.tail), iO, it);
            for (int i11 = 1; i11 < size; i11++) {
                objArr[i11] = h(t(), 0, it);
            }
            this.root = z(this.root, K(), objArr);
            this.tail = h(t(), 0, it);
            this.size = size() + elements.size();
        }
        return true;
    }

    @Override // p013kotlin.collections.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // u2.e.a
    public u2.e<E> build() {
        e eVar;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            eVar = this.vector;
        } else {
            this.ownership = new y2.e();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.root;
                s.h(objArr3);
                eVar = new e(objArr3, this.tail, size(), this.rootShift);
            } else if (objArr2.length == 0) {
                eVar = l.b();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.tail, size());
                s.j(objArrCopyOf, "copyOf(this, newSize)");
                eVar = new j(objArrCopyOf);
            }
        }
        this.vector = eVar;
        return (u2.e<E>) eVar;
    }

    @Override // p013kotlin.collections.h
    public E d(int index) {
        y2.d.a(index, size());
        ((AbstractList) this).modCount++;
        int iK = K();
        if (index >= iK) {
            return (E) I(this.root, iK, this.rootShift, index - iK);
        }
        d dVar = new d(this.tail[0]);
        Object[] objArr = this.root;
        s.h(objArr);
        I(H(objArr, this.rootShift, index, dVar), iK, this.rootShift, 0);
        return (E) dVar.getValue();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        y2.d.a(index, size());
        return (E) e(index)[index & 31];
    }

    public final int i() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Object[] getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getRootShift() {
        return this.rootShift;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Object[] getTail() {
        return this.tail;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        return G(new a(elements));
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        y2.d.a(index, size());
        if (K() > index) {
            d dVar = new d(null);
            Object[] objArr = this.root;
            s.h(objArr);
            this.root = L(objArr, this.rootShift, index, element, dVar);
            return (E) dVar.getValue();
        }
        Object[] objArrR = r(this.tail);
        if (objArrR != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i11 = index & 31;
        E e11 = (E) objArrR[i11];
        objArrR[i11] = element;
        this.tail = objArrR;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        y2.d.b(index, size());
        return new h(this, index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        y2.d.b(index, size());
        if (index == size()) {
            add(element);
            return;
        }
        ((AbstractList) this).modCount++;
        int iK = K();
        if (index >= iK) {
            o(this.root, index - iK, element);
            return;
        }
        d dVar = new d(null);
        Object[] objArr = this.root;
        s.h(objArr);
        o(n(objArr, this.rootShift, index, element, dVar), 0, dVar.getValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        f<E> fVar;
        Collection<? extends E> collection;
        Object[] objArrP;
        Object[][] objArr;
        y2.d.b(index, size());
        if (index == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (index >> 5) << 5;
        int size = (((size() - i11) + elements.size()) - 1) / 32;
        if (size == 0) {
            y2.a.a(index >= K());
            int i12 = index & 31;
            int size2 = ((index + elements.size()) - 1) & 31;
            Object[] objArr2 = this.tail;
            Object[] objArrP2 = n.p(objArr2, r(objArr2), size2 + 1, i12, O());
            h(objArrP2, i12, elements.iterator());
            this.tail = objArrP2;
            this.size = size() + elements.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iO = O();
        int iP = P(size() + elements.size());
        if (index >= K()) {
            objArrP = t();
            objArr = objArr3;
            fVar = this;
            collection = elements;
            fVar.N(collection, index, this.tail, iO, objArr, size, objArrP);
        } else {
            fVar = this;
            collection = elements;
            if (iP > iO) {
                int i13 = iP - iO;
                Object[] objArrS = s(fVar.tail, i13);
                fVar.m(collection, index, i13, objArr3, size, objArrS);
                objArr = objArr3;
                objArrP = objArrS;
            } else {
                int i14 = iO - iP;
                objArrP = n.p(fVar.tail, t(), 0, i14, iO);
                int i15 = 32 - i14;
                Object[] objArrS2 = s(fVar.tail, i15);
                int i16 = size - 1;
                objArr3[i16] = objArrS2;
                fVar.m(collection, index, i15, objArr3, i16, objArrS2);
                collection = collection;
                objArr = objArr3;
                fVar = fVar;
            }
        }
        fVar.root = z(fVar.root, i11, objArr);
        fVar.tail = objArrP;
        fVar.size = size() + collection.size();
        return true;
    }
}
