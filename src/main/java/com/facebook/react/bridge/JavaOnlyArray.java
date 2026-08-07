package com.facebook.react.bridge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001IB!\b\u0012\u0012\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0012\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0006\u0010\nB\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u0012J\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020$2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0013H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020+2\u0006\u0010*\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0018H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b4\u00105J\u0019\u00107\u001a\u00020+2\b\u00106\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b7\u00108J\u0019\u0010:\u001a\u00020+2\b\u00109\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020+H\u0016¢\u0006\u0004\b<\u0010\u000bJ\u0017\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040=H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u001bH\u0016¢\u0006\u0004\b@\u0010AJ\u001a\u0010C\u001a\u00020\u00102\b\u0010B\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\fH\u0016¢\u0006\u0004\bE\u0010\u000eR\u001c\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lcom/facebook/react/bridge/JavaOnlyArray;", "Lcom/facebook/react/bridge/ReadableArray;", "Lcom/facebook/react/bridge/WritableArray;", "", "", "values", "<init>", "([Ljava/lang/Object;)V", "", "list", "(Ljava/util/List;)V", "()V", "", "size", "()I", "index", "", "isNull", "(I)Z", "", "getDouble", "(I)D", "getInt", "(I)I", "", "getLong", "(I)J", "", "getString", "(I)Ljava/lang/String;", "getArray", "(I)Lcom/facebook/react/bridge/ReadableArray;", "getBoolean", "Lcom/facebook/react/bridge/ReadableMap;", "getMap", "(I)Lcom/facebook/react/bridge/ReadableMap;", "Lcom/facebook/react/bridge/Dynamic;", "getDynamic", "(I)Lcom/facebook/react/bridge/Dynamic;", "Lcom/facebook/react/bridge/ReadableType;", "getType", "(I)Lcom/facebook/react/bridge/ReadableType;", "value", "Ljn0/h0;", "pushBoolean", "(Z)V", "pushDouble", "(D)V", "pushInt", "(I)V", "pushLong", "(J)V", "pushString", "(Ljava/lang/String;)V", "array", "pushArray", "(Lcom/facebook/react/bridge/ReadableArray;)V", "map", "pushMap", "(Lcom/facebook/react/bridge/ReadableMap;)V", "pushNull", "Ljava/util/ArrayList;", "toArrayList", "()Ljava/util/ArrayList;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "backingList", "Ljava/util/List;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JavaOnlyArray implements ReadableArray, WritableArray {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<Object> backingList;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0007J%\u0010\b\u001a\u00020\u00052\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/bridge/JavaOnlyArray$Companion;", "", "<init>", "()V", "from", "Lcom/facebook/react/bridge/JavaOnlyArray;", "list", "", "of", "values", "", "([Ljava/lang/Object;)Lcom/facebook/react/bridge/JavaOnlyArray;", "deepClone", "array", "Lcom/facebook/react/bridge/ReadableArray;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Null.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.Boolean.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ReadableType.Number.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ReadableType.Map.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ReadableType.Array.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JavaOnlyArray deepClone(ReadableArray array) {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            if (array != null) {
                int size = array.size();
                for (int i11 = 0; i11 < size; i11++) {
                    switch (WhenMappings.$EnumSwitchMapping$0[array.getType(i11).ordinal()]) {
                        case 1:
                            javaOnlyArray.pushNull();
                            break;
                        case 2:
                            javaOnlyArray.pushBoolean(array.getBoolean(i11));
                            break;
                        case 3:
                            javaOnlyArray.pushDouble(array.getDouble(i11));
                            break;
                        case 4:
                            javaOnlyArray.pushString(array.getString(i11));
                            break;
                        case 5:
                            javaOnlyArray.pushMap(JavaOnlyMap.INSTANCE.deepClone(array.getMap(i11)));
                            break;
                        case 6:
                            javaOnlyArray.pushArray(JavaOnlyArray.INSTANCE.deepClone(array.getArray(i11)));
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return javaOnlyArray;
        }

        public final JavaOnlyArray from(List<?> list) {
            s.k(list, "list");
            return new JavaOnlyArray(list, (DefaultConstructorMarker) null);
        }

        public final JavaOnlyArray of(Object... values) {
            s.k(values, "values");
            return new JavaOnlyArray(Arrays.copyOf(values, values.length), (DefaultConstructorMarker) null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ JavaOnlyArray(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<?>) list);
    }

    public static final JavaOnlyArray deepClone(ReadableArray readableArray) {
        return INSTANCE.deepClone(readableArray);
    }

    public static final JavaOnlyArray from(List<?> list) {
        return INSTANCE.from(list);
    }

    public static final JavaOnlyArray of(Object... objArr) {
        return INSTANCE.of(objArr);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !s.f(JavaOnlyArray.class, other.getClass())) {
            return false;
        }
        return s.f(this.backingList, ((JavaOnlyArray) other).backingList);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableArray getArray(int index) {
        return (ReadableArray) this.backingList.get(index);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean getBoolean(int index) {
        Object obj = this.backingList.get(index);
        s.i(obj, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) obj).booleanValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public double getDouble(int index) {
        Object obj = this.backingList.get(index);
        s.i(obj, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) obj).doubleValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public Dynamic getDynamic(int index) {
        DynamicFromArray dynamicFromArrayCreate = DynamicFromArray.create(this, index);
        s.j(dynamicFromArrayCreate, "create(...)");
        return dynamicFromArrayCreate;
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int getInt(int index) {
        Object obj = this.backingList.get(index);
        s.i(obj, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) obj).intValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public long getLong(int index) {
        Object obj = this.backingList.get(index);
        s.i(obj, "null cannot be cast to non-null type kotlin.Number");
        return ((Number) obj).longValue();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableMap getMap(int index) {
        return (ReadableMap) this.backingList.get(index);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public String getString(int index) {
        return (String) this.backingList.get(index);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ReadableType getType(int index) {
        Object obj = this.backingList.get(index);
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        throw new IllegalStateException("Invalid type " + obj.getClass() + ")");
    }

    public int hashCode() {
        return this.backingList.hashCode();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public boolean isNull(int index) {
        return this.backingList.get(index) == null;
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushArray(ReadableArray array) {
        this.backingList.add(array);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushBoolean(boolean value) {
        this.backingList.add(Boolean.valueOf(value));
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushDouble(double value) {
        this.backingList.add(Double.valueOf(value));
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushInt(int value) {
        this.backingList.add(Double.valueOf(value));
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushLong(long value) {
        this.backingList.add(Double.valueOf(value));
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushMap(ReadableMap map) {
        this.backingList.add(map);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushNull() {
        this.backingList.add(null);
    }

    @Override // com.facebook.react.bridge.WritableArray
    public void pushString(String value) {
        this.backingList.add(value);
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public int size() {
        return this.backingList.size();
    }

    @Override // com.facebook.react.bridge.ReadableArray
    public ArrayList<Object> toArrayList() {
        return new ArrayList<>(this.backingList);
    }

    public String toString() {
        return this.backingList.toString();
    }

    public /* synthetic */ JavaOnlyArray(Object[] objArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(objArr);
    }

    private JavaOnlyArray(Object... objArr) {
        this.backingList = v.s(Arrays.copyOf(objArr, objArr.length));
    }

    private JavaOnlyArray(List<?> list) {
        this.backingList = new ArrayList(list);
    }

    public JavaOnlyArray() {
        this.backingList = new ArrayList();
    }
}
