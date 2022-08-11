


public class AdapterImpl implements Adapter {

	@Override
	public Double twiceOf(Float f) {
		return Math.doubled(f.doubleValue());
	}

	@Override
	public Double halfOf(Float f) {
		return Math.half(f);
	}

}
