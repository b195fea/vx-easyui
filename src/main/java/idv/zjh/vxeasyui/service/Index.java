package idv.zjh.vxeasyui.service;

import org.springframework.stereotype.Service;

import idv.zjh.vxeasyui.model.Person;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("IIndex")
public class Index implements IIndex{

	@Override
	public Person getModel() {
		log.debug("進入Model");
		Person person = new Person();
		person.setId("1");
		person.setId("鍾嘉豪");
		return person;
	}

}
