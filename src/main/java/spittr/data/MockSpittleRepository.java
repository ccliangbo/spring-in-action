package spittr.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import spittr.Spittle;

@Component
public class MockSpittleRepository implements SpittleRepository {

	@Override
	public List<Spittle> findSpittles(long max, int count) {
		List<Spittle> spittles = new ArrayList<Spittle>();
		for (int i = 0; i < count; i++) {
			spittles.add(new Spittle("Spittle" + i, new Date()));
		}
		return spittles;
	}

	@Override
	public Spittle findOne(long spittleId) {
		return new Spittle("spittle" + spittleId, new Date());
	}

}
