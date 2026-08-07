package kn0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\"\b\u0000\u0018\u0000 -*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003[^XB\u0011\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010!J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010\"\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010%J\u001d\u0010(\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010)J%\u0010(\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b(\u0010*J\u000f\u0010+\u001a\u00020$H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\u0014J\u0017\u0010.\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010#J\u001d\u0010/\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b/\u0010)J\u001d\u00100\u001a\u00020\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b0\u0010)J%\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00104J)\u00108\u001a\b\u0012\u0004\u0012\u00028\u000106\"\u0004\b\u0001\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000106H\u0016¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:06H\u0016¢\u0006\u0004\b8\u0010;J\u001a\u0010=\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010:H\u0096\u0002¢\u0006\u0004\b=\u0010#J\u000f\u0010>\u001a\u00020\bH\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020$H\u0002¢\u0006\u0004\bC\u0010,J\u000f\u0010D\u001a\u00020$H\u0002¢\u0006\u0004\bD\u0010,J\u0017\u0010F\u001a\u00020$2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bF\u0010\u000bJ\u0017\u0010H\u001a\u00020$2\u0006\u0010G\u001a\u00020\bH\u0002¢\u0006\u0004\bH\u0010\u000bJ\u001b\u0010I\u001a\u00020\u000f2\n\u0010<\u001a\u0006\u0012\u0002\b\u00030\fH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020$2\u0006\u0010K\u001a\u00020\b2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020$2\u0006\u0010K\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\bN\u0010%J-\u0010O\u001a\u00020$2\u0006\u0010K\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00028\u00002\u0006\u0010K\u001a\u00020\bH\u0002¢\u0006\u0004\bQ\u0010\u0014J\u001f\u0010T\u001a\u00020$2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0002¢\u0006\u0004\bT\u0010MJ5\u0010V\u001a\u00020\b2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&2\u0006\u0010U\u001a\u00020\u000fH\u0002¢\u0006\u0004\bV\u0010WR\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u0000068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010]\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010`\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010?¨\u0006b"}, d2 = {"Lkn0/b;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/h;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "initialCapacity", "<init>", "(I)V", "", "r", "()Ljava/util/List;", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "Ljn0/h0;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", DateTokenConverter.CONVERTER_KEY, "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "x", "s", "n", "v", "minCapacity", "u", "t", "(Ljava/util/List;)Z", IntegerTokenConverter.CONVERTER_KEY, "w", "(II)V", "q", "p", "(ILjava/util/Collection;I)V", "y", "rangeOffset", "rangeLength", "z", "retain", "A", "(IILjava/util/Collection;Z)I", "a", "[Ljava/lang/Object;", "backing", "b", "I", "length", "c", "Z", "isReadOnly", "size", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<E> extends p013kotlin.collections.h<E> implements List<E>, RandomAccess, Serializable, xn0.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C1852b f86328d = new C1852b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f86329e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private E[] backing;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int length;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isReadOnly;

    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001a\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001WBC\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010$J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010%\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010(J\u001d\u0010+\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010,J%\u0010+\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b+\u0010-J\u000f\u0010.\u001a\u00020'H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u0010\u0017J\u0017\u00101\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b1\u0010&J\u001d\u00102\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b2\u0010,J\u001d\u00103\u001a\u00020\u00122\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)H\u0016¢\u0006\u0004\b3\u0010,J%\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J)\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\u0004\b\u0002\u001082\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\bH\u0016¢\u0006\u0004\b:\u0010=J\u001a\u0010?\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010<H\u0096\u0002¢\u0006\u0004\b?\u0010&J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020'H\u0002¢\u0006\u0004\bE\u0010/J\u000f\u0010F\u001a\u00020'H\u0002¢\u0006\u0004\bF\u0010/J\u000f\u0010G\u001a\u00020'H\u0002¢\u0006\u0004\bG\u0010/J\u001b\u0010I\u001a\u00020\u00122\n\u0010>\u001a\u0006\u0012\u0002\b\u00030HH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020'2\u0006\u0010K\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00028\u0001H\u0002¢\u0006\u0004\bL\u0010(J-\u0010M\u001a\u00020'2\u0006\u0010K\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010F\u001a\u00020\nH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00028\u00012\u0006\u0010K\u001a\u00020\nH\u0002¢\u0006\u0004\bO\u0010\u0017J\u001f\u0010R\u001a\u00020'2\u0006\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\nH\u0002¢\u0006\u0004\bR\u0010SJ5\u0010U\u001a\u00020\n2\u0006\u0010P\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\n2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010)2\u0006\u0010T\u001a\u00020\u0012H\u0002¢\u0006\u0004\bU\u0010VR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010ZR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\\R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010AR\u0014\u0010a\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010\u0014¨\u0006b"}, d2 = {"Lkn0/b$a;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/h;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "backing", "", "offset", "length", "parent", "Lkn0/b;", "root", "<init>", "([Ljava/lang/Object;IILkn0/b$a;Lkn0/b;)V", "", "isEmpty", "()Z", "index", "get", "(I)Ljava/lang/Object;", "element", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "add", "(Ljava/lang/Object;)Z", "Ljn0/h0;", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "clear", "()V", DateTokenConverter.CONVERTER_KEY, "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "T", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "r", "n", "o", "", "p", "(Ljava/util/List;)Z", IntegerTokenConverter.CONVERTER_KEY, "m", "l", "(ILjava/util/Collection;I)V", "s", "rangeOffset", "rangeLength", "t", "(II)V", "retain", "u", "(IILjava/util/Collection;Z)I", "a", "[Ljava/lang/Object;", "b", "I", "c", "Lkn0/b$a;", "e", "Lkn0/b;", "size", "q", "isReadOnly", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<E> extends p013kotlin.collections.h<E> implements List<E>, RandomAccess, Serializable, xn0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private E[] backing;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int offset;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int length;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final a<E> parent;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final b<E> root;

        /* JADX INFO: renamed from: kn0.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006\""}, d2 = {"Lkn0/b$a$a;", "E", "", "Lkn0/b$a;", "list", "", "index", "<init>", "(Lkn0/b$a;I)V", "Ljn0/h0;", "b", "()V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "a", "Lkn0/b$a;", "I", "c", "lastIndex", DateTokenConverter.CONVERTER_KEY, "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        private static final class C1851a<E> implements ListIterator<E>, xn0.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final a<E> list;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private int index;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private int lastIndex;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private int expectedModCount;

            public C1851a(a<E> list, int i11) {
                s.k(list, "list");
                this.list = list;
                this.index = i11;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) list).modCount;
            }

            private final void b() {
                if (((AbstractList) ((a) this.list).root).modCount != this.expectedModCount) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(E element) {
                b();
                a<E> aVar = this.list;
                int i11 = this.index;
                this.index = i11 + 1;
                aVar.add(i11, element);
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.index < ((a) this.list).length;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.index > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                b();
                if (this.index >= ((a) this.list).length) {
                    throw new NoSuchElementException();
                }
                int i11 = this.index;
                this.index = i11 + 1;
                this.lastIndex = i11;
                return (E) ((a) this.list).backing[((a) this.list).offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.index;
            }

            @Override // java.util.ListIterator
            public E previous() {
                b();
                int i11 = this.index;
                if (i11 <= 0) {
                    throw new NoSuchElementException();
                }
                int i12 = i11 - 1;
                this.index = i12;
                this.lastIndex = i12;
                return (E) ((a) this.list).backing[((a) this.list).offset + this.lastIndex];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.index - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                b();
                int i11 = this.lastIndex;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.list.remove(i11);
                this.index = this.lastIndex;
                this.lastIndex = -1;
                this.expectedModCount = ((AbstractList) this.list).modCount;
            }

            @Override // java.util.ListIterator
            public void set(E element) {
                b();
                int i11 = this.lastIndex;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.list.set(i11, element);
            }
        }

        public a(E[] backing, int i11, int i12, a<E> aVar, b<E> root) {
            s.k(backing, "backing");
            s.k(root, "root");
            this.backing = backing;
            this.offset = i11;
            this.length = i12;
            this.parent = aVar;
            this.root = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void l(int i11, Collection<? extends E> elements, int n11) {
            r();
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.l(i11, elements, n11);
            } else {
                this.root.p(i11, elements, n11);
            }
            this.backing = (E[]) ((b) this.root).backing;
            this.length += n11;
        }

        private final void m(int i11, E element) {
            r();
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.m(i11, element);
            } else {
                this.root.q(i11, element);
            }
            this.backing = (E[]) ((b) this.root).backing;
            this.length++;
        }

        private final void n() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void o() {
            if (q()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean p(List<?> other) {
            return kn0.c.h(this.backing, this.offset, this.length, other);
        }

        private final boolean q() {
            return ((b) this.root).isReadOnly;
        }

        private final void r() {
            ((AbstractList) this).modCount++;
        }

        private final E s(int i11) {
            r();
            a<E> aVar = this.parent;
            E eS = aVar != null ? aVar.s(i11) : (E) this.root.y(i11);
            this.length--;
            return eS;
        }

        private final void t(int rangeOffset, int rangeLength) {
            if (rangeLength > 0) {
                r();
            }
            a<E> aVar = this.parent;
            if (aVar != null) {
                aVar.t(rangeOffset, rangeLength);
            } else {
                this.root.z(rangeOffset, rangeLength);
            }
            this.length -= rangeLength;
        }

        private final int u(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
            a<E> aVar = this.parent;
            int iU = aVar != null ? aVar.u(rangeOffset, rangeLength, elements, retain) : this.root.A(rangeOffset, rangeLength, elements, retain);
            if (iU > 0) {
                r();
            }
            this.length -= iU;
            return iU;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E element) {
            o();
            n();
            m(this.offset + this.length, element);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends E> elements) {
            s.k(elements, "elements");
            o();
            n();
            int size = elements.size();
            l(this.offset + this.length, elements, size);
            return size > 0;
        }

        @Override // p013kotlin.collections.h
        /* JADX INFO: renamed from: b */
        public int getSize() {
            n();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            o();
            n();
            t(this.offset, this.length);
        }

        @Override // p013kotlin.collections.h
        public E d(int index) {
            o();
            n();
            p013kotlin.collections.d.INSTANCE.b(index, this.length);
            return s(this.offset + index);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object other) {
            n();
            if (other != this) {
                return (other instanceof List) && p((List) other);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int index) {
            n();
            p013kotlin.collections.d.INSTANCE.b(index, this.length);
            return this.backing[this.offset + index];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            n();
            return kn0.c.i(this.backing, this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object element) {
            n();
            for (int i11 = 0; i11 < this.length; i11++) {
                if (s.f(this.backing[this.offset + i11], element)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            n();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object element) {
            n();
            for (int i11 = this.length - 1; i11 >= 0; i11--) {
                if (s.f(this.backing[this.offset + i11], element)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object element) {
            o();
            n();
            int iIndexOf = indexOf(element);
            if (iIndexOf >= 0) {
                remove(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<?> elements) {
            s.k(elements, "elements");
            o();
            n();
            return u(this.offset, this.length, elements, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<?> elements) {
            s.k(elements, "elements");
            o();
            n();
            return u(this.offset, this.length, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int index, E element) {
            o();
            n();
            p013kotlin.collections.d.INSTANCE.b(index, this.length);
            E[] eArr = this.backing;
            int i11 = this.offset;
            E e11 = eArr[i11 + index];
            eArr[i11 + index] = element;
            return e11;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int fromIndex, int toIndex) {
            p013kotlin.collections.d.INSTANCE.d(fromIndex, toIndex, this.length);
            return new a(this.backing, this.offset + fromIndex, toIndex - fromIndex, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] array) {
            s.k(array, "array");
            n();
            int length = array.length;
            int i11 = this.length;
            if (length >= i11) {
                E[] eArr = this.backing;
                int i12 = this.offset;
                n.p(eArr, array, 0, i12, i11 + i12);
                return (T[]) v.g(this.length, array);
            }
            E[] eArr2 = this.backing;
            int i13 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr2, i13, i11 + i13, array.getClass());
            s.j(tArr, "copyOfRange(...)");
            return tArr;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            n();
            return kn0.c.j(this.backing, this.offset, this.length, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int index) {
            n();
            p013kotlin.collections.d.INSTANCE.c(index, this.length);
            return new C1851a(this, index);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, E element) {
            o();
            n();
            p013kotlin.collections.d.INSTANCE.c(index, this.length);
            m(this.offset + index, element);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int index, Collection<? extends E> elements) {
            s.k(elements, "elements");
            o();
            n();
            p013kotlin.collections.d.INSTANCE.c(index, this.length);
            int size = elements.size();
            l(this.offset + index, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            n();
            E[] eArr = this.backing;
            int i11 = this.offset;
            return n.w(eArr, i11, this.length + i11);
        }
    }

    /* JADX INFO: renamed from: kn0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkn0/b$b;", "", "<init>", "()V", "Lkn0/b;", "", "Empty", "Lkn0/b;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class C1852b {
        public /* synthetic */ C1852b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1852b() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006\""}, d2 = {"Lkn0/b$c;", "E", "", "Lkn0/b;", "list", "", "index", "<init>", "(Lkn0/b;I)V", "Ljn0/h0;", "b", "()V", "", "hasPrevious", "()Z", "hasNext", "previousIndex", "()I", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "set", "(Ljava/lang/Object;)V", "add", "remove", "a", "Lkn0/b;", "I", "c", "lastIndex", DateTokenConverter.CONVERTER_KEY, "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c<E> implements ListIterator<E>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b<E> list;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int lastIndex;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int expectedModCount;

        public c(b<E> list, int i11) {
            s.k(list, "list");
            this.list = list;
            this.index = i11;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) list).modCount;
        }

        private final void b() {
            if (((AbstractList) this.list).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E element) {
            b();
            b<E> bVar = this.list;
            int i11 = this.index;
            this.index = i11 + 1;
            bVar.add(i11, element);
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < ((b) this.list).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            b();
            if (this.index >= ((b) this.list).length) {
                throw new NoSuchElementException();
            }
            int i11 = this.index;
            this.index = i11 + 1;
            this.lastIndex = i11;
            return (E) ((b) this.list).backing[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public E previous() {
            b();
            int i11 = this.index;
            if (i11 <= 0) {
                throw new NoSuchElementException();
            }
            int i12 = i11 - 1;
            this.index = i12;
            this.lastIndex = i12;
            return (E) ((b) this.list).backing[this.lastIndex];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i11 = this.lastIndex;
            if (i11 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.list.remove(i11);
            this.index = this.lastIndex;
            this.lastIndex = -1;
            this.expectedModCount = ((AbstractList) this.list).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E element) {
            b();
            int i11 = this.lastIndex;
            if (i11 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.list.set(i11, element);
        }
    }

    static {
        b bVar = new b(0);
        bVar.isReadOnly = true;
        f86329e = bVar;
    }

    public b() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int A(int rangeOffset, int rangeLength, Collection<? extends E> elements, boolean retain) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < rangeLength) {
            int i13 = rangeOffset + i11;
            if (elements.contains(this.backing[i13]) == retain) {
                E[] eArr = this.backing;
                i11++;
                eArr[i12 + rangeOffset] = eArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = rangeLength - i12;
        E[] eArr2 = this.backing;
        n.p(eArr2, eArr2, rangeOffset + i12, rangeLength + rangeOffset, this.length);
        E[] eArr3 = this.backing;
        int i15 = this.length;
        kn0.c.g(eArr3, i15 - i14, i15);
        if (i14 > 0) {
            x();
        }
        this.length -= i14;
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(int i11, Collection<? extends E> elements, int n11) {
        x();
        w(i11, n11);
        Iterator<? extends E> it = elements.iterator();
        for (int i12 = 0; i12 < n11; i12++) {
            this.backing[i11 + i12] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(int i11, E element) {
        x();
        w(i11, 1);
        this.backing[i11] = element;
    }

    private final void s() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean t(List<?> other) {
        return kn0.c.h(this.backing, 0, this.length, other);
    }

    private final void u(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (minCapacity > eArr.length) {
            this.backing = (E[]) kn0.c.e(this.backing, p013kotlin.collections.d.INSTANCE.e(eArr.length, minCapacity));
        }
    }

    private final void v(int n11) {
        u(this.length + n11);
    }

    private final void w(int i11, int n11) {
        v(n11);
        E[] eArr = this.backing;
        n.p(eArr, eArr, i11 + n11, i11, this.length);
        this.length += n11;
    }

    private final void x() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E y(int i11) {
        x();
        E[] eArr = this.backing;
        E e11 = eArr[i11];
        n.p(eArr, eArr, i11, i11 + 1, this.length);
        kn0.c.f(this.backing, this.length - 1);
        this.length--;
        return e11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(int rangeOffset, int rangeLength) {
        if (rangeLength > 0) {
            x();
        }
        E[] eArr = this.backing;
        n.p(eArr, eArr, rangeOffset, rangeOffset + rangeLength, this.length);
        E[] eArr2 = this.backing;
        int i11 = this.length;
        kn0.c.g(eArr2, i11 - rangeLength, i11);
        this.length -= rangeLength;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        s();
        q(this.length, element);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        s.k(elements, "elements");
        s();
        int size = elements.size();
        p(this.length, elements, size);
        return size > 0;
    }

    @Override // p013kotlin.collections.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        s();
        z(0, this.length);
    }

    @Override // p013kotlin.collections.h
    public E d(int index) {
        s();
        p013kotlin.collections.d.INSTANCE.b(index, this.length);
        return y(index);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof List) && t((List) other);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        p013kotlin.collections.d.INSTANCE.b(index, this.length);
        return this.backing[index];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return kn0.c.i(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        for (int i11 = 0; i11 < this.length; i11++) {
            if (s.f(this.backing[i11], element)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        for (int i11 = this.length - 1; i11 >= 0; i11--) {
            if (s.f(this.backing[i11], element)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final List<E> r() {
        s();
        this.isReadOnly = true;
        return this.length > 0 ? this : f86329e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        s();
        int iIndexOf = indexOf(element);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> elements) {
        s.k(elements, "elements");
        s();
        return A(0, this.length, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> elements) {
        s.k(elements, "elements");
        s();
        return A(0, this.length, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        s();
        p013kotlin.collections.d.INSTANCE.b(index, this.length);
        E[] eArr = this.backing;
        E e11 = eArr[index];
        eArr[index] = element;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int fromIndex, int toIndex) {
        p013kotlin.collections.d.INSTANCE.d(fromIndex, toIndex, this.length);
        return new a(this.backing, fromIndex, toIndex - fromIndex, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        s.k(array, "array");
        int length = array.length;
        int i11 = this.length;
        if (length >= i11) {
            n.p(this.backing, array, 0, 0, i11);
            return (T[]) v.g(this.length, array);
        }
        T[] tArr = (T[]) Arrays.copyOfRange(this.backing, 0, i11, array.getClass());
        s.j(tArr, "copyOfRange(...)");
        return tArr;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return kn0.c.j(this.backing, 0, this.length, this);
    }

    public b(int i11) {
        this.backing = (E[]) kn0.c.d(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        p013kotlin.collections.d.INSTANCE.c(index, this.length);
        return new c(this, index);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        s();
        p013kotlin.collections.d.INSTANCE.c(index, this.length);
        q(index, element);
    }

    public /* synthetic */ b(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 10 : i11);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        s.k(elements, "elements");
        s();
        p013kotlin.collections.d.INSTANCE.c(index, this.length);
        int size = elements.size();
        p(index, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return n.w(this.backing, 0, this.length);
    }
}
