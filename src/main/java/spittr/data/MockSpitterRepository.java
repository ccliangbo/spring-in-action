package spittr.data;

import org.springframework.stereotype.Component;

import spittr.Spitter;

@Component
public class MockSpitterRepository implements SpitterRepository {

	@Override
	public void save(Spitter spitter) {
		// TODO Auto-generated method stub

	}

	@Override
	public Spitter findByUsername(String username) {
		return new Spitter(username, "password1", "firstname1", "lastname1");
	}

}
