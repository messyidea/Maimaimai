create table `iorder`(
`id` int(10) primary key,
`username` varchar(20),
`shopname` varchar(20),
`itemid` int(10),
`buytime` datetime,
`num` int(10),
`grade` int(10),
`orderdesc` varchar(40)
);
alter table iorder add column `status` varchar(5);
alter table iorder add column `useridea` varchar(50);
