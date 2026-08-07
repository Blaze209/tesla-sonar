package ch.qos.logback.classic.db.names;

/* JADX INFO: loaded from: classes3.dex */
public interface DBNameResolver {
    <N extends Enum<?>> String getColumnName(N n11);

    <N extends Enum<?>> String getTableName(N n11);
}
