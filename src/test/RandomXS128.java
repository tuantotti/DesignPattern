package test;

import java.util.Random;

public class RandomXS128 extends Random {
    private static final double NORM_DOUBLE = 1.1102230246251565E-16D;
    private static final double NORM_FLOAT = 5.9604644775390625E-8D;
    private long seed0;
    private long seed1;

    public RandomXS128() {
        this.setSeed((new Random()).nextLong());
    }

    public RandomXS128(long seed) {
        this.setSeed(seed);
    }

    public RandomXS128(long seed0, long seed1) {
        this.setState(seed0, seed1);
    }

    public long nextLong() {
        long s1 = this.seed0;
        long s0 = this.seed1;
        this.seed0 = s0;
        s1 ^= s1 << 23;
        return (this.seed1 = s1 ^ s0 ^ s1 >>> 17 ^ s0 >>> 26) + s0;
    }

    protected final int next(int bits) {
        return (int) (this.nextLong() & (1L << bits) - 1L);
    }

    public int nextInt() {
        return (int) this.nextLong();
    }

    public int nextInt(int n) {
        return (int) this.nextLong((long) n);
    }

    public long nextLong(long n) {
        if (n <= 0L) {
            throw new IllegalArgumentException("n must be positive");
        } else {
            long bits;
            long value;
            do {
                bits = this.nextLong() >>> 1;
                value = bits % n;
            } while (bits - value + (n - 1L) < 0L);

            return value;
        }
    }

    public double nextDouble() {
        return (double) (this.nextLong() >>> 11) * 1.1102230246251565E-16D;
    }

    public float nextFloat() {
        return (float) ((double) (this.nextLong() >>> 40) * 5.9604644775390625E-8D);
    }

    public boolean nextBoolean() {
        return (this.nextLong() & 1L) != 0L;
    }

    public void setSeed(long seed) {
        long seed0 = murmurHash3(seed == 0L ? -9223372036854775808L : seed);
        this.setState(seed0, murmurHash3(seed0));
    }

    public void setState(long seed0, long seed1) {
        this.seed0 = seed0;
        this.seed1 = seed1;
    }

    public long getState(int seed) {
        return seed == 0 ? this.seed0 : this.seed1;
    }

    private static final long murmurHash3(long x) {
        x ^= x >>> 33;
        x *= -49064778989728563L;
        x ^= x >>> 33;
        x *= -4265267296055464877L;
        x ^= x >>> 33;
        return x;
    }
}
