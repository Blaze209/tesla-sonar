package expo.modules.kotlin.objects;

import co0.h;
import co0.o;
import co0.q;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.EventsDefinition;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.FunctionBuilder;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.ModuleUtilsKt;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.Enumerable;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;
import wn0.r;
import wn0.t;
import wn0.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\r2\u001a\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n0\t¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u000e\u001a\u00020\r2.\u0010\u0012\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00110\u0010\"\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0016\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u000b2\u0010\b\u0004\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u001bJA\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u0014\b\u0004\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u001fJO\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u001a\b\u0004\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\"J]\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2 \b\u0004\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010%Jk\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2&\b\u0004\u0010\u0018\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000'H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010(Jy\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2,\b\u0004\u0010\u0018\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000*H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010+J\u0087\u0001\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b22\b\u0004\u0010\u0018\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000-H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010.J\u0095\u0001\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u0001\"\u0006\b\u0007\u0010/\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b28\b\u0004\u0010\u0018\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u000000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u00101J£\u0001\u0010\u0016\u001a\u00020\u0019\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u0001\"\u0006\b\u0007\u0010/\u0018\u0001\"\u0006\b\b\u00102\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2>\b\u0004\u0010\u0018\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u000003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u00104J-\u00108\u001a\u0002052\u0006\u0010\u0014\u001a\u00020\u000b2\u0010\b\u0004\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b6\u00107J3\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u00107JA\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u0014\b\u0004\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u00109JO\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u001a\b\u0004\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010:JG\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u001a\b\u0004\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00028\u00000!H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010:J]\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2 \b\u0004\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010=JU\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2 \b\u0004\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00028\u00000$H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010=Jk\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2&\b\u0004\u0010\u0018\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000'H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010>Jc\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2&\b\u0004\u0010\u0018\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00028\u00000'H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010>Jy\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2,\b\u0004\u0010\u0018\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000*H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010?Jq\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2,\b\u0004\u0010\u0018\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00028\u00000*H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010?J\u0087\u0001\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b22\b\u0004\u0010\u0018\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000-H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010@J\u007f\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b22\b\u0004\u0010\u0018\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00028\u00000-H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010@J\u0095\u0001\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u0001\"\u0006\b\u0007\u0010/\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b28\b\u0004\u0010\u0018\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u000000H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010AJ\u008d\u0001\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b28\b\u0004\u0010\u0018\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00028\u000000H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010AJ£\u0001\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u0001\"\u0006\b\u0007\u0010/\u0018\u0001\"\u0006\b\b\u00102\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2>\b\u0004\u0010\u0018\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u000003H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u0010BJ\u009b\u0001\u00108\u001a\u000205\"\u0006\b\u0000\u0010\u001c\u0018\u0001\"\u0006\b\u0001\u0010\u001d\u0018\u0001\"\u0006\b\u0002\u0010 \u0018\u0001\"\u0006\b\u0003\u0010#\u0018\u0001\"\u0006\b\u0004\u0010&\u0018\u0001\"\u0006\b\u0005\u0010)\u0018\u0001\"\u0006\b\u0006\u0010,\u0018\u0001\"\u0006\b\u0007\u0010/\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2>\b\u0004\u0010\u0018\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00028\u000003H\u0087\bø\u0001\u0000¢\u0006\u0004\b<\u0010BJ\u0015\u00108\u001a\u00020C2\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b8\u0010DJ!\u0010F\u001a\u00020\r2\u0012\u0010E\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0010\"\u00020\u000b¢\u0006\u0004\bF\u0010GJ\u001d\u0010F\u001a\u00020\r2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0007¢\u0006\u0004\bH\u0010GJ&\u0010F\u001a\u00020\r\"\u0014\b\u0000\u0010K\u0018\u0001*\u00020I*\b\u0012\u0004\u0012\u00028\u00000JH\u0086\b¢\u0006\u0004\bF\u0010LJ#\u0010N\u001a\u00020\r2\u0006\u0010M\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\bN\u0010OJ7\u0010N\u001a\u00020\r\"\u0012\b\u0000\u0010K*\u00020I*\b\u0012\u0004\u0012\u00028\u00000J2\u0006\u0010P\u001a\u00028\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\bN\u0010QJ\u001b\u0010N\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\bN\u0010\u000fJ#\u0010R\u001a\u00020\r2\u0006\u0010M\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\bR\u0010OJ7\u0010R\u001a\u00020\r\"\u0012\b\u0000\u0010K*\u00020I*\b\u0012\u0004\u0012\u00028\u00000J2\u0006\u0010P\u001a\u00028\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\bR\u0010QJ\u001b\u0010R\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\bR\u0010\u000fJ\u0017\u0010T\u001a\u00020S2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\bT\u0010UJ3\u0010T\u001a\u00020S\"\u0006\b\u0000\u0010K\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\bø\u0001\u0000¢\u0006\u0004\bT\u0010VJ\u0017\u0010X\u001a\u00020W2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\bX\u0010YJ3\u0010X\u001a\u00020W\"\u0006\b\u0000\u0010K\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u000b2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0086\bø\u0001\u0000¢\u0006\u0004\bX\u0010ZR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010[\u0012\u0004\b^\u0010L\u001a\u0004\b\\\u0010]R*\u0010\f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010_R*\u0010a\u001a\u0004\u0018\u00010`8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\ba\u0010b\u0012\u0004\bg\u0010L\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR4\u0010i\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00190h8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bi\u0010j\u0012\u0004\bo\u0010L\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR4\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00150h8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bp\u0010j\u0012\u0004\bs\u0010L\u001a\u0004\bq\u0010l\"\u0004\br\u0010nR4\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002050h8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bt\u0010j\u0012\u0004\bw\u0010L\u001a\u0004\bu\u0010l\"\u0004\bv\u0010nR\"\u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020C0h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010jR4\u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020S0h8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\by\u0010j\u0012\u0004\b|\u0010L\u001a\u0004\bz\u0010l\"\u0004\b{\u0010nR4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020W0h8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0012\u0010j\u0012\u0004\b\u007f\u0010L\u001a\u0004\b}\u0010l\"\u0004\b~\u0010nR\u001f\u0010\u0082\u0001\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0084\u0001"}, d2 = {"Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;", "", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converters", "<init>", "(Lexpo/modules/kotlin/types/TypeConverterProvider;)V", "Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "buildObject", "()Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "Lkotlin/Function0;", "", "", "legacyConstantsProvider", "Ljn0/h0;", "Constants", "(Lwn0/a;)V", "", "Lkotlin/Pair;", "constants", "([Lkotlin/Pair;)V", "name", "Lexpo/modules/kotlin/functions/FunctionBuilder;", "Function", "(Ljava/lang/String;)Lexpo/modules/kotlin/functions/FunctionBuilder;", "body", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "FunctionWithoutArgs", "(Ljava/lang/String;Lwn0/a;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "R", "P0", "Lkotlin/Function1;", "(Ljava/lang/String;Lwn0/l;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P1", "Lkotlin/Function2;", "(Ljava/lang/String;Lwn0/p;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P2", "Lkotlin/Function3;", "(Ljava/lang/String;Lwn0/q;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P3", "Lkotlin/Function4;", "(Ljava/lang/String;Lwn0/r;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P4", "Lkotlin/Function5;", "(Ljava/lang/String;Lwn0/s;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P5", "Lkotlin/Function6;", "(Ljava/lang/String;Lwn0/t;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P6", "Lkotlin/Function7;", "(Ljava/lang/String;Lwn0/u;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P7", "Lkotlin/Function8;", "(Ljava/lang/String;Lwn0/v;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "AsyncFunctionWithoutArgs", "(Ljava/lang/String;Lwn0/a;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "AsyncFunction", "(Ljava/lang/String;Lwn0/l;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lwn0/p;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "Lexpo/modules/kotlin/Promise;", "AsyncFunctionWithPromise", "(Ljava/lang/String;Lwn0/q;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lwn0/r;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lwn0/s;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lwn0/t;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lwn0/u;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "(Ljava/lang/String;Lwn0/v;)Lexpo/modules/kotlin/functions/AsyncFunctionComponent;", "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "(Ljava/lang/String;)Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "events", "Events", "([Ljava/lang/String;)V", "EventsWithArray", "Lexpo/modules/kotlin/types/Enumerable;", "", "T", "()V", "eventName", "OnStartObserving", "(Ljava/lang/String;Lwn0/a;)V", "enum", "(Ljava/lang/Enum;Lwn0/a;)V", "OnStopObserving", "Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", "Property", "(Ljava/lang/String;)Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", "(Ljava/lang/String;Lwn0/a;)Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", "Lexpo/modules/kotlin/objects/ConstantComponentBuilder;", "Constant", "(Ljava/lang/String;)Lexpo/modules/kotlin/objects/ConstantComponentBuilder;", "(Ljava/lang/String;Lwn0/a;)Lexpo/modules/kotlin/objects/ConstantComponentBuilder;", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "getConverters", "()Lexpo/modules/kotlin/types/TypeConverterProvider;", "getConverters$annotations", "Lwn0/a;", "Lexpo/modules/kotlin/events/EventsDefinition;", "eventsDefinition", "Lexpo/modules/kotlin/events/EventsDefinition;", "getEventsDefinition", "()Lexpo/modules/kotlin/events/EventsDefinition;", "setEventsDefinition", "(Lexpo/modules/kotlin/events/EventsDefinition;)V", "getEventsDefinition$annotations", "", "syncFunctions", "Ljava/util/Map;", "getSyncFunctions", "()Ljava/util/Map;", "setSyncFunctions", "(Ljava/util/Map;)V", "getSyncFunctions$annotations", "syncFunctionBuilder", "getSyncFunctionBuilder", "setSyncFunctionBuilder", "getSyncFunctionBuilder$annotations", "asyncFunctions", "getAsyncFunctions", "setAsyncFunctions", "getAsyncFunctions$annotations", "asyncFunctionBuilders", "properties", "getProperties", "setProperties", "getProperties$annotations", "getConstants", "setConstants", "getConstants$annotations", "", "Lexpo/modules/kotlin/objects/EventObservingDefinition;", "eventObservers", "Ljava/util/List;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ObjectDefinitionBuilder {
    private Map<String, AsyncFunctionBuilder> asyncFunctionBuilders;
    private Map<String, AsyncFunctionComponent> asyncFunctions;
    private Map<String, ConstantComponentBuilder> constants;
    private final TypeConverterProvider converters;
    private final List<EventObservingDefinition> eventObservers;
    private EventsDefinition eventsDefinition;
    private wn0.a<? extends Map<String, ? extends Object>> legacyConstantsProvider;
    private Map<String, PropertyComponentBuilder> properties;
    private Map<String, FunctionBuilder> syncFunctionBuilder;
    private Map<String, SyncFunctionComponent> syncFunctions;

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectDefinitionBuilder() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void getAsyncFunctions$annotations() {
    }

    public static /* synthetic */ void getConstants$annotations() {
    }

    public static /* synthetic */ void getConverters$annotations() {
    }

    public static /* synthetic */ void getEventsDefinition$annotations() {
    }

    public static /* synthetic */ void getProperties$annotations() {
    }

    public static /* synthetic */ void getSyncFunctionBuilder$annotations() {
    }

    public static /* synthetic */ void getSyncFunctions$annotations() {
    }

    public final /* synthetic */ <R> AsyncFunctionComponent AsyncFunction(String name, final wn0.a<? extends R> body) {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.3
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
        getAsyncFunctions().put(name, stringAsyncFunctionComponent);
        return stringAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final p<? super P0, ? super Promise, ? extends R> body) {
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$7), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.10
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
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final AsyncFunctionComponent AsyncFunctionWithoutArgs(String name, final wn0.a<? extends Object> body) {
        s.k(name, "name");
        s.k(body, "body");
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(name, new AnyType[0], new l<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.1
            @Override // wn0.l
            public final Object invoke(Object[] it) {
                s.k(it, "it");
                return body.invoke();
            }
        });
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public ConstantComponentBuilder Constant(String name) {
        s.k(name, "name");
        ConstantComponentBuilder constantComponentBuilder = new ConstantComponentBuilder(name);
        this.constants.put(name, constantComponentBuilder);
        return constantComponentBuilder;
    }

    public final void Constants(wn0.a<? extends Map<String, ? extends Object>> legacyConstantsProvider) {
        s.k(legacyConstantsProvider, "legacyConstantsProvider");
        this.legacyConstantsProvider = legacyConstantsProvider;
    }

    public final void Events(String... events) {
        s.k(events, "events");
        this.eventsDefinition = new EventsDefinition((String[]) n.h(events).toArray(new String[0]));
    }

    public final void EventsWithArray(String[] events) {
        s.k(events, "events");
        this.eventsDefinition = new EventsDefinition(events);
    }

    public final FunctionBuilder Function(String name) {
        s.k(name, "name");
        FunctionBuilder functionBuilder = new FunctionBuilder(name);
        this.syncFunctionBuilder.put(name, functionBuilder);
        return functionBuilder;
    }

    public final SyncFunctionComponent FunctionWithoutArgs(String name, final wn0.a<? extends Object> body) {
        s.k(name, "name");
        s.k(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(o0.b(Object.class));
            returnTypeProvider.getTypes().put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.2
            @Override // wn0.l
            public final Object invoke(Object[] it) {
                s.k(it, "it");
                return body.invoke();
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final void OnStartObserving(String eventName, wn0.a<h0> body) {
        s.k(eventName, "eventName");
        s.k(body, "body");
        this.eventObservers.add(new EventObservingDefinition(EventObservingDefinition.Type.StartObserving, new EventObservingDefinition.SelectedEventFiler(eventName), body));
    }

    public final void OnStopObserving(String eventName, wn0.a<h0> body) {
        s.k(eventName, "eventName");
        s.k(body, "body");
        this.eventObservers.add(new EventObservingDefinition(EventObservingDefinition.Type.StopObserving, new EventObservingDefinition.SelectedEventFiler(eventName), body));
    }

    public PropertyComponentBuilder Property(String name) {
        s.k(name, "name");
        PropertyComponentBuilder propertyComponentBuilder = new PropertyComponentBuilder(name);
        this.properties.put(name, propertyComponentBuilder);
        return propertyComponentBuilder;
    }

    public final ObjectDefinitionData buildObject() {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        for (final EventObservingDefinition.Type type : EventObservingDefinition.Type.getEntries()) {
            if (!this.asyncFunctions.containsKey(type.getValue())) {
                String value = type.getValue();
                if (s.f(String.class, Promise.class)) {
                    asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(value, new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$buildObject$lambda$3$$inlined$AsyncFunction$1
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Object[] objArr, Promise promise) {
                            s.k(objArr, "<unused var>");
                            s.k(promise, "promise");
                            String str = (String) promise;
                            Iterator it = this.this$0.eventObservers.iterator();
                            while (it.hasNext()) {
                                ((EventObservingDefinition) it.next()).invokedIfNeed(type, str);
                            }
                        }

                        @Override // wn0.p
                        public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                            invoke2(objArr, promise);
                            return h0.f84049a;
                        }
                    });
                } else {
                    TypeConverterProvider converters = getConverters();
                    AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(String.class), Boolean.FALSE));
                    if (anyType == null) {
                        anyType = new AnyType(new LazyKType(o0.b(String.class), false, new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$buildObject$lambda$3$$inlined$AsyncFunction$2
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // wn0.a
                            public final q invoke() {
                                return o0.o(String.class);
                            }
                        }), converters);
                    }
                    AnyType[] anyTypeArr = {anyType};
                    l<Object[], h0> lVar = new l<Object[], h0>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$buildObject$lambda$3$$inlined$AsyncFunction$3
                        @Override // wn0.l
                        public final h0 invoke(Object[] objArr) {
                            s.k(objArr, "<destruct>");
                            String str = (String) objArr[0];
                            Iterator it = this.this$0.eventObservers.iterator();
                            while (it.hasNext()) {
                                ((EventObservingDefinition) it.next()).invokedIfNeed(type, str);
                            }
                            return h0.f84049a;
                        }
                    };
                    if (s.f(h0.class, Integer.TYPE)) {
                        stringAsyncFunctionComponent = new IntAsyncFunctionComponent(value, anyTypeArr, lVar);
                    } else if (s.f(h0.class, Boolean.TYPE)) {
                        stringAsyncFunctionComponent = new BoolAsyncFunctionComponent(value, anyTypeArr, lVar);
                    } else if (s.f(h0.class, Double.TYPE)) {
                        stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent(value, anyTypeArr, lVar);
                    } else if (s.f(h0.class, Float.TYPE)) {
                        stringAsyncFunctionComponent = new FloatAsyncFunctionComponent(value, anyTypeArr, lVar);
                    } else {
                        stringAsyncFunctionComponent = s.f(h0.class, String.class) ? new StringAsyncFunctionComponent(value, anyTypeArr, lVar) : new UntypedAsyncFunctionComponent(value, anyTypeArr, lVar);
                    }
                    asyncFunctionWithPromiseComponent = stringAsyncFunctionComponent;
                }
                getAsyncFunctions().put(value, asyncFunctionWithPromiseComponent);
            }
        }
        Map<String, AsyncFunctionComponent> map = this.asyncFunctions;
        Map<String, AsyncFunctionBuilder> map2 = this.asyncFunctionBuilders;
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((AsyncFunctionBuilder) entry.getValue()).build$expo_modules_core_release());
        }
        Map mapD = v0.D(v0.r(map, linkedHashMap));
        wn0.a<? extends Map<String, ? extends Object>> aVar = this.legacyConstantsProvider;
        Map<String, SyncFunctionComponent> map3 = this.syncFunctions;
        Map<String, FunctionBuilder> map4 = this.syncFunctionBuilder;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v0.e(map4.size()));
        Iterator<T> it2 = map4.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap2.put(entry2.getKey(), ((FunctionBuilder) entry2.getValue()).build$expo_modules_core_release());
        }
        Map mapR = v0.r(map3, linkedHashMap2);
        EventsDefinition eventsDefinition = this.eventsDefinition;
        Map<String, PropertyComponentBuilder> map5 = this.properties;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(v0.e(map5.size()));
        Iterator<T> it3 = map5.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            linkedHashMap3.put(entry3.getKey(), ((PropertyComponentBuilder) entry3.getValue()).build());
        }
        Map<String, ConstantComponentBuilder> map6 = this.constants;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(v0.e(map6.size()));
        Iterator<T> it4 = map6.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it4.next();
            linkedHashMap4.put(entry4.getKey(), ((ConstantComponentBuilder) entry4.getValue()).build());
        }
        return new ObjectDefinitionData(aVar, mapR, mapD, eventsDefinition, linkedHashMap3, linkedHashMap4);
    }

    public final Map<String, AsyncFunctionComponent> getAsyncFunctions() {
        return this.asyncFunctions;
    }

    public final Map<String, ConstantComponentBuilder> getConstants() {
        return this.constants;
    }

    public final TypeConverterProvider getConverters() {
        return this.converters;
    }

    public final EventsDefinition getEventsDefinition() {
        return this.eventsDefinition;
    }

    public final Map<String, PropertyComponentBuilder> getProperties() {
        return this.properties;
    }

    public final Map<String, FunctionBuilder> getSyncFunctionBuilder() {
        return this.syncFunctionBuilder;
    }

    public final Map<String, SyncFunctionComponent> getSyncFunctions() {
        return this.syncFunctions;
    }

    public final void setAsyncFunctions(Map<String, AsyncFunctionComponent> map) {
        s.k(map, "<set-?>");
        this.asyncFunctions = map;
    }

    public final void setConstants(Map<String, ConstantComponentBuilder> map) {
        s.k(map, "<set-?>");
        this.constants = map;
    }

    public final void setEventsDefinition(EventsDefinition eventsDefinition) {
        this.eventsDefinition = eventsDefinition;
    }

    public final void setProperties(Map<String, PropertyComponentBuilder> map) {
        s.k(map, "<set-?>");
        this.properties = map;
    }

    public final void setSyncFunctionBuilder(Map<String, FunctionBuilder> map) {
        s.k(map, "<set-?>");
        this.syncFunctionBuilder = map;
    }

    public final void setSyncFunctions(Map<String, SyncFunctionComponent> map) {
        s.k(map, "<set-?>");
        this.syncFunctions = map;
    }

    public ObjectDefinitionBuilder(TypeConverterProvider typeConverterProvider) {
        this.converters = typeConverterProvider;
        this.legacyConstantsProvider = new wn0.a() { // from class: expo.modules.kotlin.objects.c
            @Override // wn0.a
            public final Object invoke() {
                return v0.i();
            }
        };
        this.syncFunctions = new LinkedHashMap();
        this.syncFunctionBuilder = new LinkedHashMap();
        this.asyncFunctions = new LinkedHashMap();
        this.asyncFunctionBuilders = new LinkedHashMap();
        this.properties = new LinkedHashMap();
        this.constants = new LinkedHashMap();
        this.eventObservers = new ArrayList();
    }

    public final void Constants(final Pair<String, ? extends Object>... constants) {
        s.k(constants, "constants");
        this.legacyConstantsProvider = new wn0.a() { // from class: expo.modules.kotlin.objects.b
            @Override // wn0.a
            public final Object invoke() {
                return v0.B(constants);
            }
        };
    }

    public final /* synthetic */ <R> SyncFunctionComponent Function(String name, final wn0.a<? extends R> body) {
        s.k(name, "name");
        s.k(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(4, "R");
        ReturnType returnType = types.get(o0.b(Object.class));
        if (returnType == null) {
            s.q(4, "R");
            returnType = new ReturnType(o0.b(Object.class));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(4, "R");
            types2.put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.4
            @Override // wn0.l
            public final Object invoke(Object[] it) {
                s.k(it, "it");
                return body.invoke();
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <T> ConstantComponentBuilder Constant(String name, final wn0.a<? extends T> body) {
        s.k(name, "name");
        s.k(body, "body");
        ConstantComponentBuilder constantComponentBuilder = new ConstantComponentBuilder(name);
        s.p();
        constantComponentBuilder.setGetter(new wn0.a<T>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Constant$lambda$50$$inlined$get$1
            @Override // wn0.a
            public final T invoke() {
                return (T) body.invoke();
            }
        });
        getConstants().put(name, constantComponentBuilder);
        return constantComponentBuilder;
    }

    public final /* synthetic */ <T> PropertyComponentBuilder Property(String name, wn0.a<? extends T> body) {
        s.k(name, "name");
        s.k(body, "body");
        PropertyComponentBuilder propertyComponentBuilder = new PropertyComponentBuilder(name);
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(4, "T");
        ReturnType returnType = types.get(o0.b(Object.class));
        if (returnType == null) {
            s.q(4, "T");
            returnType = new ReturnType(o0.b(Object.class));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(4, "T");
            types2.put(o0.b(Object.class), returnType);
        }
        propertyComponentBuilder.setGetter(new SyncFunctionComponent("get", anyTypeArr, returnType, new PropertyComponentBuilder$get$1$1(body)));
        getProperties().put(name, propertyComponentBuilder);
        return propertyComponentBuilder;
    }

    public final /* synthetic */ <T extends Enum<T> & Enumerable> void Events() {
        ArrayList arrayList;
        List<co0.l> parameters;
        Object next;
        s.q(4, "T");
        h hVarF = do0.c.f(o0.b(Enum.class));
        if (hVarF != null && (parameters = hVarF.getParameters()) != null && parameters.size() == 1) {
            String name = ((co0.l) v.o0(hVarF.getParameters())).getName();
            s.q(4, "T");
            Iterator it = do0.c.d(o0.b(Enum.class)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.f(((o) next).getName(), name));
            o oVar = (o) next;
            if (oVar != null) {
                if (s.f(oVar.getReturnType().getClassifier(), o0.b(String.class))) {
                    s.q(5, "T");
                    arrayList = new ArrayList(0);
                } else {
                    throw new IllegalArgumentException("The enum parameter has to be a string.");
                }
            } else {
                throw new IllegalArgumentException(("Cannot find a property for " + name + " parameter").toString());
            }
        } else {
            s.q(5, "T");
            arrayList = new ArrayList(0);
        }
        setEventsDefinition(new EventsDefinition((String[]) arrayList.toArray(new String[0])));
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;:Lexpo/modules/kotlin/types/Enumerable;>(TT;Lwn0/a<Ljn0/h0;>;)V */
    public final void OnStartObserving(Enum r11, wn0.a body) {
        s.k(r11, "enum");
        s.k(body, "body");
        OnStartObserving(ModuleUtilsKt.convertEnumToString(r11), (wn0.a<h0>) body);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Enum<TT;>;:Lexpo/modules/kotlin/types/Enumerable;>(TT;Lwn0/a<Ljn0/h0;>;)V */
    public final void OnStopObserving(Enum r11, wn0.a body) {
        s.k(r11, "enum");
        s.k(body, "body");
        OnStopObserving(ModuleUtilsKt.convertEnumToString(r11), (wn0.a<h0>) body);
    }

    public final void OnStartObserving(wn0.a<h0> body) {
        s.k(body, "body");
        this.eventObservers.add(new EventObservingDefinition(EventObservingDefinition.Type.StartObserving, EventObservingDefinition.AllEventsFilter.INSTANCE, body));
    }

    public final void OnStopObserving(wn0.a<h0> body) {
        s.k(body, "body");
        this.eventObservers.add(new EventObservingDefinition(EventObservingDefinition.Type.StopObserving, EventObservingDefinition.AllEventsFilter.INSTANCE, body));
    }

    public final /* synthetic */ <R, P0> SyncFunctionComponent Function(String name, final l<? super P0, ? extends R> body) {
        s.k(name, "name");
        s.k(body, "body");
        TypeConverterProvider converters = getConverters();
        s.q(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$3 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$3 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$3), converters);
        }
        AnyType[] anyTypeArr = {anyType};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(4, "R");
        ReturnType returnType = types.get(o0.b(Object.class));
        if (returnType == null) {
            s.q(4, "R");
            returnType = new ReturnType(o0.b(Object.class));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(4, "R");
            types2.put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.6
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public /* synthetic */ ObjectDefinitionBuilder(TypeConverterProvider typeConverterProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : typeConverterProvider);
    }

    public final /* synthetic */ <R, P0> AsyncFunctionComponent AsyncFunction(String name, final l<? super P0, ? extends R> body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        AsyncFunctionComponent asyncFunctionWithPromiseComponent;
        s.k(name, "name");
        s.k(body, "body");
        s.q(4, "P0");
        if (s.f(Object.class, Promise.class)) {
            s.p();
            asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[0], new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.5
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    s.k(objArr, "<unused var>");
                    s.k(promise, "promise");
                    l<P0, R> lVar = body;
                    s.q(1, "P0");
                    lVar.invoke((P0) promise);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            });
        } else {
            TypeConverterProvider converters = getConverters();
            s.q(4, "P0");
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            s.q(4, "P0");
            co0.d dVarB = o0.b(Object.class);
            s.q(3, "P0");
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
            if (anyType == null) {
                s.p();
                ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        s.q(6, "P0");
                        return null;
                    }
                };
                s.q(4, "P0");
                co0.d dVarB2 = o0.b(Object.class);
                s.q(3, "P0");
                anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$1), converters);
            }
            AnyType[] anyTypeArr = {anyType};
            s.p();
            l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.6
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
            asyncFunctionWithPromiseComponent = untypedAsyncFunctionComponent;
        }
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final wn0.q<? super P0, ? super P1, ? super Promise, ? extends R> body) {
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$11), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$12), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.14
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
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1> SyncFunctionComponent Function(String name, final p<? super P0, ? super P1, ? extends R> body) {
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$1 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$1 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$1), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$2 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$2 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$2), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(4, "R");
        ReturnType returnType = types.get(o0.b(Object.class));
        if (returnType == null) {
            s.q(4, "R");
            returnType = new ReturnType(o0.b(Object.class));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(4, "R");
            types2.put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.8
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0], (P1) objArr[1]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final r<? super P0, ? super P1, ? super P2, ? super Promise, ? extends R> body) {
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$2), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$3), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$4), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.18
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
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1> AsyncFunctionComponent AsyncFunction(String name, final p<? super P0, ? super P1, ? extends R> body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$5), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$6), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.8
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
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> SyncFunctionComponent Function(String name, final wn0.q<? super P0, ? super P1, ? super P2, ? extends R> body) {
        int i11;
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$4 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$4 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$4
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$4), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$5 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$5 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$5
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$5), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$6 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$6 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$6
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i11 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$6), converters);
        } else {
            i11 = 4;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(i11, "R");
        ReturnType returnType = types.get(o0.b(Object.class));
        if (returnType == null) {
            s.q(i11, "R");
            returnType = new ReturnType(o0.b(Object.class));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(i11, "R");
            types2.put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.10
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0], (P1) objArr[1], (P2) objArr[2]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final wn0.s<? super P0, ? super P1, ? super P2, ? super P3, ? super Promise, ? extends R> body) {
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$22), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$23), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$24), converters);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$25), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.22
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
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> AsyncFunctionComponent AsyncFunction(String name, final wn0.q<? super P0, ? super P1, ? super P2, ? extends R> body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$8), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$9), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$10), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.12
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
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> SyncFunctionComponent Function(String name, final r<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> body) {
        int i11;
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$7 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$7 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$7
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$7), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$8 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$8 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$8), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$9 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$9 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$9
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$9), converters);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$10 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$10 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$10
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i11 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$10), converters);
        } else {
            i11 = 4;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(i11, "R");
        ReturnType returnType = types.get(o0.b(Object.class));
        if (returnType == null) {
            s.q(i11, "R");
            returnType = new ReturnType(o0.b(Object.class));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(i11, "R");
            types2.put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.12
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super Promise, ? extends R> body) {
        int i11;
        int i12;
        int i13;
        int i14;
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$32), converters);
        } else {
            i11 = 3;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(i11, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i12 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$33), converters);
        } else {
            i12 = 3;
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(i12, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$34), converters);
        } else {
            i13 = 3;
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(i13, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            i14 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$35), converters);
        } else {
            i14 = 3;
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(i14, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$36), converters);
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.26
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
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> AsyncFunctionComponent AsyncFunction(String name, final r<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$13), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$14), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$15), converters);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$16), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.16
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
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> SyncFunctionComponent Function(String name, final wn0.s<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> body) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$11 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$11 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$11
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$11), converters);
        } else {
            i11 = 3;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(i11, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$12 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$12 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$12
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i12 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$12), converters);
        } else {
            i12 = 3;
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(i12, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$13 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$13 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$13
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$13), converters);
        } else {
            i13 = 3;
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(i13, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$14 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$14 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$14
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            i14 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$14), converters);
        } else {
            i14 = 3;
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(i14, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            s.p();
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$15 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$15 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$15
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i15 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$15), converters);
        } else {
            i15 = 4;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(i15, "R");
        ReturnType returnType = types.get(o0.b(Object.class));
        if (returnType == null) {
            s.q(i15, "R");
            returnType = new ReturnType(o0.b(Object.class));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(i15, "R");
            types2.put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.14
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.d((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super Promise, ? extends R> body) {
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
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$44), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$45), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(r13);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$46), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(r13);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$47), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(r13);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$48), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(r13);
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$49), converters);
        } else {
            anyType6 = anyType12;
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.30
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
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> AsyncFunctionComponent AsyncFunction(String name, final wn0.s<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> body) {
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$17), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$18), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$19), converters);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$20), converters);
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(3, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            s.p();
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$21), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.20
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
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> SyncFunctionComponent Function(String name, final t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends R> body) {
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
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$16 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$16 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$16
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$16), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$17 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$17 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$17
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$17), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$18 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$18 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$18
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(r13);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$18), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$19 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$19 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$19
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(r13);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$19), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$20 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$20 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$20
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(r13);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$20), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$21 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$21 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$21
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(r13);
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$21), converters);
        } else {
            i21 = 4;
            anyType6 = anyType12;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(i21, "R");
        ReturnType returnType = types.get(o0.b(r13));
        if (returnType == null) {
            s.q(i21, "R");
            returnType = new ReturnType(o0.b(r13));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(i21, "R");
            types2.put(o0.b(r13), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.16
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.i((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent AsyncFunctionWithPromise(String name, final wn0.v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super Promise, ? extends R> body) {
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
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            cls = Object.class;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(cls);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$58), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(cls);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$59), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(cls);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$60), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(cls);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$61), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(cls);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$62), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(cls);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$63), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(cls);
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$64), converters);
        } else {
            anyType7 = anyType14;
        }
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7}, new p<Object[], Promise, h0>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.34
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
        getAsyncFunctions().put(name, asyncFunctionWithPromiseComponent);
        return asyncFunctionWithPromiseComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> AsyncFunctionComponent AsyncFunction(String name, final t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends R> body) {
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
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$26), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$27), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$28), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$29), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$30), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(Object.class);
            i21 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$31), converters);
        } else {
            i21 = 3;
            anyType6 = anyType12;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.24
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
        getAsyncFunctions().put(name, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> SyncFunctionComponent Function(String name, final u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends R> body) {
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
        AnyType anyType7;
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$22 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$22 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$22
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            cls = Object.class;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(cls);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$22), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$23 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$23 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$23
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(cls);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$23), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$24 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$24 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$24
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(cls);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$24), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$25 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$25 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$25
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(cls);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$25), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$26 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$26 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$26
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(cls);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$26), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$27 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$27 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$27
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(cls);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$27), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$28 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$28 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$28
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            i23 = 4;
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(cls);
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$28), converters);
        } else {
            i23 = 4;
            anyType7 = anyType14;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(i23, "R");
        ReturnType returnType = types.get(o0.b(cls));
        if (returnType == null) {
            s.q(i23, "R");
            returnType = new ReturnType(o0.b(cls));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(i23, "R");
            types2.put(o0.b(cls), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.18
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.k((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5], (P6) objArr[6]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> AsyncFunctionComponent AsyncFunction(String name, final u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends R> body) {
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
        String str;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$37), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$38), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$39), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$40), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$41), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(Object.class);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$42), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(Object.class);
            i23 = 3;
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$43), converters);
        } else {
            i23 = 3;
            anyType7 = anyType14;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.28
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
            str = name;
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(str, anyTypeArr, lVar);
        } else {
            str = name;
            if (s.f(Object.class, Boolean.TYPE)) {
                untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else if (s.f(Object.class, Double.TYPE)) {
                untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else if (s.f(Object.class, Float.TYPE)) {
                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else if (s.f(Object.class, String.class)) {
                untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else {
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(str, anyTypeArr, lVar);
            }
        }
        getAsyncFunctions().put(str, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> SyncFunctionComponent Function(String name, final wn0.v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends R> body) {
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
        int i25;
        AnyType anyType8;
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$29 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$29 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$29
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            cls = Object.class;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(cls);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$29), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$30 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$30 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$30
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(cls);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$30), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$31 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$31 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$31
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(cls);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$31), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$32 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$32 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$32
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(cls);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$32), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$33 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$33 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$33
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(cls);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$33), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$34 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$34 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$34
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(cls);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$34), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$35 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$35 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$35
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            i23 = 4;
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(cls);
            i24 = 3;
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$35), converters);
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
            ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$36 objectDefinitionBuilder$Function$$inlined$toArgsArray$default$36 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$Function$$inlined$toArgsArray$default$36
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P7");
                    return null;
                }
            };
            i25 = 4;
            s.q(4, "P7");
            co0.d dVarB16 = o0.b(cls);
            s.q(3, "P7");
            anyType8 = new AnyType(new LazyKType(dVarB16, false, objectDefinitionBuilder$Function$$inlined$toArgsArray$default$36), converters);
        } else {
            i25 = 4;
            anyType8 = anyType16;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(i25, "R");
        ReturnType returnType = types.get(o0.b(cls));
        if (returnType == null) {
            s.q(i25, "R");
            returnType = new ReturnType(o0.b(cls));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(i25, "R");
            types2.put(o0.b(cls), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.Function.20
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.g((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5], (P6) objArr[6], (P7) objArr[7]);
            }
        });
        getSyncFunctions().put(name, syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> AsyncFunctionComponent AsyncFunction(String name, final wn0.v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends R> body) {
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
        String str;
        AsyncFunctionComponent untypedAsyncFunctionComponent;
        s.k(name, "name");
        s.k(body, "body");
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$50), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(r14);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$51), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(r14);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$52), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(r14);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$53), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(r14);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$54), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(r14);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$55), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            i23 = 4;
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(r14);
            i24 = 3;
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$56), converters);
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
            ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57 objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P7");
                    return null;
                }
            };
            s.q(4, "P7");
            co0.d dVarB16 = o0.b(r14);
            i25 = 3;
            s.q(3, "P7");
            anyType8 = new AnyType(new LazyKType(dVarB16, false, objectDefinitionBuilder$AsyncFunction$$inlined$toArgsArray$default$57), converters);
        } else {
            i25 = 3;
            anyType8 = anyType16;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8};
        s.p();
        l<Object[], R> lVar = new l<Object[], R>() { // from class: expo.modules.kotlin.objects.ObjectDefinitionBuilder.AsyncFunction.32
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
            str = name;
            untypedAsyncFunctionComponent = new IntAsyncFunctionComponent(str, anyTypeArr, lVar);
        } else {
            str = name;
            if (s.f(Object.class, Boolean.TYPE)) {
                untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else if (s.f(Object.class, Double.TYPE)) {
                untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else if (s.f(Object.class, Float.TYPE)) {
                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else if (s.f(Object.class, String.class)) {
                untypedAsyncFunctionComponent = new StringAsyncFunctionComponent(str, anyTypeArr, lVar);
            } else {
                untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent(str, anyTypeArr, lVar);
            }
        }
        getAsyncFunctions().put(str, untypedAsyncFunctionComponent);
        return untypedAsyncFunctionComponent;
    }

    public final AsyncFunctionBuilder AsyncFunction(String name) {
        s.k(name, "name");
        AsyncFunctionBuilder asyncFunctionBuilder = new AsyncFunctionBuilder(name, this.converters);
        this.asyncFunctionBuilders.put(name, asyncFunctionBuilder);
        return asyncFunctionBuilder;
    }
}
