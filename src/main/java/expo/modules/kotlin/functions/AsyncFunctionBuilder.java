package expo.modules.kotlin.functions;

import expo.modules.kotlin.Promise;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;
import wn0.q;
import wn0.r;
import wn0.t;
import wn0.u;
import wn0.v;
import wn0.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\r\u001a\u00020\f\"\u0006\b\u0000\u0010\b\u0018\u00012\u001e\b\u0004\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJI\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u00012$\b\u0004\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0012JW\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u00012*\b\u0004\u0010\u000b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0015Je\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u000120\b\u0004\u0010\u000b\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0018Js\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u000126\b\u0004\u0010\u000b\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u001bJ\u0081\u0001\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u00012<\b\u0004\u0010\u000b\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u001eJ\u008f\u0001\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u00012B\b\u0004\u0010\u000b\u001a<\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010 H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010!J\u009d\u0001\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010\"\u0018\u00012H\b\u0004\u0010\u000b\u001aB\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010#H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010$J«\u0001\u0010\r\u001a\u00020\u0011\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010\"\u0018\u0001\"\u0006\b\b\u0010%\u0018\u00012N\b\u0004\u0010\u000b\u001aH\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010&H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010'J%\u0010-\u001a\u00020*2\u0010\b\u0004\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010(H\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J+\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u00012\u000e\b\u0004\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u0010,J9\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u00012\u0014\b\u0004\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u0010.JG\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u00012\u001a\b\u0004\u0010)\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u0010/J?\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u00012\u001a\b\u0004\u0010)\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000\u0010H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u0010/JU\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u00012 \b\u0004\u0010)\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u00102JM\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u00012 \b\u0004\u0010)\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00102Jc\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u00012&\b\u0004\u0010)\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u00103J[\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u00012&\b\u0004\u0010)\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000\u0017H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00103Jq\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u00012,\b\u0004\u0010)\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u00104Ji\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u00012,\b\u0004\u0010)\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000\u001aH\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00104J\u007f\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u000122\b\u0004\u0010)\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u00105Jw\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u000122\b\u0004\u0010)\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000\u001dH\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00105J\u008d\u0001\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010\"\u0018\u000128\b\u0004\u0010)\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00000 H\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u00106J\u0085\u0001\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u000128\b\u0004\u0010)\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000 H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00106J\u009b\u0001\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010\"\u0018\u0001\"\u0006\b\b\u0010%\u0018\u00012>\b\u0004\u0010)\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u00000#H\u0086\bø\u0001\u0000¢\u0006\u0004\b-\u00107J\u0093\u0001\u0010-\u001a\u00020*\"\u0006\b\u0000\u0010\b\u0018\u0001\"\u0006\b\u0001\u0010\u000f\u0018\u0001\"\u0006\b\u0002\u0010\u0013\u0018\u0001\"\u0006\b\u0003\u0010\u0016\u0018\u0001\"\u0006\b\u0004\u0010\u0019\u0018\u0001\"\u0006\b\u0005\u0010\u001c\u0018\u0001\"\u0006\b\u0006\u0010\u001f\u0018\u0001\"\u0006\b\u0007\u0010\"\u0018\u00012>\b\u0004\u0010)\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00028\u00000#H\u0087\bø\u0001\u0000¢\u0006\u0004\b1\u00107J\u000f\u0010:\u001a\u00020\fH\u0000¢\u0006\u0004\b8\u00109R \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010;\u0012\u0004\b>\u0010?\u001a\u0004\b<\u0010=R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010@\u0012\u0004\bC\u0010?\u001a\u0004\bA\u0010BR*\u0010D\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bD\u0010E\u0012\u0004\bI\u0010?\u001a\u0004\bF\u00109\"\u0004\bG\u0010H\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006J"}, d2 = {"Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "", "", "name", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converters", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/types/TypeConverterProvider;)V", "R", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "block", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "SuspendBody", "(Lwn0/l;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "P0", "Lkotlin/Function2;", "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "(Lwn0/p;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P1", "Lkotlin/Function3;", "(Lwn0/q;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P2", "Lkotlin/Function4;", "(Lwn0/r;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P3", "Lkotlin/Function5;", "(Lwn0/s;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P4", "Lkotlin/Function6;", "(Lwn0/t;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P5", "Lkotlin/Function7;", "(Lwn0/u;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P6", "Lkotlin/Function8;", "(Lwn0/v;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P7", "Lkotlin/Function9;", "(Lwn0/w;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "Lkotlin/Function0;", "body", "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "AsyncBodyWithoutArgs", "(Lwn0/a;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "AsyncBody", "(Lwn0/l;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Lwn0/p;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "Lexpo/modules/kotlin/Promise;", "AsyncFunctionWithPromise", "(Lwn0/q;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Lwn0/r;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Lwn0/s;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Lwn0/t;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Lwn0/u;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Lwn0/v;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "build$expo_modules_core_release", "()Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "build", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "getConverters", "()Lexpo/modules/kotlin/types/TypeConverterProvider;", "getConverters$annotations", "asyncFunctionComponent", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "getAsyncFunctionComponent", "setAsyncFunctionComponent", "(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V", "getAsyncFunctionComponent$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AsyncFunctionBuilder {
    private BaseAsyncFunctionComponent asyncFunctionComponent;
    private final TypeConverterProvider converters;
    private final String name;

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$5, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass5 implements p<Object[], Promise, h0> {
        final /* synthetic */ l<P0, R> $body;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(l<? super P0, ? extends R> lVar) {
            this.$body = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object[] objArr, Promise promise) {
            s.k(objArr, "<unused var>");
            s.k(promise, "promise");
            l<P0, R> lVar = this.$body;
            s.q(1, "P0");
            lVar.invoke((P0) promise);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
            invoke2(objArr, promise);
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", ""}, k = 3, mv = {2, 0, 0}, xi = 176)
    @DebugMetadata(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$1", f = "AsyncFunctionBuilder.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class C46321 extends SuspendLambda implements q<CoroutineScope, Object[], Continuation<? super Object>, Object> {
        final /* synthetic */ l<Continuation<? super R>, Object> $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C46321(l<? super Continuation<? super R>, ? extends Object> lVar, Continuation<? super C46321> continuation) {
            super(3, continuation);
            this.$block = lVar;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$1 for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r4)
                return r4
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                jn0.t.b(r4)
                wn0.l<kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r3.$block
                r3.label = r2
                java.lang.Object r4 = r4.invoke(r3)
                if (r4 != r0) goto L25
                return r0
            L25:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.C46321.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$1 for r0v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r1) {
            /*
                r0 = this;
                wn0.l<kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r0.$block
                java.lang.Object r1 = r1.invoke(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.C46321.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
            return new C46321(this.$block, continuation).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$11, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", ""}, k = 3, mv = {2, 0, 0}, xi = 176)
    @DebugMetadata(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$11", f = "AsyncFunctionBuilder.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass11 extends SuspendLambda implements q<CoroutineScope, Object[], Continuation<? super Object>, Object> {
        final /* synthetic */ t<P0, P1, P2, P3, P4, Continuation<? super R>, Object> $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass11(t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super Continuation<? super R>, ? extends Object> tVar, Continuation<? super AnonymousClass11> continuation) {
            super(3, continuation);
            this.$block = tVar;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$11 for r10v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r11)
                return r11
            Lf:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L17:
                jn0.t.b(r11)
                java.lang.Object r11 = r10.L$0
                java.lang.Object[] r11 = (java.lang.Object[]) r11
                r1 = 0
                r4 = r11[r1]
                r5 = r11[r2]
                r1 = 2
                r6 = r11[r1]
                r1 = 3
                r7 = r11[r1]
                r1 = 4
                r8 = r11[r1]
                wn0.t<P0, P1, P2, P3, P4, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r3 = r10.$block
                r10.label = r2
                r9 = r10
                java.lang.Object r11 = r3.i(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L38
                return r0
            L38:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.AnonymousClass11.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$11 for r8v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r9 = r8.L$0
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                r0 = 0
                r2 = r9[r0]
                r0 = 1
                r3 = r9[r0]
                r0 = 2
                r4 = r9[r0]
                r0 = 3
                r5 = r9[r0]
                r0 = 4
                r6 = r9[r0]
                wn0.t<P0, P1, P2, P3, P4, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r8.$block
                r7 = r8
                java.lang.Object r9 = r1.i(r2, r3, r4, r5, r6, r7)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.AnonymousClass11.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
            AnonymousClass11 anonymousClass11 = new AnonymousClass11(this.$block, continuation);
            anonymousClass11.L$0 = objArr;
            return anonymousClass11.invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$13, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", ""}, k = 3, mv = {2, 0, 0}, xi = 176)
    @DebugMetadata(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$13", f = "AsyncFunctionBuilder.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass13 extends SuspendLambda implements q<CoroutineScope, Object[], Continuation<? super Object>, Object> {
        final /* synthetic */ u<P0, P1, P2, P3, P4, P5, Continuation<? super R>, Object> $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass13(u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super Continuation<? super R>, ? extends Object> uVar, Continuation<? super AnonymousClass13> continuation) {
            super(3, continuation);
            this.$block = uVar;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$13 for r11v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r12)
                return r12
            Lf:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L17:
                jn0.t.b(r12)
                java.lang.Object r12 = r11.L$0
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                r1 = 0
                r4 = r12[r1]
                r5 = r12[r2]
                r1 = 2
                r6 = r12[r1]
                r1 = 3
                r7 = r12[r1]
                r1 = 4
                r8 = r12[r1]
                r1 = 5
                r9 = r12[r1]
                wn0.u<P0, P1, P2, P3, P4, P5, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r3 = r11.$block
                r11.label = r2
                r10 = r11
                java.lang.Object r12 = r3.k(r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L3b
                return r0
            L3b:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.AnonymousClass13.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$13 for r9v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r10 = r9.L$0
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                r0 = 0
                r2 = r10[r0]
                r0 = 1
                r3 = r10[r0]
                r0 = 2
                r4 = r10[r0]
                r0 = 3
                r5 = r10[r0]
                r0 = 4
                r6 = r10[r0]
                r0 = 5
                r7 = r10[r0]
                wn0.u<P0, P1, P2, P3, P4, P5, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r9.$block
                r8 = r9
                java.lang.Object r10 = r1.k(r2, r3, r4, r5, r6, r7, r8)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.AnonymousClass13.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
            AnonymousClass13 anonymousClass13 = new AnonymousClass13(this.$block, continuation);
            anonymousClass13.L$0 = objArr;
            return anonymousClass13.invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$15, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", ""}, k = 3, mv = {2, 0, 0}, xi = 176)
    @DebugMetadata(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$15", f = "AsyncFunctionBuilder.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass15 extends SuspendLambda implements q<CoroutineScope, Object[], Continuation<? super Object>, Object> {
        final /* synthetic */ v<P0, P1, P2, P3, P4, P5, P6, Continuation<? super R>, Object> $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass15(v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super Continuation<? super R>, ? extends Object> vVar, Continuation<? super AnonymousClass15> continuation) {
            super(3, continuation);
            this.$block = vVar;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$15 for r12v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r13)
                return r13
            Lf:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L17:
                jn0.t.b(r13)
                java.lang.Object r13 = r12.L$0
                java.lang.Object[] r13 = (java.lang.Object[]) r13
                r1 = 0
                r4 = r13[r1]
                r5 = r13[r2]
                r1 = 2
                r6 = r13[r1]
                r1 = 3
                r7 = r13[r1]
                r1 = 4
                r8 = r13[r1]
                r1 = 5
                r9 = r13[r1]
                r1 = 6
                r10 = r13[r1]
                wn0.v<P0, P1, P2, P3, P4, P5, P6, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r3 = r12.$block
                r12.label = r2
                r11 = r12
                java.lang.Object r13 = r3.g(r4, r5, r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L3e
                return r0
            L3e:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.AnonymousClass15.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$15 for r10v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r11 = r10.L$0
                java.lang.Object[] r11 = (java.lang.Object[]) r11
                r0 = 0
                r2 = r11[r0]
                r0 = 1
                r3 = r11[r0]
                r0 = 2
                r4 = r11[r0]
                r0 = 3
                r5 = r11[r0]
                r0 = 4
                r6 = r11[r0]
                r0 = 5
                r7 = r11[r0]
                r0 = 6
                r8 = r11[r0]
                wn0.v<P0, P1, P2, P3, P4, P5, P6, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r10.$block
                r9 = r10
                java.lang.Object r11 = r1.g(r2, r3, r4, r5, r6, r7, r8, r9)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.AnonymousClass15.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
            AnonymousClass15 anonymousClass15 = new AnonymousClass15(this.$block, continuation);
            anonymousClass15.L$0 = objArr;
            return anonymousClass15.invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$17, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", ""}, k = 3, mv = {2, 0, 0}, xi = 176)
    @DebugMetadata(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$17", f = "AsyncFunctionBuilder.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass17 extends SuspendLambda implements q<CoroutineScope, Object[], Continuation<? super Object>, Object> {
        final /* synthetic */ w<P0, P1, P2, P3, P4, P5, P6, P7, Continuation<? super R>, Object> $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass17(w<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? super Continuation<? super R>, ? extends Object> wVar, Continuation<? super AnonymousClass17> continuation) {
            super(3, continuation);
            this.$block = wVar;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$17 for r13v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r14)
                return r14
            Lf:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L17:
                jn0.t.b(r14)
                java.lang.Object r14 = r13.L$0
                java.lang.Object[] r14 = (java.lang.Object[]) r14
                r1 = 0
                r4 = r14[r1]
                r5 = r14[r2]
                r1 = 2
                r6 = r14[r1]
                r1 = 3
                r7 = r14[r1]
                r1 = 4
                r8 = r14[r1]
                r1 = 5
                r9 = r14[r1]
                r1 = 6
                r10 = r14[r1]
                r1 = 7
                r11 = r14[r1]
                wn0.w<P0, P1, P2, P3, P4, P5, P6, P7, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r3 = r13.$block
                r13.label = r2
                r12 = r13
                java.lang.Object r14 = r3.m(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L41
                return r0
            L41:
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.AnonymousClass17.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$17 for r11v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r12 = r11.L$0
                java.lang.Object[] r12 = (java.lang.Object[]) r12
                r0 = 0
                r2 = r12[r0]
                r0 = 1
                r3 = r12[r0]
                r0 = 2
                r4 = r12[r0]
                r0 = 3
                r5 = r12[r0]
                r0 = 4
                r6 = r12[r0]
                r0 = 5
                r7 = r12[r0]
                r0 = 6
                r8 = r12[r0]
                r0 = 7
                r9 = r12[r0]
                wn0.w<P0, P1, P2, P3, P4, P5, P6, P7, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r11.$block
                r10 = r11
                java.lang.Object r12 = r1.m(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.AnonymousClass17.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
            AnonymousClass17 anonymousClass17 = new AnonymousClass17(this.$block, continuation);
            anonymousClass17.L$0 = objArr;
            return anonymousClass17.invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", ""}, k = 3, mv = {2, 0, 0}, xi = 176)
    @DebugMetadata(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$3", f = "AsyncFunctionBuilder.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class C46333 extends SuspendLambda implements q<CoroutineScope, Object[], Continuation<? super Object>, Object> {
        final /* synthetic */ p<P0, Continuation<? super R>, Object> $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C46333(p<? super P0, ? super Continuation<? super R>, ? extends Object> pVar, Continuation<? super C46333> continuation) {
            super(3, continuation);
            this.$block = pVar;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$3 for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r4)
                return r4
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                jn0.t.b(r4)
                java.lang.Object r4 = r3.L$0
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                r1 = 0
                r4 = r4[r1]
                wn0.p<P0, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r3.$block
                r3.label = r2
                java.lang.Object r4 = r1.invoke(r4, r3)
                if (r4 != r0) goto L2c
                return r0
            L2c:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.C46333.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$3 for r1v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.Object r2 = r1.L$0
                java.lang.Object[] r2 = (java.lang.Object[]) r2
                r0 = 0
                r2 = r2[r0]
                wn0.p<P0, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r0 = r1.$block
                java.lang.Object r2 = r0.invoke(r2, r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.C46333.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
            C46333 c46333 = new C46333(this.$block, continuation);
            c46333.L$0 = objArr;
            return c46333.invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$5, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", ""}, k = 3, mv = {2, 0, 0}, xi = 176)
    @DebugMetadata(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$5", f = "AsyncFunctionBuilder.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class C46345 extends SuspendLambda implements q<CoroutineScope, Object[], Continuation<? super Object>, Object> {
        final /* synthetic */ q<P0, P1, Continuation<? super R>, Object> $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C46345(q<? super P0, ? super P1, ? super Continuation<? super R>, ? extends Object> qVar, Continuation<? super C46345> continuation) {
            super(3, continuation);
            this.$block = qVar;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$5 for r4v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r5)
                return r5
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                jn0.t.b(r5)
                java.lang.Object r5 = r4.L$0
                java.lang.Object[] r5 = (java.lang.Object[]) r5
                r1 = 0
                r1 = r5[r1]
                r5 = r5[r2]
                wn0.q<P0, P1, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r3 = r4.$block
                r4.label = r2
                java.lang.Object r5 = r3.invoke(r1, r5, r4)
                if (r5 != r0) goto L2e
                return r0
            L2e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.C46345.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$5 for r2v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Object r3 = r2.L$0
                java.lang.Object[] r3 = (java.lang.Object[]) r3
                r0 = 0
                r0 = r3[r0]
                r1 = 1
                r3 = r3[r1]
                wn0.q<P0, P1, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r2.$block
                java.lang.Object r3 = r1.invoke(r0, r3, r2)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.C46345.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
            C46345 c46345 = new C46345(this.$block, continuation);
            c46345.L$0 = objArr;
            return c46345.invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", ""}, k = 3, mv = {2, 0, 0}, xi = 176)
    @DebugMetadata(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$7", f = "AsyncFunctionBuilder.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass7 extends SuspendLambda implements q<CoroutineScope, Object[], Continuation<? super Object>, Object> {
        final /* synthetic */ r<P0, P1, P2, Continuation<? super R>, Object> $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(r<? super P0, ? super P1, ? super P2, ? super Continuation<? super R>, ? extends Object> rVar, Continuation<? super AnonymousClass7> continuation) {
            super(3, continuation);
            this.$block = rVar;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$7 for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r6)
                return r6
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                jn0.t.b(r6)
                java.lang.Object r6 = r5.L$0
                java.lang.Object[] r6 = (java.lang.Object[]) r6
                r1 = 0
                r1 = r6[r1]
                r3 = r6[r2]
                r4 = 2
                r6 = r6[r4]
                wn0.r<P0, P1, P2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r5.$block
                r5.label = r2
                java.lang.Object r6 = r4.invoke(r1, r3, r6, r5)
                if (r6 != r0) goto L31
                return r0
            L31:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.AnonymousClass7.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$7 for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r4 = r3.L$0
                java.lang.Object[] r4 = (java.lang.Object[]) r4
                r0 = 0
                r0 = r4[r0]
                r1 = 1
                r1 = r4[r1]
                r2 = 2
                r4 = r4[r2]
                wn0.r<P0, P1, P2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r2 = r3.$block
                java.lang.Object r4 = r2.invoke(r0, r1, r4, r3)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.AnonymousClass7.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$block, continuation);
            anonymousClass7.L$0 = objArr;
            return anonymousClass7.invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "<destruct>", ""}, k = 3, mv = {2, 0, 0}, xi = 176)
    @DebugMetadata(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$9", f = "AsyncFunctionBuilder.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass9 extends SuspendLambda implements q<CoroutineScope, Object[], Continuation<? super Object>, Object> {
        final /* synthetic */ wn0.s<P0, P1, P2, P3, Continuation<? super R>, Object> $block;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(wn0.s<? super P0, ? super P1, ? super P2, ? super P3, ? super Continuation<? super R>, ? extends Object> sVar, Continuation<? super AnonymousClass9> continuation) {
            super(3, continuation);
            this.$block = sVar;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Object[] objArr, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, objArr, (Continuation<Object>) continuation);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$9 for r9v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r10)
                return r10
            Lf:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L17:
                jn0.t.b(r10)
                java.lang.Object r10 = r9.L$0
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                r1 = 0
                r4 = r10[r1]
                r5 = r10[r2]
                r1 = 2
                r6 = r10[r1]
                r1 = 3
                r7 = r10[r1]
                wn0.s<P0, P1, P2, P3, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r3 = r9.$block
                r9.label = r2
                r8 = r9
                java.lang.Object r10 = r3.d(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L35
                return r0
            L35:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.AnonymousClass9.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$9 for r7v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r8 = r7.L$0
                java.lang.Object[] r8 = (java.lang.Object[]) r8
                r0 = 0
                r2 = r8[r0]
                r0 = 1
                r3 = r8[r0]
                r0 = 2
                r4 = r8[r0]
                r0 = 3
                r5 = r8[r0]
                wn0.s<P0, P1, P2, P3, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r7.$block
                r6 = r7
                java.lang.Object r8 = r1.d(r2, r3, r4, r5, r6)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilder.AnonymousClass9.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Object[] objArr, Continuation<Object> continuation) {
            AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.$block, continuation);
            anonymousClass9.L$0 = objArr;
            return anonymousClass9.invokeSuspend(h0.f84049a);
        }
    }

    public AsyncFunctionBuilder(String name, TypeConverterProvider typeConverterProvider) {
        s.k(name, "name");
        this.name = name;
        this.converters = typeConverterProvider;
    }

    public static /* synthetic */ void getAsyncFunctionComponent$annotations() {
    }

    public static /* synthetic */ void getConverters$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public final /* synthetic */ <R> AsyncFunctionComponent AsyncBody(final wn0.a<? extends R> body) {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        s.k(body, "body");
        String name = getName();
        AnyType[] anyTypeArr = new AnyType[0];
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.3
            @Override // wn0.l
            public final R invoke(Object[] it) {
                s.k(it, "it");
                return body.invoke();
            }
        };
        s.q(3, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            stringAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            stringAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            stringAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            stringAsyncFunctionComponent = s.f(Object.class, String.class) ? new StringAsyncFunctionComponent(name, anyTypeArr, lVar) : new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        setAsyncFunctionComponent(stringAsyncFunctionComponent);
        return stringAsyncFunctionComponent;
    }

    public final AsyncFunctionComponent AsyncBodyWithoutArgs(final wn0.a<? extends Object> body) {
        s.k(body, "body");
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(getName(), new AnyType[0], new l<Object[], Object>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.1
            @Override // wn0.l
            public final Object invoke(Object[] it) {
                s.k(it, "it");
                return body.invoke();
            }
        });
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent AsyncFunctionWithPromise(final p<? super P0, ? super Promise, ? extends R> body) {
        s.k(body, "body");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$4 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$4 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$4
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$4), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.10
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                s.k(objArr, "<destruct>");
                s.k(promise, "promise");
                body.invoke((P0) objArr[0], promise);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return h0.f84049a;
            }
        });
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R> BaseAsyncFunctionComponent SuspendBody(l<? super Continuation<? super R>, ? extends Object> block) {
        s.k(block, "block");
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(getName(), new AnyType[0], new C46321(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final BaseAsyncFunctionComponent build$expo_modules_core_release() {
        BaseAsyncFunctionComponent baseAsyncFunctionComponent = this.asyncFunctionComponent;
        if (baseAsyncFunctionComponent != null) {
            return baseAsyncFunctionComponent;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final BaseAsyncFunctionComponent getAsyncFunctionComponent() {
        return this.asyncFunctionComponent;
    }

    public final TypeConverterProvider getConverters() {
        return this.converters;
    }

    public final String getName() {
        return this.name;
    }

    public final void setAsyncFunctionComponent(BaseAsyncFunctionComponent baseAsyncFunctionComponent) {
        this.asyncFunctionComponent = baseAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> SuspendFunctionComponent SuspendBody(p<? super P0, ? super Continuation<? super R>, ? extends Object> block) {
        s.k(block, "block");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$1 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$1 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$1), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType}, new C46333(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public /* synthetic */ AsyncFunctionBuilder(String str, TypeConverterProvider typeConverterProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : typeConverterProvider);
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent AsyncBody(final l<? super P0, ? extends R> body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(body, "body");
        s.q(4, "P0");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$1 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$1 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$1), converters);
        }
        AnyType[] anyTypeArr = {anyType};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.6
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0]);
            }
        };
        s.q(3, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent AsyncFunctionWithPromise(final q<? super P0, ? super P1, ? super Promise, ? extends R> body) {
        s.k(body, "body");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$8 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$8 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$8), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$9 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$9 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$9
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$9), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.14
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                s.k(objArr, "<destruct>");
                s.k(promise, "promise");
                body.invoke((P0) objArr[0], (P1) objArr[1], promise);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return h0.f84049a;
            }
        });
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1> SuspendFunctionComponent SuspendBody(q<? super P0, ? super P1, ? super Continuation<? super R>, ? extends Object> block) {
        s.k(block, "block");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$2 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$2 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$2), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$3 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$3 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$3), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2}, new C46345(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent AsyncFunctionWithPromise(final r<? super P0, ? super P1, ? super P2, ? super Promise, ? extends R> body) {
        s.k(body, "body");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$14 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$14 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$14
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$14), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$15 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$15 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$15
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$15), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$16 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$16 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$16
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$16), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.18
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                s.k(objArr, "<destruct>");
                s.k(promise, "promise");
                body.invoke((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], promise);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return h0.f84049a;
            }
        });
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> SuspendFunctionComponent SuspendBody(r<? super P0, ? super P1, ? super P2, ? super Continuation<? super R>, ? extends Object> block) {
        s.k(block, "block");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$4 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$4 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$4
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$4), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$5 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$5 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$5
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$5), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$6 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$6 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$6
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$6), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3}, new AnonymousClass7(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent AsyncBody(final p<? super P0, ? super P1, ? extends R> body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(body, "body");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$2 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$2 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$2), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$3 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$3 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$3), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.8
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0], (P1) objArr[1]);
            }
        };
        s.q(3, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent AsyncFunctionWithPromise(final wn0.s<? super P0, ? super P1, ? super P2, ? super P3, ? super Promise, ? extends R> body) {
        s.k(body, "body");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$22 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$22 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$22
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$22), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$23 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$23 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$23
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$23), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$24 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$24 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$24
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$24), converters);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$25 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$25 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$25
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$25), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.22
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                s.k(objArr, "<destruct>");
                s.k(promise, "promise");
                body.d((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], promise);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return h0.f84049a;
            }
        });
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> SuspendFunctionComponent SuspendBody(wn0.s<? super P0, ? super P1, ? super P2, ? super P3, ? super Continuation<? super R>, ? extends Object> block) {
        s.k(block, "block");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$7 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$7 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$7
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$7), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$8 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$8 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$8), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$9 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$9 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$9
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$9), converters);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$10 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$10 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$10
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$10), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4}, new AnonymousClass9(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent AsyncBody(final q<? super P0, ? super P1, ? super P2, ? extends R> body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(body, "body");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$5 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$5 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$5
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$5), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$6 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$6 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$6
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$6), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$7 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$7 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$7
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$7), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.12
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0], (P1) objArr[1], (P2) objArr[2]);
            }
        };
        s.q(3, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent AsyncFunctionWithPromise(final t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super Promise, ? extends R> body) {
        int i11;
        int i12;
        int i13;
        int i14;
        s.k(body, "body");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$32 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$32 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$32
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$32), converters);
        } else {
            i11 = 3;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(i11, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$33 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$33 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$33
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i12 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$33), converters);
        } else {
            i12 = 3;
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(i12, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$34 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$34 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$34
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$34), converters);
        } else {
            i13 = 3;
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(i13, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$35 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$35 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$35
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            i14 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$35), converters);
        } else {
            i14 = 3;
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(i14, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$36 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$36 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$36
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$36), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.26
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                s.k(objArr, "<destruct>");
                s.k(promise, "promise");
                body.i((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], promise);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return h0.f84049a;
            }
        });
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> SuspendFunctionComponent SuspendBody(t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super Continuation<? super R>, ? extends Object> block) {
        int i11;
        int i12;
        int i13;
        int i14;
        s.k(block, "block");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$11 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$11 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$11
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$11), converters);
        } else {
            i11 = 3;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(i11, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$12 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$12 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$12
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i12 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$12), converters);
        } else {
            i12 = 3;
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(i12, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$13 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$13 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$13
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$13), converters);
        } else {
            i13 = 3;
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(i13, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$14 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$14 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$14
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            i14 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$14), converters);
        } else {
            i14 = 3;
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(i14, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$15 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$15 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$15
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$15), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5}, new AnonymousClass11(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent AsyncBody(final r<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(body, "body");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$10 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$10 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$10
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$10), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$11 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$11 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$11
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$11), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$12 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$12 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$12
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$12), converters);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$13 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$13 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$13
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$13), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.16
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3]);
            }
        };
        s.q(3, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent AsyncFunctionWithPromise(final u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super Promise, ? extends R> body) {
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        AnyType anyType6;
        s.k(body, "body");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$44 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$44 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$44
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$44), converters);
        } else {
            i11 = 3;
            anyType = anyType7;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(r13);
        s.q(i11, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$45 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$45 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$45
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$45), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType8;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(r13);
        s.q(i13, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$46 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$46 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$46
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(r13);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$46), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType9;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(r13);
        s.q(i15, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$47 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$47 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$47
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(r13);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$47), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType10;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(r13);
        s.q(i17, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$48 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$48 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$48
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(r13);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$48), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType11;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(r13);
        s.q(i19, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$49 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$49 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$49
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(r13);
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$49), converters);
        } else {
            anyType6 = anyType12;
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.30
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                s.k(objArr, "<destruct>");
                s.k(promise, "promise");
                body.k((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5], promise);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return h0.f84049a;
            }
        });
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> SuspendFunctionComponent SuspendBody(u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super Continuation<? super R>, ? extends Object> block) {
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        AnyType anyType6;
        s.k(block, "block");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$16 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$16 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$16
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$16), converters);
        } else {
            i11 = 3;
            anyType = anyType7;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(r13);
        s.q(i11, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$17 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$17 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$17
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$17), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType8;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(r13);
        s.q(i13, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$18 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$18 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$18
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(r13);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$18), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType9;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(r13);
        s.q(i15, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$19 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$19 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$19
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(r13);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$19), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType10;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(r13);
        s.q(i17, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$20 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$20 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$20
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(r13);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$20), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType11;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(r13);
        s.q(i19, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$21 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$21 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$21
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(r13);
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$21), converters);
        } else {
            anyType6 = anyType12;
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6}, new AnonymousClass13(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent AsyncBody(final wn0.s<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(body, "body");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$17 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$17 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$17
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$17), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$18 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$18 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$18
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$18), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$19 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$19 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$19
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$19), converters);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$20 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$20 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$20
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$20), converters);
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(3, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$21 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$21 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$21
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$21), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.20
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.d((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4]);
            }
        };
        s.q(3, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent AsyncFunctionWithPromise(final v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super Promise, ? extends R> body) {
        Class cls;
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        int i21;
        int i22;
        AnyType anyType6;
        AnyType anyType7;
        s.k(body, "body");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        s.q(4, "P6");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType8 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$58 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$58 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$58
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            cls = Object.class;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(cls);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$58), converters);
        } else {
            cls = Object.class;
            i11 = 3;
            anyType = anyType8;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(cls);
        s.q(i11, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$59 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$59 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$59
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(cls);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$59), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType9;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(cls);
        s.q(i13, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$60 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$60 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$60
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(cls);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$60), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType10;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(cls);
        s.q(i15, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$61 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$61 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$61
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(cls);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$61), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType11;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(cls);
        s.q(i17, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$62 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$62 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$62
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(cls);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$62), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType12;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(cls);
        s.q(i19, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$63 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$63 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$63
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(cls);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$63), converters);
        } else {
            i21 = 4;
            i22 = 3;
            anyType6 = anyType13;
        }
        s.q(i21, "P6");
        co0.d dVarB13 = o0.b(cls);
        s.q(i22, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$64 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$64 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$64
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(cls);
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$64), converters);
        } else {
            anyType7 = anyType14;
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.34
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] objArr, Promise promise) {
                s.k(objArr, "<destruct>");
                s.k(promise, "promise");
                body.g((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5], (P6) objArr[6], promise);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                invoke2(objArr, promise);
                return h0.f84049a;
            }
        });
        setAsyncFunctionComponent(asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> SuspendFunctionComponent SuspendBody(v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super Continuation<? super R>, ? extends Object> block) {
        Class cls;
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        int i21;
        int i22;
        AnyType anyType6;
        AnyType anyType7;
        s.k(block, "block");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        s.q(4, "P6");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType8 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$22 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$22 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$22
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            cls = Object.class;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(cls);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$22), converters);
        } else {
            cls = Object.class;
            i11 = 3;
            anyType = anyType8;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(cls);
        s.q(i11, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$23 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$23 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$23
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(cls);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$23), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType9;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(cls);
        s.q(i13, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$24 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$24 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$24
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(cls);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$24), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType10;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(cls);
        s.q(i15, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$25 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$25 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$25
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(cls);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$25), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType11;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(cls);
        s.q(i17, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$26 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$26 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$26
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(cls);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$26), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType12;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(cls);
        s.q(i19, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$27 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$27 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$27
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(cls);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$27), converters);
        } else {
            i21 = 4;
            i22 = 3;
            anyType6 = anyType13;
        }
        s.q(i21, "P6");
        co0.d dVarB13 = o0.b(cls);
        s.q(i22, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$28 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$28 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$28
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(cls);
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$28), converters);
        } else {
            anyType7 = anyType14;
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7}, new AnonymousClass15(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent AsyncBody(final t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends R> body) {
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        int i21;
        AnyType anyType6;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(body, "body");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$26 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$26 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$26
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$26), converters);
        } else {
            i11 = 3;
            anyType = anyType7;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(i11, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$27 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$27 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$27
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$27), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType8;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(i13, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$28 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$28 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$28
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$28), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType9;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(i15, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$29 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$29 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$29
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$29), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType10;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(i17, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$30 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$30 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$30
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$30), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType11;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(Object.class);
        s.q(i19, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$31 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$31 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$31
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(Object.class);
            i21 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$31), converters);
        } else {
            i21 = 3;
            anyType6 = anyType12;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.24
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.i((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5]);
            }
        };
        s.q(i21, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> SuspendFunctionComponent SuspendBody(w<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? super Continuation<? super R>, ? extends Object> block) {
        Class cls;
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        int i21;
        int i22;
        AnyType anyType6;
        int i23;
        int i24;
        AnyType anyType7;
        AnyType anyType8;
        s.k(block, "block");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        s.q(4, "P6");
        s.q(4, "P7");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType9 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$29 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$29 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$29
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            cls = Object.class;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(cls);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$29), converters);
        } else {
            cls = Object.class;
            i11 = 3;
            anyType = anyType9;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(cls);
        s.q(i11, "P1");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType10 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$30 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$30 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$30
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(cls);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$30), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType10;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(cls);
        s.q(i13, "P2");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType11 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$31 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$31 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$31
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(cls);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$31), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType11;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(cls);
        s.q(i15, "P3");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType12 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$32 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$32 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$32
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(cls);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$32), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType12;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(cls);
        s.q(i17, "P4");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType13 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$33 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$33 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$33
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(cls);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$33), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType13;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(cls);
        s.q(i19, "P5");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType14 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$34 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$34 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$34
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(cls);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$34), converters);
        } else {
            i21 = 4;
            i22 = 3;
            anyType6 = anyType14;
        }
        s.q(i21, "P6");
        co0.d dVarB13 = o0.b(cls);
        s.q(i22, "P6");
        AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType15 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$35 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$35 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$35
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            i23 = 4;
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(cls);
            i24 = 3;
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$35), converters);
        } else {
            i23 = 4;
            i24 = 3;
            anyType7 = anyType15;
        }
        s.q(i23, "P7");
        co0.d dVarB15 = o0.b(cls);
        s.q(i24, "P7");
        AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(dVarB15, false));
        if (anyType16 == null) {
            s.p();
            AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$36 asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$36 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$36
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P7");
                    return null;
                }
            };
            s.q(4, "P7");
            co0.d dVarB16 = o0.b(cls);
            s.q(3, "P7");
            anyType8 = new AnyType(new LazyKType(dVarB16, false, asyncFunctionBuilder$SuspendBody$$inlined$toArgsArray$default$36), converters);
        } else {
            anyType8 = anyType16;
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8}, new AnonymousClass17(block, null));
        setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent AsyncBody(final u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends R> body) {
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        int i21;
        int i22;
        AnyType anyType6;
        int i23;
        AnyType anyType7;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(body, "body");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        s.q(4, "P6");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType8 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$37 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$37 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$37
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$37), converters);
        } else {
            i11 = 3;
            anyType = anyType8;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(i11, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$38 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$38 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$38
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$38), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType9;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(i13, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$39 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$39 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$39
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$39), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType10;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(i15, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$40 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$40 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$40
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$40), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType11;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(i17, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$41 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$41 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$41
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$41), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType12;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(Object.class);
        s.q(i19, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$42 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$42 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$42
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(Object.class);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$42), converters);
        } else {
            i21 = 4;
            i22 = 3;
            anyType6 = anyType13;
        }
        s.q(i21, "P6");
        co0.d dVarB13 = o0.b(Object.class);
        s.q(i22, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$43 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$43 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$43
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(Object.class);
            i23 = 3;
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$43), converters);
        } else {
            i23 = 3;
            anyType7 = anyType14;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.28
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.k((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5], (P6) objArr[6]);
            }
        };
        s.q(i23, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> AsyncFunctionComponent AsyncBody(final v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends R> body) {
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        int i21;
        int i22;
        AnyType anyType6;
        int i23;
        int i24;
        AnyType anyType7;
        int i25;
        AnyType anyType8;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(body, "body");
        String name = getName();
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        s.q(4, "P6");
        s.q(4, "P7");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType9 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$50 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$50 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$50
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$50), converters);
        } else {
            i11 = 3;
            anyType = anyType9;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(r14);
        s.q(i11, "P1");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType10 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(r14);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$51), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType10;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(r14);
        s.q(i13, "P2");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType11 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$52 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$52 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$52
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(r14);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$52), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType11;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(r14);
        s.q(i15, "P3");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType12 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$53 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$53 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$53
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(r14);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$53), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType12;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(r14);
        s.q(i17, "P4");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType13 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$54 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$54 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$54
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(r14);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$54), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType13;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(r14);
        s.q(i19, "P5");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType14 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$55 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$55 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$55
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(r14);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$55), converters);
        } else {
            i21 = 4;
            i22 = 3;
            anyType6 = anyType14;
        }
        s.q(i21, "P6");
        co0.d dVarB13 = o0.b(r14);
        s.q(i22, "P6");
        AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType15 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$56 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$56 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$56
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            i23 = 4;
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(r14);
            i24 = 3;
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$56), converters);
        } else {
            i23 = 4;
            i24 = 3;
            anyType7 = anyType15;
        }
        s.q(i23, "P7");
        co0.d dVarB15 = o0.b(r14);
        s.q(i24, "P7");
        AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(dVarB15, false));
        if (anyType16 == null) {
            s.p();
            AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$57 asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$57 = new wn0.a<co0.q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$57
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final co0.q invoke() {
                    s.q(6, "P7");
                    return null;
                }
            };
            s.q(4, "P7");
            co0.d dVarB16 = o0.b(r14);
            i25 = 3;
            s.q(3, "P7");
            anyType8 = new AnyType(new LazyKType(dVarB16, false, asyncFunctionBuilder$AsyncBody$$inlined$toArgsArray$default$57), converters);
        } else {
            i25 = 3;
            anyType8 = anyType16;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilder.AsyncBody.32
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final R invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.g((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5], (P6) objArr[6], (P7) objArr[7]);
            }
        };
        s.q(i25, "R");
        s.q(4, "R");
        if (s.f(Object.class, Integer.TYPE)) {
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Boolean.TYPE)) {
            untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Double.TYPE)) {
            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, Float.TYPE)) {
            untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else if (s.f(Object.class, String.class)) {
            untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(name, anyTypeArr, lVar);
        } else {
            untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, anyTypeArr, lVar);
        }
        setAsyncFunctionComponent(untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }
}
