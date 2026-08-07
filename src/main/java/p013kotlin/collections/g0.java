package p013kotlin.collections;

import bo0.j;
import bo0.n;
import ho0.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import wn0.l;
import zn0.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ø\u0001\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u001f\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\n\u001a'\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0013\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u001d\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0016\u0010\n\u001a\u001f\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0017\u0010\u0007\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0018\u0010\n\u001a\u001d\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0019\u0010\u0007\u001a\u001d\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u001a\u0010\n\u001a\u001f\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001b\u0010\u0007\u001a\u001f\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u001c\u0010\n\u001a+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b \u0010!\u001a=\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\"H\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a)\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0000*\u00020&*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b'\u0010(\u001a=\u0010,\u001a\u00028\u0000\"\u0010\b\u0000\u0010**\n\u0012\u0006\b\u0000\u0012\u00028\u00010)\"\b\b\u0001\u0010\u0000*\u00020&*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010+\u001a\u00028\u0000¢\u0006\u0004\b,\u0010-\u001a+\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101\u001a+\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b2\u0010\u001f\u001a+\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b3\u0010!\u001a#\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b4\u0010(\u001a'\u00109\u001a\u000208\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000052\u0006\u00107\u001a\u000206H\u0007¢\u0006\u0004\b9\u0010:\u001a-\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000;*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b<\u0010(\u001a-\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000;*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b=\u0010(\u001a?\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000>j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`?¢\u0006\u0004\bA\u0010B\u001a\u0017\u0010E\u001a\u00020D*\b\u0012\u0004\u0012\u00020\u00030C¢\u0006\u0004\bE\u0010F\u001a\u0017\u0010I\u001a\u00020H*\b\u0012\u0004\u0012\u00020G0C¢\u0006\u0004\bI\u0010J\u001a\u0017\u0010M\u001a\u00020L*\b\u0012\u0004\u0012\u00020K0C¢\u0006\u0004\bM\u0010N\u001a\u0017\u0010Q\u001a\u00020P*\b\u0012\u0004\u0012\u00020O0C¢\u0006\u0004\bQ\u0010R\u001a\u0017\u0010T\u001a\u00020S*\b\u0012\u0004\u0012\u00020\r0C¢\u0006\u0004\bT\u0010U\u001a\u0017\u0010X\u001a\u00020W*\b\u0012\u0004\u0012\u00020V0C¢\u0006\u0004\bX\u0010Y\u001a7\u0010Z\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010**\n\u0012\u0006\b\u0000\u0012\u00028\u00000)*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010+\u001a\u00028\u0001¢\u0006\u0004\bZ\u0010-\u001a-\u0010]\u001a\u0012\u0012\u0004\u0012\u00028\u00000[j\b\u0012\u0004\u0012\u00028\u0000`\\\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b]\u0010^\u001a#\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b_\u0010(\u001a#\u0010`\u001a\b\u0012\u0004\u0012\u00028\u000005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b`\u0010(\u001a#\u0010a\u001a\b\u0012\u0004\u0012\u00028\u000005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000C¢\u0006\u0004\ba\u0010b\u001a#\u0010d\u001a\b\u0012\u0004\u0012\u00028\u00000c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bd\u0010e\u001aC\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0086\bø\u0001\u0000¢\u0006\u0004\bh\u0010%\u001a)\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000i0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bj\u0010k\u001a#\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bl\u0010(\u001a4\u0010n\u001a\b\u0012\u0004\u0012\u00028\u00000c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004¢\u0006\u0004\bn\u0010o\u001a#\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000p\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bq\u0010e\u001a4\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000c\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004¢\u0006\u0004\br\u0010o\u001a7\u0010s\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\"H\u0086\bø\u0001\u0000¢\u0006\u0004\bs\u0010t\u001a\u001d\u0010u\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bu\u0010v\u001a)\u0010w\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000;*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bw\u0010x\u001a\u001b\u0010y\u001a\u0004\u0018\u00010K*\b\u0012\u0004\u0012\u00020K0\u0001H\u0007¢\u0006\u0004\by\u0010z\u001a\u001b\u0010{\u001a\u0004\u0018\u00010O*\b\u0012\u0004\u0012\u00020O0\u0001H\u0007¢\u0006\u0004\b{\u0010|\u001a+\u0010}\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000;*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b}\u0010x\u001a\u001b\u0010~\u001a\u0004\u0018\u00010K*\b\u0012\u0004\u0012\u00020K0\u0001H\u0007¢\u0006\u0004\b~\u0010z\u001a\u001b\u0010\u007f\u001a\u0004\u0018\u00010O*\b\u0012\u0004\u0012\u00020O0\u0001H\u0007¢\u0006\u0004\b\u007f\u0010|\u001a-\u0010\u0080\u0001\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000;*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0005\b\u0080\u0001\u0010x\u001a1\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a8\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a1\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0082\u0001\u001a1\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000C2\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a8\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u0085\u0001\u001a8\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000C2\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001\u001aJ\u0010\u008d\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u008c\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010f*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0086\u0004¢\u0006\u0006\b\u008d\u0001\u0010\u0085\u0001\u001a\u008e\u0001\u0010\u0098\u0001\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u000f\b\u0001\u0010\u0090\u0001*\b0\u008e\u0001j\u0003`\u008f\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0007\u0010\u0091\u0001\u001a\u00028\u00012\n\b\u0002\u0010\u0093\u0001\u001a\u00030\u0092\u00012\n\b\u0002\u0010\u0094\u0001\u001a\u00030\u0092\u00012\n\b\u0002\u0010\u0095\u0001\u001a\u00030\u0092\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020\r2\n\b\u0002\u0010\u0097\u0001\u001a\u00030\u0092\u00012\u0017\b\u0002\u0010g\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0092\u0001\u0018\u00010\"¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001\u001au\u0010\u009b\u0001\u001a\u00030\u009a\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0093\u0001\u001a\u00030\u0092\u00012\n\b\u0002\u0010\u0094\u0001\u001a\u00030\u0092\u00012\n\b\u0002\u0010\u0095\u0001\u001a\u00030\u0092\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020\r2\n\b\u0002\u0010\u0097\u0001\u001a\u00030\u0092\u00012\u0017\b\u0002\u0010g\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0092\u0001\u0018\u00010\"¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a'\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u009d\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u001c\u0010 \u0001\u001a\u00020K*\b\u0012\u0004\u0012\u00020O0\u0001H\u0007¢\u0006\u0006\b \u0001\u0010¡\u0001\u001a\u001c\u0010¢\u0001\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\r0\u0001H\u0007¢\u0006\u0006\b¢\u0001\u0010£\u0001\u001a\u001c\u0010¤\u0001\u001a\u00020K*\b\u0012\u0004\u0012\u00020K0\u0001H\u0007¢\u0006\u0006\b¤\u0001\u0010¡\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006¥\u0001"}, d2 = {"T", "", "element", "", "g0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "n0", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "", "o0", "(Ljava/util/List;)Ljava/lang/Object;", "p0", "q0", "", "index", "r0", "(Ljava/util/List;I)Ljava/lang/Object;", "s0", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "t0", "(Ljava/util/List;Ljava/lang/Object;)I", "z0", "A0", "B0", "C0", "T0", "U0", "V0", "W0", "n", "i0", "(Ljava/lang/Iterable;I)Ljava/util/List;", "j0", "(Ljava/util/List;I)Ljava/util/List;", "Lkotlin/Function1;", "predicate", "k0", "(Ljava/lang/Iterable;Lwn0/l;)Ljava/util/List;", "", "l0", "(Ljava/lang/Iterable;)Ljava/util/List;", "", "C", "destination", "m0", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "Lbo0/j;", "indices", "X0", "(Ljava/util/List;Lbo0/j;)Ljava/util/List;", "d1", "e1", "R0", "", "Lzn0/c;", "random", "Ljn0/h0;", "S0", "(Ljava/util/List;Lzn0/c;)V", "", "Y0", "Z0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "a1", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;", "", "", "f1", "(Ljava/util/Collection;)[Z", "", "", "g1", "(Ljava/util/Collection;)[B", "", "", "i1", "(Ljava/util/Collection;)[D", "", "", "j1", "(Ljava/util/Collection;)[F", "", "l1", "(Ljava/util/Collection;)[I", "", "", "n1", "(Ljava/util/Collection;)[J", "h1", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "k1", "(Ljava/lang/Iterable;)Ljava/util/HashSet;", "m1", "o1", "p1", "(Ljava/util/Collection;)Ljava/util/List;", "", "r1", "(Ljava/lang/Iterable;)Ljava/util/Set;", "R", "transform", "D0", "Lkotlin/collections/p0;", "t1", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "h0", "other", "u0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;", "", "q1", "s1", "c0", "(Ljava/lang/Iterable;Lwn0/l;)Z", "d0", "(Ljava/lang/Iterable;)Z", "H0", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "F0", "(Ljava/lang/Iterable;)Ljava/lang/Double;", "G0", "(Ljava/lang/Iterable;)Ljava/lang/Float;", "E0", "J0", "K0", "I0", "M0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "elements", "L0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", "O0", "Q0", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "N0", "P0", "(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;", "Lkotlin/Pair;", "v1", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "v0", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/Appendable;", "", "x0", "(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lwn0/l;)Ljava/lang/String;", "Lho0/i;", "e0", "(Ljava/lang/Iterable;)Lho0/i;", "f0", "(Ljava/lang/Iterable;)D", "c1", "(Ljava/lang/Iterable;)I", "b1", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class g0 extends e0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/collections/g0$a", "Lho0/i;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f86478a;

        public a(Iterable iterable) {
            this.f86478a = iterable;
        }

        @Override // ho0.i
        public Iterator<T> iterator() {
            return this.f86478a.iterator();
        }
    }

    public static <T> T A0(List<? extends T> list) {
        s.k(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(x.o(list));
    }

    public static <T> T B0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T C0(List<? extends T> list) {
        s.k(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static <T, R> List<R> D0(Iterable<? extends T> iterable, l<? super T, ? extends R> transform) {
        s.k(iterable, "<this>");
        s.k(transform, "transform");
        ArrayList arrayList = new ArrayList(y.y(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static <T extends Comparable<? super T>> T E0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Double F0(Iterable<Double> iterable) {
        s.k(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static Float G0(Iterable<Float> iterable) {
        s.k(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static <T extends Comparable<? super T>> T H0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T extends Comparable<? super T>> T I0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Double J0(Iterable<Double> iterable) {
        s.k(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static Float K0(Iterable<Float> iterable) {
        s.k(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static <T> List<T> L0(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        s.k(iterable, "<this>");
        s.k(elements, "elements");
        Collection collectionG = c0.G(elements);
        if (collectionG.isEmpty()) {
            return m1(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t11 : iterable) {
            if (!collectionG.contains(t11)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static <T> List<T> M0(Iterable<? extends T> iterable, T t11) {
        s.k(iterable, "<this>");
        ArrayList arrayList = new ArrayList(y.y(iterable, 10));
        boolean z11 = false;
        for (T t12 : iterable) {
            boolean z12 = true;
            if (!z11 && s.f(t12, t11)) {
                z11 = true;
                z12 = false;
            }
            if (z12) {
                arrayList.add(t12);
            }
        }
        return arrayList;
    }

    public static <T> List<T> N0(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        s.k(iterable, "<this>");
        s.k(elements, "elements");
        if (iterable instanceof Collection) {
            return P0((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        c0.E(arrayList, iterable);
        c0.E(arrayList, elements);
        return arrayList;
    }

    public static <T> List<T> O0(Iterable<? extends T> iterable, T t11) {
        s.k(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Q0((Collection) iterable, t11);
        }
        ArrayList arrayList = new ArrayList();
        c0.E(arrayList, iterable);
        arrayList.add(t11);
        return arrayList;
    }

    public static <T> List<T> P0(Collection<? extends T> collection, Iterable<? extends T> elements) {
        s.k(collection, "<this>");
        s.k(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            c0.E(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static <T> List<T> Q0(Collection<? extends T> collection, T t11) {
        s.k(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t11);
        return arrayList;
    }

    public static <T> List<T> R0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m1(iterable);
        }
        List<T> listO1 = o1(iterable);
        e0.a0(listO1);
        return listO1;
    }

    public static final <T> void S0(List<T> list, c random) {
        s.k(list, "<this>");
        s.k(random, "random");
        for (int iO = x.o(list); iO > 0; iO--) {
            int iD = random.d(iO + 1);
            list.set(iD, list.set(iO, list.get(iD)));
        }
    }

    public static <T> T T0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) U0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static <T> T U0(List<? extends T> list) {
        s.k(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static <T> T V0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static <T> T W0(List<? extends T> list) {
        s.k(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> X0(List<? extends T> list, j indices) {
        s.k(list, "<this>");
        s.k(indices, "indices");
        return indices.isEmpty() ? x.m() : m1(list.subList(indices.getStart().intValue(), indices.e().intValue() + 1));
    }

    public static <T extends Comparable<? super T>> List<T> Y0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listO1 = o1(iterable);
            b0.B(listO1);
            return listO1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        q.Q((Comparable[]) array);
        return q.h(array);
    }

    public static <T extends Comparable<? super T>> List<T> Z0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        return a1(iterable, mn0.a.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> a1(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        s.k(iterable, "<this>");
        s.k(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listO1 = o1(iterable);
            b0.C(listO1, comparator);
            return listO1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        q.R(array, comparator);
        return q.h(array);
    }

    public static double b1(Iterable<Double> iterable) {
        s.k(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    public static <T> boolean c0(Iterable<? extends T> iterable, l<? super T, Boolean> predicate) {
        s.k(iterable, "<this>");
        s.k(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static int c1(Iterable<Integer> iterable) {
        s.k(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    public static <T> boolean d0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static <T> List<T> d1(Iterable<? extends T> iterable, int i11) {
        s.k(iterable, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return x.m();
        }
        if (iterable instanceof Collection) {
            if (i11 >= ((Collection) iterable).size()) {
                return m1(iterable);
            }
            if (i11 == 1) {
                return w.e(n0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i11);
        Iterator<? extends T> it = iterable.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i12++;
            if (i12 == i11) {
                break;
            }
        }
        return x.t(arrayList);
    }

    public static <T> i<T> e0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        return new a(iterable);
    }

    public static <T> List<T> e1(List<? extends T> list, int i11) {
        s.k(list, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return x.m();
        }
        int size = list.size();
        if (i11 >= size) {
            return m1(list);
        }
        if (i11 == 1) {
            return w.e(A0(list));
        }
        ArrayList arrayList = new ArrayList(i11);
        if (list instanceof RandomAccess) {
            for (int i12 = size - i11; i12 < size; i12++) {
                arrayList.add(list.get(i12));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i11);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static double f0(Iterable<Float> iterable) {
        s.k(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        double dFloatValue = 0.0d;
        int i11 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) it.next().floatValue();
            i11++;
            if (i11 < 0) {
                x.w();
            }
        }
        if (i11 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i11);
    }

    public static boolean[] f1(Collection<Boolean> collection) {
        s.k(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            zArr[i11] = it.next().booleanValue();
            i11++;
        }
        return zArr;
    }

    public static <T> boolean g0(Iterable<? extends T> iterable, T t11) {
        s.k(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t11);
        }
        return s0(iterable, t11) >= 0;
    }

    public static byte[] g1(Collection<Byte> collection) {
        s.k(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            bArr[i11] = it.next().byteValue();
            i11++;
        }
        return bArr;
    }

    public static <T> List<T> h0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        return m1(q1(iterable));
    }

    public static <T, C extends Collection<? super T>> C h1(Iterable<? extends T> iterable, C destination) {
        s.k(iterable, "<this>");
        s.k(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static <T> List<T> i0(Iterable<? extends T> iterable, int i11) {
        ArrayList arrayList;
        s.k(iterable, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
        }
        if (i11 == 0) {
            return m1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i11;
            if (size <= 0) {
                return x.m();
            }
            if (size == 1) {
                return w.e(z0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i11 < size2) {
                        arrayList.add(list.get(i11));
                        i11++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i11);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i12 = 0;
        for (T t11 : iterable) {
            if (i12 >= i11) {
                arrayList.add(t11);
            } else {
                i12++;
            }
        }
        return x.t(arrayList);
    }

    public static double[] i1(Collection<Double> collection) {
        s.k(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            dArr[i11] = it.next().doubleValue();
            i11++;
        }
        return dArr;
    }

    public static <T> List<T> j0(List<? extends T> list, int i11) {
        s.k(list, "<this>");
        if (i11 >= 0) {
            return d1(list, n.f(list.size() - i11, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i11 + " is less than zero.").toString());
    }

    public static float[] j1(Collection<Float> collection) {
        s.k(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            fArr[i11] = it.next().floatValue();
            i11++;
        }
        return fArr;
    }

    public static <T> List<T> k0(Iterable<? extends T> iterable, l<? super T, Boolean> predicate) {
        s.k(iterable, "<this>");
        s.k(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t11 : iterable) {
            if (predicate.invoke(t11).booleanValue()) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static <T> HashSet<T> k1(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        return (HashSet) h1(iterable, new HashSet(x0.e(y.y(iterable, 12))));
    }

    public static <T> List<T> l0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        return (List) m0(iterable, new ArrayList());
    }

    public static int[] l1(Collection<Integer> collection) {
        s.k(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        return iArr;
    }

    public static <C extends Collection<? super T>, T> C m0(Iterable<? extends T> iterable, C destination) {
        s.k(iterable, "<this>");
        s.k(destination, "destination");
        for (T t11 : iterable) {
            if (t11 != null) {
                destination.add(t11);
            }
        }
        return destination;
    }

    public static <T> List<T> m1(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return x.t(o1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return x.m();
        }
        if (size != 1) {
            return p1(collection);
        }
        return w.e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static <T> T n0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) o0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static long[] n1(Collection<Long> collection) {
        s.k(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        return jArr;
    }

    public static <T> T o0(List<? extends T> list) {
        s.k(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final <T> List<T> o1(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        return iterable instanceof Collection ? p1((Collection) iterable) : (List) h1(iterable, new ArrayList());
    }

    public static <T> T p0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> List<T> p1(Collection<? extends T> collection) {
        s.k(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> T q0(List<? extends T> list) {
        s.k(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> Set<T> q1(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) h1(iterable, new LinkedHashSet());
    }

    public static <T> T r0(List<? extends T> list, int i11) {
        s.k(list, "<this>");
        if (i11 < 0 || i11 >= list.size()) {
            return null;
        }
        return list.get(i11);
    }

    public static <T> Set<T> r1(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return f1.h((Set) h1(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return f1.d();
        }
        if (size != 1) {
            return (Set) h1(iterable, new LinkedHashSet(x0.e(collection.size())));
        }
        return e1.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static <T> int s0(Iterable<? extends T> iterable, T t11) {
        s.k(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t11);
        }
        int i11 = 0;
        for (T t12 : iterable) {
            if (i11 < 0) {
                x.x();
            }
            if (s.f(t11, t12)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static <T> Set<T> s1(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        s.k(iterable, "<this>");
        s.k(other, "other");
        Set<T> setQ1 = q1(iterable);
        c0.E(setQ1, other);
        return setQ1;
    }

    public static <T> int t0(List<? extends T> list, T t11) {
        s.k(list, "<this>");
        return list.indexOf(t11);
    }

    public static <T> Iterable<IndexedValue<T>> t1(final Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        return new q0(new wn0.a() { // from class: kotlin.collections.f0
            @Override // wn0.a
            public final Object invoke() {
                return g0.u1(iterable);
            }
        });
    }

    public static <T> Set<T> u0(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        s.k(iterable, "<this>");
        s.k(other, "other");
        Set<T> setQ1 = q1(iterable);
        c0.R(setQ1, other);
        return setQ1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator u1(Iterable iterable) {
        return iterable.iterator();
    }

    public static final <T, A extends Appendable> A v0(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, l<? super T, ? extends CharSequence> lVar) throws IOException {
        s.k(iterable, "<this>");
        s.k(buffer, "buffer");
        s.k(separator, "separator");
        s.k(prefix, "prefix");
        s.k(postfix, "postfix");
        s.k(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (T t11 : iterable) {
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

    public static <T, R> List<Pair<T, R>> v1(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        s.k(iterable, "<this>");
        s.k(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(y.y(iterable, 10), y.y(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(x.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final <T> String x0(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, l<? super T, ? extends CharSequence> lVar) {
        s.k(iterable, "<this>");
        s.k(separator, "separator");
        s.k(prefix, "prefix");
        s.k(postfix, "postfix");
        s.k(truncated, "truncated");
        return ((StringBuilder) v0(iterable, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
    }

    public static /* synthetic */ String y0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, l lVar, int i12, Object obj) {
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
        return x0(iterable, charSequence, charSequence2, charSequence3, i11, charSequence5, lVar2);
    }

    public static <T> T z0(Iterable<? extends T> iterable) {
        s.k(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) A0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }
}
