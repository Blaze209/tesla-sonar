package p013kotlin.collections;

import bo0.j;
import bo0.n;
import ho0.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.c;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\f\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a*\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\f\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0014\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0018\u001a\u00020\u0003*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001e\u0010\u001b\u001a)\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010!\u001a\u001b\u0010\"\u001a\u0004\u0018\u00010\u000f*\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010&\u001a\u0004\u0018\u00010%*\u00020$2\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'\u001a'\u0010(\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b(\u0010)\u001a\u0019\u0010*\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+\u001a\u0019\u0010,\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b¢\u0006\u0004\b,\u0010-\u001a\u0019\u0010.\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f¢\u0006\u0004\b.\u0010/\u001a\u0019\u00100\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0013¢\u0006\u0004\b0\u00101\u001a\u0019\u00102\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0017¢\u0006\u0004\b2\u00103\u001a\u001f\u00104\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b4\u0010\u001b\u001a'\u00105\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b5\u0010)\u001a\u0019\u00106\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0004\b6\u0010+\u001a\u0019\u00107\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f¢\u0006\u0004\b7\u0010/\u001a\u001f\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b8\u0010\u001b\u001a\u0011\u00109\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b9\u0010:\u001a!\u0010;\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b;\u0010\u001b\u001a-\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010<\u001a\u00020\u000f¢\u0006\u0004\b>\u0010?\u001a+\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000=\"\b\b\u0000\u0010\u0000*\u00020@*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\bA\u0010B\u001a?\u0010F\u001a\u00028\u0000\"\u0010\b\u0000\u0010D*\n\u0012\u0006\b\u0000\u0012\u00028\u00010C\"\b\b\u0001\u0010\u0000*\u00020@*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010E\u001a\u00028\u0000¢\u0006\u0004\bF\u0010G\u001a\u001f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00070=*\u00020\u00062\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010K\u001a\u001f\u0010N\u001a\b\u0012\u0004\u0012\u00020M0=*\u00020L2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bN\u0010O\u001a\u0019\u0010P\u001a\u00020\u0006*\u00020\u00062\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bP\u0010Q\u001a\u001f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00070=*\u00020\u00062\u0006\u0010<\u001a\u00020\u000f¢\u0006\u0004\bR\u0010S\u001a-\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010<\u001a\u00020\u000f¢\u0006\u0004\bT\u0010?\u001a\u001d\u0010V\u001a\u00020U\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bV\u0010W\u001a%\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bX\u0010B\u001aC\u0010\\\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010[\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Yj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`Z¢\u0006\u0004\b\\\u0010]\u001aA\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010[\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Yj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`Z¢\u0006\u0004\b^\u0010_\u001a9\u0010`\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010D*\n\u0012\u0006\b\u0000\u0012\u00028\u00000C*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010E\u001a\u00028\u0001¢\u0006\u0004\b`\u0010G\u001a+\u0010a\u001a\u00028\u0000\"\u0010\b\u0000\u0010D*\n\u0012\u0006\b\u0000\u0012\u00020\u000f0C*\u00020\u000e2\u0006\u0010E\u001a\u00028\u0000¢\u0006\u0004\ba\u0010b\u001a%\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bc\u0010B\u001a\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00070=*\u00020\u0006¢\u0006\u0004\bd\u0010e\u001a\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020\u000b0=*\u00020\n¢\u0006\u0004\bf\u0010g\u001a\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000f0=*\u00020\u000e¢\u0006\u0004\bh\u0010i\u001a\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00130=*\u00020\u0012¢\u0006\u0004\bj\u0010k\u001a\u0017\u0010l\u001a\b\u0012\u0004\u0012\u00020M0=*\u00020L¢\u0006\u0004\bl\u0010m\u001a\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020%0=*\u00020$¢\u0006\u0004\bn\u0010o\u001a\u0017\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00030=*\u00020p¢\u0006\u0004\bq\u0010r\u001a\u0017\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00170=*\u00020\u0016¢\u0006\u0004\bs\u0010t\u001a%\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000u\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bv\u0010B\u001a\u0017\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00070u*\u00020\u0006¢\u0006\u0004\bw\u0010e\u001a\u0017\u0010x\u001a\b\u0012\u0004\u0012\u00020\u000b0u*\u00020\n¢\u0006\u0004\bx\u0010g\u001a\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020\u000f0u*\u00020\u000e¢\u0006\u0004\by\u0010i\u001a\u0017\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00130u*\u00020\u0012¢\u0006\u0004\bz\u0010k\u001a\u0017\u0010{\u001a\b\u0012\u0004\u0012\u00020M0u*\u00020L¢\u0006\u0004\b{\u0010m\u001a\u0017\u0010|\u001a\b\u0012\u0004\u0012\u00020%0u*\u00020$¢\u0006\u0004\b|\u0010o\u001a\u0017\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00030u*\u00020p¢\u0006\u0004\b}\u0010r\u001a\u0017\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00170u*\u00020\u0016¢\u0006\u0004\b~\u0010t\u001a(\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u007f\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u001a\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u007f*\u00020\u000e¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001aK\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00028\u00010=\"\u0004\b\u0000\u0010\u0000\"\u0005\b\u0001\u0010\u0084\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0014\u0010\u0086\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0085\u0001H\u0086\bø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a0\u0010\u008b\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u008a\u00010\u0089\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a1\u0010\u008e\u0001\u001a\u0004\u0018\u00018\u0000\"\u000f\b\u0000\u0010\u0000*\t\u0012\u0004\u0012\u00028\u00000\u008d\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0018\u0010\u0090\u0001\u001a\u0004\u0018\u00010M*\u00020LH\u0007¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\u001aP\u0010\u0094\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0093\u00010=\"\u0004\b\u0000\u0010\u0000\"\u0005\b\u0001\u0010\u0084\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u000f\u0010\u0092\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0001H\u0086\u0004¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001\u001aB\u0010\u0096\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\u0093\u00010=\"\u0005\b\u0000\u0010\u0084\u0001*\u00020\u000e2\u000f\u0010\u0092\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0086\u0004¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\u001aO\u0010\u0098\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0093\u00010=\"\u0004\b\u0000\u0010\u0000\"\u0005\b\u0001\u0010\u0084\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u000e\u0010\u0092\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0089\u0001H\u0086\u0004¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0092\u0001\u0010¤\u0001\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u000f\b\u0001\u0010\u009c\u0001*\b0\u009a\u0001j\u0003`\u009b\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0007\u0010\u009d\u0001\u001a\u00028\u00012\n\b\u0002\u0010\u009f\u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010 \u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010¡\u0001\u001a\u00030\u009e\u00012\t\b\u0002\u0010¢\u0001\u001a\u00020\u000f2\n\b\u0002\u0010£\u0001\u001a\u00030\u009e\u00012\u0019\b\u0002\u0010\u0086\u0001\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u00010\u0085\u0001¢\u0006\u0006\b¤\u0001\u0010¥\u0001\u001a\u0084\u0001\u0010¦\u0001\u001a\u00028\u0000\"\u000f\b\u0000\u0010\u009c\u0001*\b0\u009a\u0001j\u0003`\u009b\u0001*\u00020\u00062\u0007\u0010\u009d\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u009f\u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010 \u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010¡\u0001\u001a\u00030\u009e\u00012\t\b\u0002\u0010¢\u0001\u001a\u00020\u000f2\n\b\u0002\u0010£\u0001\u001a\u00030\u009e\u00012\u0019\b\u0002\u0010\u0086\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u00010\u0085\u0001¢\u0006\u0006\b¦\u0001\u0010§\u0001\u001a\u0084\u0001\u0010¨\u0001\u001a\u00028\u0000\"\u000f\b\u0000\u0010\u009c\u0001*\b0\u009a\u0001j\u0003`\u009b\u0001*\u00020\u000e2\u0007\u0010\u009d\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u009f\u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010 \u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010¡\u0001\u001a\u00030\u009e\u00012\t\b\u0002\u0010¢\u0001\u001a\u00020\u000f2\n\b\u0002\u0010£\u0001\u001a\u00030\u009e\u00012\u0019\b\u0002\u0010\u0086\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u00010\u0085\u0001¢\u0006\u0006\b¨\u0001\u0010©\u0001\u001a\u0084\u0001\u0010ª\u0001\u001a\u00028\u0000\"\u000f\b\u0000\u0010\u009c\u0001*\b0\u009a\u0001j\u0003`\u009b\u0001*\u00020L2\u0007\u0010\u009d\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u009f\u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010 \u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010¡\u0001\u001a\u00030\u009e\u00012\t\b\u0002\u0010¢\u0001\u001a\u00020\u000f2\n\b\u0002\u0010£\u0001\u001a\u00030\u009e\u00012\u0019\b\u0002\u0010\u0086\u0001\u001a\u0012\u0012\u0004\u0012\u00020M\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u00010\u0085\u0001¢\u0006\u0006\bª\u0001\u0010«\u0001\u001a\u0084\u0001\u0010¬\u0001\u001a\u00028\u0000\"\u000f\b\u0000\u0010\u009c\u0001*\b0\u009a\u0001j\u0003`\u009b\u0001*\u00020\u00162\u0007\u0010\u009d\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u009f\u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010 \u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010¡\u0001\u001a\u00030\u009e\u00012\t\b\u0002\u0010¢\u0001\u001a\u00020\u000f2\n\b\u0002\u0010£\u0001\u001a\u00030\u009e\u00012\u0019\b\u0002\u0010\u0086\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u00010\u0085\u0001¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001\u001ay\u0010¯\u0001\u001a\u00030®\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u009f\u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010 \u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010¡\u0001\u001a\u00030\u009e\u00012\t\b\u0002\u0010¢\u0001\u001a\u00020\u000f2\n\b\u0002\u0010£\u0001\u001a\u00030\u009e\u00012\u0019\b\u0002\u0010\u0086\u0001\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u00010\u0085\u0001¢\u0006\u0006\b¯\u0001\u0010°\u0001\u001ak\u0010±\u0001\u001a\u00030®\u0001*\u00020\u00062\n\b\u0002\u0010\u009f\u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010 \u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010¡\u0001\u001a\u00030\u009e\u00012\t\b\u0002\u0010¢\u0001\u001a\u00020\u000f2\n\b\u0002\u0010£\u0001\u001a\u00030\u009e\u00012\u0019\b\u0002\u0010\u0086\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u00010\u0085\u0001¢\u0006\u0006\b±\u0001\u0010²\u0001\u001ak\u0010³\u0001\u001a\u00030®\u0001*\u00020\u000e2\n\b\u0002\u0010\u009f\u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010 \u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010¡\u0001\u001a\u00030\u009e\u00012\t\b\u0002\u0010¢\u0001\u001a\u00020\u000f2\n\b\u0002\u0010£\u0001\u001a\u00030\u009e\u00012\u0019\b\u0002\u0010\u0086\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u00010\u0085\u0001¢\u0006\u0006\b³\u0001\u0010´\u0001\u001ak\u0010µ\u0001\u001a\u00030®\u0001*\u00020L2\n\b\u0002\u0010\u009f\u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010 \u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010¡\u0001\u001a\u00030\u009e\u00012\t\b\u0002\u0010¢\u0001\u001a\u00020\u000f2\n\b\u0002\u0010£\u0001\u001a\u00030\u009e\u00012\u0019\b\u0002\u0010\u0086\u0001\u001a\u0012\u0012\u0004\u0012\u00020M\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u00010\u0085\u0001¢\u0006\u0006\bµ\u0001\u0010¶\u0001\u001ak\u0010·\u0001\u001a\u00030®\u0001*\u00020\u00162\n\b\u0002\u0010\u009f\u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010 \u0001\u001a\u00030\u009e\u00012\n\b\u0002\u0010¡\u0001\u001a\u00030\u009e\u00012\t\b\u0002\u0010¢\u0001\u001a\u00020\u000f2\n\b\u0002\u0010£\u0001\u001a\u00030\u009e\u00012\u0019\b\u0002\u0010\u0086\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0017\u0012\u0005\u0012\u00030\u009e\u0001\u0018\u00010\u0085\u0001¢\u0006\u0006\b·\u0001\u0010¸\u0001\u001a)\u0010¹\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0089\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0006\b¹\u0001\u0010\u008c\u0001\u001a)\u0010»\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000º\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0006\b»\u0001\u0010¼\u0001\u001a\u0013\u0010½\u0001\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0005\b½\u0001\u0010\u001d\"%\u0010I\u001a\u00020H\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0017\u0010I\u001a\u00020H*\u00020\u00068F¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0017\u0010I\u001a\u00020H*\u00020\u000e8F¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0017\u0010I\u001a\u00020H*\u00020L8F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001\"&\u0010È\u0001\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0018\u0010È\u0001\u001a\u00020\u000f*\u00020\u00068F¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0017\u0010È\u0001\u001a\u00020\u000f*\u00020\u000e8F¢\u0006\u0007\u001a\u0005\bË\u0001\u0010\u001d\"\u0018\u0010È\u0001\u001a\u00020\u000f*\u00020\u00128F¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0018\u0010È\u0001\u001a\u00020\u000f*\u00020L8F¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ï\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Ð\u0001"}, d2 = {"T", "", "element", "", "e0", "([Ljava/lang/Object;Ljava/lang/Object;)Z", "", "", "a0", "([BB)Z", "", "", "f0", "([SS)Z", "", "", "c0", "([II)Z", "", "", "d0", "([JJ)Z", "", "", "b0", "([CC)Z", "k0", "([Ljava/lang/Object;)Ljava/lang/Object;", "j0", "([I)I", "l0", "index", "x0", "([Ljava/lang/Object;I)Ljava/lang/Object;", "w0", "([II)Ljava/lang/Integer;", "", "", "v0", "([DI)Ljava/lang/Double;", "C0", "([Ljava/lang/Object;Ljava/lang/Object;)I", "y0", "([BB)I", "D0", "([SS)I", "A0", "([II)I", "B0", "([JJ)I", "z0", "([CC)I", "U0", "X0", "V0", "W0", "e1", "d1", "([C)C", "f1", "n", "", "g0", "([Ljava/lang/Object;I)Ljava/util/List;", "", "h0", "([Ljava/lang/Object;)Ljava/util/List;", "", "C", "destination", "i0", "([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;", "Lbo0/j;", "indices", "g1", "([BLbo0/j;)Ljava/util/List;", "", "", "h1", "([FLbo0/j;)Ljava/util/List;", "i1", "([BLbo0/j;)[B", "m1", "([BI)Ljava/util/List;", "n1", "Ljn0/h0;", "b1", "([Ljava/lang/Object;)V", "c1", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "j1", "([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;", "k1", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;", "p1", "o1", "([ILjava/util/Collection;)Ljava/util/Collection;", "w1", "q1", "([B)Ljava/util/List;", "x1", "([S)Ljava/util/List;", "u1", "([I)Ljava/util/List;", "v1", "([J)Ljava/util/List;", "t1", "([F)Ljava/util/List;", "s1", "([D)Ljava/util/List;", "", "y1", "([Z)Ljava/util/List;", "r1", "([C)Ljava/util/List;", "", "F1", "z1", "G1", "D1", "E1", "C1", "B1", "H1", "A1", "", "J1", "([Ljava/lang/Object;)Ljava/util/Set;", "I1", "([I)Ljava/util/Set;", "R", "Lkotlin/Function1;", "transform", "Y0", "([Ljava/lang/Object;Lwn0/l;)Ljava/util/List;", "", "Lkotlin/collections/p0;", "K1", "([Ljava/lang/Object;)Ljava/lang/Iterable;", "", "Z0", "([Ljava/lang/Comparable;)Ljava/lang/Comparable;", "a1", "([F)Ljava/lang/Float;", "other", "Lkotlin/Pair;", "O1", "([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;", "M1", "([I[Ljava/lang/Object;)Ljava/util/List;", "N1", "([Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/List;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "I0", "([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/Appendable;", "E0", "([BLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/Appendable;", "H0", "([ILjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/Appendable;", "G0", "([FLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/Appendable;", "F0", "([CLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/Appendable;", "", "O0", "([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/String;", "K0", "([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/String;", "N0", "([ILjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/String;", "M0", "([FLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/String;", "L0", "([CLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/String;", "Y", "Lho0/i;", "Z", "([Ljava/lang/Object;)Lho0/i;", "l1", "p0", "([Ljava/lang/Object;)Lbo0/j;", "m0", "([B)Lbo0/j;", "o0", "([I)Lbo0/j;", "n0", "([F)Lbo0/j;", "u0", "([Ljava/lang/Object;)I", "lastIndex", "q0", "([B)I", "s0", "t0", "([J)I", "r0", "([F)I", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
public class s extends q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/collections/s$a", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Iterable<T>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f86500a;

        public a(Object[] objArr) {
            this.f86500a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return c.a(this.f86500a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/collections/s$b", "Lho0/i;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f86501a;

        public b(Object[] objArr) {
            this.f86501a = objArr;
        }

        @Override // ho0.i
        public Iterator<T> iterator() {
            return c.a(this.f86501a);
        }
    }

    public static final int A0(int[] iArr, int i11) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        int length = iArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (i11 == iArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public static final List<Character> A1(char[] cArr) {
        p013kotlin.jvm.internal.s.k(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c11 : cArr) {
            arrayList.add(Character.valueOf(c11));
        }
        return arrayList;
    }

    public static final int B0(long[] jArr, long j11) {
        p013kotlin.jvm.internal.s.k(jArr, "<this>");
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (j11 == jArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final List<Double> B1(double[] dArr) {
        p013kotlin.jvm.internal.s.k(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d11 : dArr) {
            arrayList.add(Double.valueOf(d11));
        }
        return arrayList;
    }

    public static <T> int C0(T[] tArr, T t11) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        int i11 = 0;
        if (t11 == null) {
            int length = tArr.length;
            while (i11 < length) {
                if (tArr[i11] == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i11 < length2) {
            if (p013kotlin.jvm.internal.s.f(t11, tArr[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static final List<Float> C1(float[] fArr) {
        p013kotlin.jvm.internal.s.k(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f11 : fArr) {
            arrayList.add(Float.valueOf(f11));
        }
        return arrayList;
    }

    public static final int D0(short[] sArr, short s11) {
        p013kotlin.jvm.internal.s.k(sArr, "<this>");
        int length = sArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (s11 == sArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static List<Integer> D1(int[] iArr) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i11 : iArr) {
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    public static final <A extends Appendable> A E0(byte[] bArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, l<? super Byte, ? extends CharSequence> lVar) throws IOException {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        p013kotlin.jvm.internal.s.k(buffer, "buffer");
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(postfix, "postfix");
        p013kotlin.jvm.internal.s.k(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (byte b11 : bArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Byte.valueOf(b11)));
            } else {
                buffer.append(String.valueOf((int) b11));
            }
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final List<Long> E1(long[] jArr) {
        p013kotlin.jvm.internal.s.k(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j11 : jArr) {
            arrayList.add(Long.valueOf(j11));
        }
        return arrayList;
    }

    public static final <A extends Appendable> A F0(char[] cArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, l<? super Character, ? extends CharSequence> lVar) throws IOException {
        p013kotlin.jvm.internal.s.k(cArr, "<this>");
        p013kotlin.jvm.internal.s.k(buffer, "buffer");
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(postfix, "postfix");
        p013kotlin.jvm.internal.s.k(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (char c11 : cArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Character.valueOf(c11)));
            } else {
                buffer.append(c11);
            }
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static <T> List<T> F1(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        return new ArrayList(x.i(tArr));
    }

    public static final <A extends Appendable> A G0(float[] fArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, l<? super Float, ? extends CharSequence> lVar) throws IOException {
        p013kotlin.jvm.internal.s.k(fArr, "<this>");
        p013kotlin.jvm.internal.s.k(buffer, "buffer");
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(postfix, "postfix");
        p013kotlin.jvm.internal.s.k(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (float f11 : fArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Float.valueOf(f11)));
            } else {
                buffer.append(String.valueOf(f11));
            }
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final List<Short> G1(short[] sArr) {
        p013kotlin.jvm.internal.s.k(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s11 : sArr) {
            arrayList.add(Short.valueOf(s11));
        }
        return arrayList;
    }

    public static final <A extends Appendable> A H0(int[] iArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, l<? super Integer, ? extends CharSequence> lVar) throws IOException {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        p013kotlin.jvm.internal.s.k(buffer, "buffer");
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(postfix, "postfix");
        p013kotlin.jvm.internal.s.k(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (int i13 : iArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Integer.valueOf(i13)));
            } else {
                buffer.append(String.valueOf(i13));
            }
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final List<Boolean> H1(boolean[] zArr) {
        p013kotlin.jvm.internal.s.k(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z11 : zArr) {
            arrayList.add(Boolean.valueOf(z11));
        }
        return arrayList;
    }

    public static final <T, A extends Appendable> A I0(T[] tArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, l<? super T, ? extends CharSequence> lVar) throws IOException {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        p013kotlin.jvm.internal.s.k(buffer, "buffer");
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(postfix, "postfix");
        p013kotlin.jvm.internal.s.k(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (T t11 : tArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            t.a(buffer, t11, lVar);
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static Set<Integer> I1(int[] iArr) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? (Set) o1(iArr, new LinkedHashSet(x0.e(iArr.length))) : e1.c(Integer.valueOf(iArr[0]));
        }
        return f1.d();
    }

    public static <T> Set<T> J1(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? (Set) p1(tArr, new LinkedHashSet(x0.e(tArr.length))) : e1.c(tArr[0]);
        }
        return f1.d();
    }

    public static final String K0(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, l<? super Byte, ? extends CharSequence> lVar) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(postfix, "postfix");
        p013kotlin.jvm.internal.s.k(truncated, "truncated");
        return ((StringBuilder) E0(bArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    public static <T> Iterable<IndexedValue<T>> K1(final T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        return new q0(new wn0.a() { // from class: kotlin.collections.r
            @Override // wn0.a
            public final Object invoke() {
                return s.L1(tArr);
            }
        });
    }

    public static final String L0(char[] cArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, l<? super Character, ? extends CharSequence> lVar) {
        p013kotlin.jvm.internal.s.k(cArr, "<this>");
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(postfix, "postfix");
        p013kotlin.jvm.internal.s.k(truncated, "truncated");
        return ((StringBuilder) F0(cArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator L1(Object[] objArr) {
        return c.a(objArr);
    }

    public static final String M0(float[] fArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, l<? super Float, ? extends CharSequence> lVar) {
        p013kotlin.jvm.internal.s.k(fArr, "<this>");
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(postfix, "postfix");
        p013kotlin.jvm.internal.s.k(truncated, "truncated");
        return ((StringBuilder) G0(fArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    public static <R> List<Pair<Integer, R>> M1(int[] iArr, R[] other) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        p013kotlin.jvm.internal.s.k(other, "other");
        int iMin = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i11 = 0; i11 < iMin; i11++) {
            int i12 = iArr[i11];
            arrayList.add(x.a(Integer.valueOf(i12), other[i11]));
        }
        return arrayList;
    }

    public static final String N0(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, l<? super Integer, ? extends CharSequence> lVar) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(postfix, "postfix");
        p013kotlin.jvm.internal.s.k(truncated, "truncated");
        return ((StringBuilder) H0(iArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    public static <T, R> List<Pair<T, R>> N1(T[] tArr, Iterable<? extends R> other) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        p013kotlin.jvm.internal.s.k(other, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(y.y(other, 10), length));
        int i11 = 0;
        for (R r11 : other) {
            if (i11 >= length) {
                break;
            }
            arrayList.add(x.a(tArr[i11], r11));
            i11++;
        }
        return arrayList;
    }

    public static final <T> String O0(T[] tArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, l<? super T, ? extends CharSequence> lVar) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        p013kotlin.jvm.internal.s.k(separator, "separator");
        p013kotlin.jvm.internal.s.k(prefix, "prefix");
        p013kotlin.jvm.internal.s.k(postfix, "postfix");
        p013kotlin.jvm.internal.s.k(truncated, "truncated");
        return ((StringBuilder) I0(tArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    public static <T, R> List<Pair<T, R>> O1(T[] tArr, R[] other) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        p013kotlin.jvm.internal.s.k(other, "other");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i11 = 0; i11 < iMin; i11++) {
            arrayList.add(x.a(tArr[i11], other[i11]));
        }
        return arrayList;
    }

    public static /* synthetic */ String P0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l lVar2 = lVar;
        return K0(bArr, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    public static /* synthetic */ String Q0(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l lVar2 = lVar;
        return L0(cArr, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    public static /* synthetic */ String R0(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l lVar2 = lVar;
        return M0(fArr, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    public static /* synthetic */ String S0(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l lVar2 = lVar;
        return N0(iArr, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    public static /* synthetic */ String T0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i12 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i12 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l lVar2 = lVar;
        return O0(objArr, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    public static <T> T U0(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[u0(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int V0(byte[] bArr, byte b11) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i11 = length - 1;
                if (b11 == bArr[length]) {
                    return length;
                }
                if (i11 >= 0) {
                    length = i11;
                }
            }
        }
        return -1;
    }

    public static final int W0(int[] iArr, int i11) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i12 = length - 1;
                if (i11 == iArr[length]) {
                    return length;
                }
                if (i12 >= 0) {
                    length = i12;
                }
            }
        }
        return -1;
    }

    public static <T> int X0(T[] tArr, T t11) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        if (t11 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i11 >= 0) {
                        length = i11;
                    }
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i12 = length2 - 1;
                    if (p013kotlin.jvm.internal.s.f(t11, tArr[length2])) {
                        return length2;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    length2 = i12;
                }
            }
        }
        return -1;
    }

    public static <T> Iterable<T> Y(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        return tArr.length == 0 ? x.m() : new a(tArr);
    }

    public static <T, R> List<R> Y0(T[] tArr, l<? super T, ? extends R> transform) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        p013kotlin.jvm.internal.s.k(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t11 : tArr) {
            arrayList.add(transform.invoke(t11));
        }
        return arrayList;
    }

    public static <T> i<T> Z(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        return tArr.length == 0 ? ho0.l.j() : new b(tArr);
    }

    public static <T extends Comparable<? super T>> T Z0(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        T t11 = tArr[0];
        int iU0 = u0(tArr);
        int i11 = 1;
        if (1 <= iU0) {
            while (true) {
                T t12 = tArr[i11];
                if (t11.compareTo(t12) < 0) {
                    t11 = t12;
                }
                if (i11 == iU0) {
                    break;
                }
                i11++;
            }
        }
        return t11;
    }

    public static boolean a0(byte[] bArr, byte b11) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        return y0(bArr, b11) >= 0;
    }

    public static Float a1(float[] fArr) {
        p013kotlin.jvm.internal.s.k(fArr, "<this>");
        if (fArr.length == 0) {
            return null;
        }
        float fMin = fArr[0];
        int iR0 = r0(fArr);
        int i11 = 1;
        if (1 <= iR0) {
            while (true) {
                fMin = Math.min(fMin, fArr[i11]);
                if (i11 == iR0) {
                    break;
                }
                i11++;
            }
        }
        return Float.valueOf(fMin);
    }

    public static boolean b0(char[] cArr, char c11) {
        p013kotlin.jvm.internal.s.k(cArr, "<this>");
        return z0(cArr, c11) >= 0;
    }

    public static <T> void b1(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iU0 = u0(tArr);
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            T t11 = tArr[i11];
            tArr[i11] = tArr[iU0];
            tArr[iU0] = t11;
            iU0--;
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public static boolean c0(int[] iArr, int i11) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        return A0(iArr, i11) >= 0;
    }

    public static <T> List<T> c1(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        if (tArr.length == 0) {
            return x.m();
        }
        List<T> listF1 = F1(tArr);
        e0.a0(listF1);
        return listF1;
    }

    public static boolean d0(long[] jArr, long j11) {
        p013kotlin.jvm.internal.s.k(jArr, "<this>");
        return B0(jArr, j11) >= 0;
    }

    public static char d1(char[] cArr) {
        p013kotlin.jvm.internal.s.k(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> boolean e0(T[] tArr, T t11) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        return C0(tArr, t11) >= 0;
    }

    public static <T> T e1(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static boolean f0(short[] sArr, short s11) {
        p013kotlin.jvm.internal.s.k(sArr, "<this>");
        return D0(sArr, s11) >= 0;
    }

    public static <T> T f1(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static <T> List<T> g0(T[] tArr, int i11) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        if (i11 >= 0) {
            return n1(tArr, n.f(tArr.length - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    public static List<Byte> g1(byte[] bArr, j indices) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        p013kotlin.jvm.internal.s.k(indices, "indices");
        return indices.isEmpty() ? x.m() : q.e(q.u(bArr, indices.getStart().intValue(), indices.e().intValue() + 1));
    }

    public static <T> List<T> h0(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        return (List) i0(tArr, new ArrayList());
    }

    public static List<Float> h1(float[] fArr, j indices) {
        p013kotlin.jvm.internal.s.k(fArr, "<this>");
        p013kotlin.jvm.internal.s.k(indices, "indices");
        return indices.isEmpty() ? x.m() : q.f(q.v(fArr, indices.getStart().intValue(), indices.e().intValue() + 1));
    }

    public static final <C extends Collection<? super T>, T> C i0(T[] tArr, C destination) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        p013kotlin.jvm.internal.s.k(destination, "destination");
        for (T t11 : tArr) {
            if (t11 != null) {
                destination.add(t11);
            }
        }
        return destination;
    }

    public static byte[] i1(byte[] bArr, j indices) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        p013kotlin.jvm.internal.s.k(indices, "indices");
        return indices.isEmpty() ? new byte[0] : q.u(bArr, indices.getStart().intValue(), indices.e().intValue() + 1);
    }

    public static int j0(int[] iArr) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T[] j1(T[] tArr, Comparator<? super T> comparator) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        p013kotlin.jvm.internal.s.k(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        p013kotlin.jvm.internal.s.j(tArr2, "copyOf(...)");
        q.R(tArr2, comparator);
        return tArr2;
    }

    public static <T> T k0(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> List<T> k1(T[] tArr, Comparator<? super T> comparator) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        p013kotlin.jvm.internal.s.k(comparator, "comparator");
        return q.h(j1(tArr, comparator));
    }

    public static <T> T l0(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static int l1(int[] iArr) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        return i11;
    }

    public static j m0(byte[] bArr) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        return new j(0, q0(bArr));
    }

    public static List<Byte> m1(byte[] bArr, int i11) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return x.m();
        }
        if (i11 >= bArr.length) {
            return q1(bArr);
        }
        if (i11 == 1) {
            return w.e(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        for (byte b11 : bArr) {
            arrayList.add(Byte.valueOf(b11));
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return arrayList;
    }

    public static j n0(float[] fArr) {
        p013kotlin.jvm.internal.s.k(fArr, "<this>");
        return new j(0, r0(fArr));
    }

    public static final <T> List<T> n1(T[] tArr, int i11) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return x.m();
        }
        int length = tArr.length;
        if (i11 >= length) {
            return w1(tArr);
        }
        if (i11 == 1) {
            return w.e(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = length - i11; i12 < length; i12++) {
            arrayList.add(tArr[i12]);
        }
        return arrayList;
    }

    public static j o0(int[] iArr) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        return new j(0, s0(iArr));
    }

    public static final <C extends Collection<? super Integer>> C o1(int[] iArr, C destination) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        p013kotlin.jvm.internal.s.k(destination, "destination");
        for (int i11 : iArr) {
            destination.add(Integer.valueOf(i11));
        }
        return destination;
    }

    public static <T> j p0(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        return new j(0, u0(tArr));
    }

    public static final <T, C extends Collection<? super T>> C p1(T[] tArr, C destination) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        p013kotlin.jvm.internal.s.k(destination, "destination");
        for (T t11 : tArr) {
            destination.add(t11);
        }
        return destination;
    }

    public static final int q0(byte[] bArr) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        return bArr.length - 1;
    }

    public static List<Byte> q1(byte[] bArr) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            return length != 1 ? z1(bArr) : w.e(Byte.valueOf(bArr[0]));
        }
        return x.m();
    }

    public static final int r0(float[] fArr) {
        p013kotlin.jvm.internal.s.k(fArr, "<this>");
        return fArr.length - 1;
    }

    public static List<Character> r1(char[] cArr) {
        p013kotlin.jvm.internal.s.k(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            return length != 1 ? A1(cArr) : w.e(Character.valueOf(cArr[0]));
        }
        return x.m();
    }

    public static int s0(int[] iArr) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        return iArr.length - 1;
    }

    public static List<Double> s1(double[] dArr) {
        p013kotlin.jvm.internal.s.k(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            return length != 1 ? B1(dArr) : w.e(Double.valueOf(dArr[0]));
        }
        return x.m();
    }

    public static int t0(long[] jArr) {
        p013kotlin.jvm.internal.s.k(jArr, "<this>");
        return jArr.length - 1;
    }

    public static List<Float> t1(float[] fArr) {
        p013kotlin.jvm.internal.s.k(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            return length != 1 ? C1(fArr) : w.e(Float.valueOf(fArr[0]));
        }
        return x.m();
    }

    public static <T> int u0(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        return tArr.length - 1;
    }

    public static List<Integer> u1(int[] iArr) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? D1(iArr) : w.e(Integer.valueOf(iArr[0]));
        }
        return x.m();
    }

    public static Double v0(double[] dArr, int i11) {
        p013kotlin.jvm.internal.s.k(dArr, "<this>");
        if (i11 < 0 || i11 >= dArr.length) {
            return null;
        }
        return Double.valueOf(dArr[i11]);
    }

    public static List<Long> v1(long[] jArr) {
        p013kotlin.jvm.internal.s.k(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            return length != 1 ? E1(jArr) : w.e(Long.valueOf(jArr[0]));
        }
        return x.m();
    }

    public static Integer w0(int[] iArr, int i11) {
        p013kotlin.jvm.internal.s.k(iArr, "<this>");
        if (i11 < 0 || i11 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i11]);
    }

    public static <T> List<T> w1(T[] tArr) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? F1(tArr) : w.e(tArr[0]);
        }
        return x.m();
    }

    public static <T> T x0(T[] tArr, int i11) {
        p013kotlin.jvm.internal.s.k(tArr, "<this>");
        if (i11 < 0 || i11 >= tArr.length) {
            return null;
        }
        return tArr[i11];
    }

    public static List<Short> x1(short[] sArr) {
        p013kotlin.jvm.internal.s.k(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            return length != 1 ? G1(sArr) : w.e(Short.valueOf(sArr[0]));
        }
        return x.m();
    }

    public static final int y0(byte[] bArr, byte b11) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (b11 == bArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static List<Boolean> y1(boolean[] zArr) {
        p013kotlin.jvm.internal.s.k(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            return length != 1 ? H1(zArr) : w.e(Boolean.valueOf(zArr[0]));
        }
        return x.m();
    }

    public static final int z0(char[] cArr, char c11) {
        p013kotlin.jvm.internal.s.k(cArr, "<this>");
        int length = cArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (c11 == cArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final List<Byte> z1(byte[] bArr) {
        p013kotlin.jvm.internal.s.k(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b11 : bArr) {
            arrayList.add(Byte.valueOf(b11));
        }
        return arrayList;
    }
}
